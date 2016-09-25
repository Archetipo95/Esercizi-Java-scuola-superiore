/**
 * Masevski Fipponi
 */
package PingPong;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class Palla implements Runnable, KeyListener{

	private int pallaX, pallaY;
	private int deltaX, deltaY;
	final int diametro = 20;											//diametro palla
	private int width, height;
	final Color c = new Color(25, 255, 0);								//colore verde fluo
	private MainPong pannello;

	private boolean inGioco;
	private boolean primoTiro = true;
	private int attesa;

	private int pedana1X, pedana1Y, pedana2X, pedana2Y;
	final int pedanaLarg = 20;											//larghezza pedana
	final int pedanaLung = 100;											//lunghezza pedana
	private boolean pedana1su, pedana1giu, pedana2su, pedana2giu;
	private int pedanaVel = 4;

	private boolean punto;
	private int punto1, punto2;
	
	private boolean respingi = true;


	//Costruttore
	public Palla(MainPong pannello, int width, int height) {
		this.pannello = pannello;
		this.width = width;
		this.height = height;

		pallaX = width / 2 - diametro/2;						//centrare palla
		pallaY = height / 2 - diametro/2;						//""""""""""""""
		deltaX = 5;												//velocità palla
		deltaY = 2;
		pedana1X = 10;											//centrare pedana
		pedana2X = width - pedana1X - pedanaLarg;				//"""""""""""""""
		pedana1Y = (height / 2) - (pedanaLung / 2);				//"""""""""""""""
		pedana2Y = (height / 2) - (pedanaLung / 2);				//"""""""""""""""

		pedana1su = false;
		pedana1giu = false;
		pedana2su = false;
		pedana2giu = false;

		punto = false;
		punto1 = 0;
		punto2 = 0;

	}

	public synchronized void start() {
		inGioco = true;
		new Thread(this).start();
	}

	public synchronized void stop() {
		inGioco = false;
		System.exit(0);
	}

	//Metodo run
	public void run() {

		while (inGioco) {

			if(primoTiro) {
				attesa = 1000;
			}
			if(punto){
				attesa = 500;
			}
			else
				attesa = 16;
			try {
				Thread.sleep(attesa);
			} catch (InterruptedException e) {System.out.println(e);}

			pedane();
			rimbalziPedana();
			rimbalziBordo();
			pannello.repaint();
		}
	}

	//Metodo per gestione rimbalzi palla
	public void rimbalziBordo() {
		//Direzione palla casuale per primo tiro
		if(primoTiro || punto){
			Random random = new Random();
			int casuale = random.nextInt(3);;

			pallaX = width / 2 - diametro/2;
			pallaY = height / 2 - diametro/2;

			if(casuale==0) {
				deltaX = +deltaX;
				deltaY = +deltaY;
			}
			else if(casuale==1) {
				deltaY = -deltaY;
			}
			else if(casuale==2) {
				deltaX = -deltaX;
			}
			else if(casuale==3) {
				deltaX = -deltaX;
				deltaY = -deltaY;
			}
			punto = false;
			primoTiro = false;
			respingi = true;
		}
		else {
			pallaX+= deltaX;
			pallaY+= deltaY;
	
			
			if (pallaX <= 0){						// rimbalzo sx
				punto = true;
				punto2++;
			}

			if (pallaX + diametro >= width) {		// rimbalzo dx
				punto = true;
				punto1++;
			}

			if (pallaY <= 0)						// rimbalzo giu
				deltaY = -deltaY;

			if (pallaY + diametro >= height)		// rimbalzo su
				deltaY = -deltaY;
			
		}
	}

	//Metodo movimento pedane
	public void pedane() {
		
//		if(pallaX>width/2)
//			pedana2Y = pallaY + diametro/2 - pedanaLarg;
		
		
		if(pedana1su && pedana1Y>0) {
			pedana1Y -= pedanaVel;
		}
		if(pedana1giu && pedana1Y < height - pedanaLung) {
			pedana1Y += pedanaVel;
		}
		if(pedana2su && pedana2Y>0) {
			pedana2Y -= pedanaVel;
		}
		if(pedana2giu && pedana2Y < height - pedanaLung) {
			pedana2Y += pedanaVel;
		}

		
	}

	//Metodo rimbalzo palla su pedane
	public void rimbalziPedana() {
		
		if(pallaX < pedana1X + pedanaLarg &&  !(pallaY + diametro/2 > pedana1Y && pallaY + diametro/2 < pedana1Y + pedanaLung)){
			respingi = true;
		}
		if(pallaX > pedana2X  &&  !(pallaY + diametro/2 > pedana2Y && pallaY + diametro/2 < pedana2Y + pedanaLung)){
			respingi = true;
		}
		
		if (pallaX <= pedana1X + pedanaLarg && (pallaY + diametro/2 > pedana1Y && pallaY + diametro/2 < pedana1Y + pedanaLung) && respingi) {
			deltaX = -deltaX;
		}
		if (pallaX + diametro >= pedana2X && (pallaY + diametro/2 > pedana2Y && pallaY + diametro/2 < pedana2Y + pedanaLung) && respingi) {
			deltaX = -deltaX;
		}

	}

	//Metodo pain
	public void disegna(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
//		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,						//antialiasing
//				RenderingHints.VALUE_ANTIALIAS_ON);

		//campo
		g2.setColor(Color.WHITE);													//colore bianco
		g2.drawLine(width/2-1, 0, width/2-1, height);								//linea centro campo
		g2.drawLine(pedana1X+pedanaLarg+1, 0, pedana1X+pedanaLarg+1, height);		//linea dx
		g2.drawLine(pedana2X-2, 0, pedana2X-2, height);								//linea sx
		g2.fillOval(width/2-diametro/2, height/2-diametro/2, diametro, diametro);	//cerchio centro campo

		//punti
		g2.setFont(new Font("Arial Black", Font.PLAIN, 20));
		g2.drawString(""+punto1, width/2 - 40, 18);
		g2.drawString(""+punto2, width/2 + 30, 18);

		//oggetti
		g2.setColor(c);																//colore verde
		g2.fillOval(pallaX, pallaY, diametro, diametro);							//palla

		g2.fillRoundRect(pedana1X, pedana1Y, pedanaLarg, pedanaLung, 10, 10);		//pedana1
		g2.fillRoundRect(pedana2X, pedana2Y, pedanaLarg, pedanaLung, 10, 10);		//pedana2

	}

	//Controllo tasti
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();

		// Controllo pedana 1 pressione su e giu
		if (keyCode == KeyEvent.VK_W) {
			pedana1su= true;
		}
		if (keyCode == KeyEvent.VK_S) {
			pedana1giu= true;
		}

		// Controllo pedana 2 pressione su e giu
		if (keyCode == KeyEvent.VK_UP) {
			pedana2su= true;
		}
		if (keyCode == KeyEvent.VK_DOWN) {
			pedana2giu= true;
		}

		// Per uscire dal gioco premere esc
		if (keyCode == KeyEvent.VK_ESCAPE) {
			System.exit(0);
		}
	}

	public void keyReleased(KeyEvent e) {
		int keyCode = e.getKeyCode();

		// Controllo pedana 1 rilascio su e giu
		if (keyCode == KeyEvent.VK_W) {
			pedana1su = false;
		}
		if (keyCode == KeyEvent.VK_S) {
			pedana1giu = false;
		}

		// Controllo pedana 2 rilascio su e giu
		if (keyCode == KeyEvent.VK_UP) {
			pedana2su = false;
		}
		if (keyCode == KeyEvent.VK_DOWN) {
			pedana2giu = false;
		}

	}

	public void keyTyped(KeyEvent e) {

	}

}