/**
 * 4^AI
 * Masevski
 */
package Giochi;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

public class Breakout extends JPanel implements ActionListener, MouseListener, MouseMotionListener {
	private static final long serialVersionUID = 1L;

	private static String titolo = "Breakout v1.1.1";
	private int velocita = 4;													//velocità pallina
	private int incX = velocita, incY = velocita;								//valore di incremento
	private int pallaX = 0, pallaY = 0;											// x e y pallina
	private int diametroPalla = 10;												//diametro pallina
	private int raggioPalla = diametroPalla/2;									//raggio pallina

	private int posPedanaX = pallaX, posPedanaY = 500;							//posizione pedana
	private int pedanaX=100, pedanaY=20;										//dimensioni pedana

	private boolean inGioco=true;												//controllo stato
	private boolean controlloTocco= true;										//controllo tocco

	private int score;															//punti

	private Image sfondo = Toolkit.getDefaultToolkit().getImage("img/space.png");							//immagine sfondo

	private static BufferedImage cursorImg = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);		//cursore invisibile
	private static Cursor blankCursor = Toolkit.getDefaultToolkit().createCustomCursor(
			cursorImg, new Point(0, 0), "blank cursor");

	Timer timer;																//timer

	public static void main(String args[]) {

		JFrame f = new JFrame(titolo);

		Container c = f.getContentPane();
		Breakout pan = new Breakout();
		c.add(pan);

		f.getContentPane().setCursor(blankCursor);
		f.setSize(800, 600);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		f.pack();
		f.setVisible(true);
	}

	Breakout(){
		super();
		setPreferredSize(new Dimension(800, 600));

		timer = new Timer (10, this);
		timer.start();

		addMouseListener(this);
		addMouseMotionListener(this);
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.drawImage(sfondo, 0, 0, this.getWidth(), this.getHeight(), this);
		g.setColor(Color.YELLOW);

		g.fillOval(pallaX - raggioPalla, pallaY - raggioPalla, diametroPalla, diametroPalla);
		g.fillRoundRect(posPedanaX, posPedanaY, pedanaX, pedanaY, 10, 10);
		g.drawString("score: "+score, 750, 595);

		if(inGioco) {
			g.drawString("Gioco in corso...", 650, 595);
		}
		else {
			g.drawString("Fai click per ricominciare", 320, 300);
			g.drawString("Gioco sospeso...", 650, 595);
		}

		if (pallaX < raggioPalla){				incX = Math.abs(incX); controlloTocco=true;}		//rimbalzo lato sx
		if (pallaX > getWidth() - raggioPalla){	incX = -Math.abs(incX); controlloTocco=true;}		//rimbalzo lato dx
		if (pallaY < raggioPalla){				incY = Math.abs(incY); controlloTocco=true;}		//rimbalzo su
		if (pallaY > getHeight() - raggioPalla){incY = -Math.abs(incY); controlloTocco=true;}		//rimbalzo giù

		/**
		 * Quando la palla tocca pedana la sua velocità aumenta di 1
		 * e il valore di incremento della Y viene negato
		 */

		if((pallaY >= 500) && (pallaY <= 510) && (pallaX>=posPedanaX-2 && pallaX<=posPedanaX+pedanaX+2)) {
			
			if(controlloTocco) {
				
				if(incX>0)
					incX += 1;
				if(incX<0)
					incX -= 1;
				if(incY>0)
					incY += 1;
				if(incY<0)
					incY -= 1;

				incY = -Math.abs(incY);

				score++;
				controlloTocco=false;
			}
		}

		if(pallaY >= 530) {
			timer.stop();
			inGioco=false;

			posPedanaX= 350;
			pallaX= posPedanaX + pedanaX/2;
			pallaY= 500 - 5;

			repaint();

		}
	}
	/**
	 * Ad ogni evento del timer si disegna la palla spostata
	 * in base al valore di incremento
	 */
	public void actionPerformed(ActionEvent e) {
		if(inGioco) {
			pallaX+=incX;
			pallaY+=incY;

			//posPedanaX = pallaX - pedanaX/2;		//God mode

			repaint();
		}
	}

	public void mouseDragged(MouseEvent arg0) {
	}
	/**
	 * La pedana si muove con il mouse al centro
	 */
	public void mouseMoved(MouseEvent arg0) {
		if(inGioco){
			
			posPedanaX = arg0.getX() - pedanaX/2;
			repaint();
		}
	}

	public void mouseClicked(MouseEvent arg0) {	
		if(!inGioco) {
			inGioco=true;
			timer.start();

			pallaX=1;
			pallaY=1;
			incX=velocita;
			incY=velocita;

			score=0;
		}
	}

	public void mouseEntered(MouseEvent arg0) {
	}

	public void mouseExited(MouseEvent arg0) {
	}

	public void mousePressed(MouseEvent arg0) {
	}

	public void mouseReleased(MouseEvent arg0) {
	}
}