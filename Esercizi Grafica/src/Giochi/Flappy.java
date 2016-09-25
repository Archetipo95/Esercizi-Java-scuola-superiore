package Giochi;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class Flappy extends JPanel implements ActionListener, MouseListener, MouseMotionListener {

	private static final long serialVersionUID = 1L;

	private static String titolo = "Flappy 0.3";
	private static JFrame frame;
	static int x = 1000;
	static int y = 750;
	//	private static BufferedImage MouseInvisibileImg = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);
	//	private static Cursor MouseInvisibile = Toolkit.getDefaultToolkit().createCustomCursor(MouseInvisibileImg, new Point(0, 0), "Mouse Invisibile");



	private Timer timer;

	private Image sfondo = Toolkit.getDefaultToolkit().getImage("img/hills.png");
	private Image terreno = Toolkit.getDefaultToolkit().getImage("img/terreno.png");
	private Image tubo_giu = Toolkit.getDefaultToolkit().getImage("img/tubo_giu.png");
	private Image tubo_su = Toolkit.getDefaultToolkit().getImage("img/tubo_su.png");
	private Image bird = Toolkit.getDefaultToolkit().getImage("img/bird.png");


	public static void main(String args[]) {

		frame = new JFrame(titolo);

		Container c = frame.getContentPane();
		Flappy pan = new Flappy();
		c.add(pan);

		//frame.getContentPane().setCursor(MouseInvisibile);
		frame.setSize(x, y);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.pack();
		frame.setVisible(true);
	}

	Flappy() {
		super();
		setPreferredSize(new Dimension(x, y));

		timer = new Timer (10, this);
		timer.start();

		addMouseListener(this);
		addMouseMotionListener(this);
	}

	int larghezzaTubo = 100;
	int distanzaTubo = 200;
	int altezzaTerreno = 100;
	
	int range =  (y - altezzaTerreno - distanzaTubo - (y*10/100)) - ((y*10/100)+1);
	
	
	int altezzaTubo1 = (int)(Math.random()*range) + (y*10/100) ;
	int posXTubo1 = x + larghezzaTubo;

	int altezzaTubo2 = (int)(Math.random()*range) + (y*10/100);
	int posXTubo2 = x + larghezzaTubo;

	int altezzaTubo3 = (int)(Math.random()*range) + (y*10/100);
	int posXTubo3 = x + larghezzaTubo;

	boolean prossimo1 = false, prossimo2 = false, prossimo3 = true;

	int birdX = 50;
	int birdY = 10;
	
	int velocita = 5;
	
	boolean salta = false;

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.drawImage(sfondo, 0, 0, 200, getHeight(), this);
		g.drawImage(sfondo, 200, 0, 200, getHeight(), this);
		g.drawImage(sfondo, 400, 0, 200, getHeight(), this);
		g.drawImage(sfondo, 600, 0, 200, getHeight(), this);
		g.drawImage(sfondo, 800, 0, 200, getHeight(), this);
		
		if(prossimo3) {
			g.drawImage(tubo_giu, posXTubo1, 0, larghezzaTubo, altezzaTubo1, this);
			g.drawImage(tubo_su, posXTubo1, altezzaTubo1 + distanzaTubo, larghezzaTubo, y, this);

			posXTubo1-= velocita;

			if(posXTubo1 < 0 - larghezzaTubo) {
				prossimo3 = false;
				posXTubo1 = x;
				altezzaTubo1 = (int)(Math.random()*range) + (y*10/100) ;
			}
			if(posXTubo1 < x/2) {
//GOD MODE
//				birdY = altezzaTubo1 + 25;
				prossimo1 = true;
			}
		}

		if(prossimo1) {
			g.drawImage(tubo_giu, posXTubo2, 0, larghezzaTubo, altezzaTubo2, this);
			g.drawImage(tubo_su, posXTubo2, altezzaTubo2 + distanzaTubo, larghezzaTubo, y - 100, this);

			posXTubo2-= velocita;

			if(posXTubo2 < 0 - larghezzaTubo) {
				prossimo1 = false;
				posXTubo2 = x;
				altezzaTubo2 = (int)(Math.random()*range) + (y*10/100) ;
			}
			if(posXTubo2 < x/2) {
//GOD MODE
//				birdY = altezzaTubo2 + 25;
				prossimo2 = true;
			}
		}

		if(prossimo2) {
			g.drawImage(tubo_giu, posXTubo3, 0, larghezzaTubo, altezzaTubo3, this);
			g.drawImage(tubo_su, posXTubo3, altezzaTubo3 + distanzaTubo, larghezzaTubo, y - 100, this);

			posXTubo3-= velocita;

			if(posXTubo3 < 0 - larghezzaTubo) {
				prossimo2 = false;
				posXTubo3 = x;
				altezzaTubo3 = (int)(Math.random()*range) + (y*10/100) ;
//				velocita+=1;
			}
			if(posXTubo3 < x/2) {
//GOD MODE
//				birdY = altezzaTubo3 + 25;
				prossimo3 = true;
			}
		}
		
//GOD MODE velocità max 63
//		birdX = 100;
		birdX = 300;
		

		g.drawImage(bird, birdX, birdY, 50, 50, this);
		

			birdY += 3;
		if(salta) {
			for(int i=0; i<45; i++)
			birdY -= 2;
			salta = false;
		}
		
		if(birdY <= altezzaTubo1 && birdX + 45 > posXTubo1 && birdX - 3 < posXTubo1 + larghezzaTubo) {
			timer.stop();
		}
		
		if(birdY + 50 >= altezzaTubo1 + distanzaTubo && birdX + 45 > posXTubo1 && birdX - 3< posXTubo1 + larghezzaTubo) {
			timer.stop();
		}
		
		if(birdY <= altezzaTubo2 && birdX + 45 > posXTubo2 && birdX - 3 < posXTubo2 + larghezzaTubo) {
			timer.stop();
		}
		
		if(birdY + 50 >= altezzaTubo2 + distanzaTubo && birdX + 45 > posXTubo2 && birdX - 3< posXTubo2 + larghezzaTubo) {
			timer.stop();
		}
		
		if(birdY <= altezzaTubo3 && birdX + 45 > posXTubo3 && birdX - 3 < posXTubo3 + larghezzaTubo) {
			timer.stop();
		}
		
		if(birdY + 50 >= altezzaTubo3 + distanzaTubo && birdX + 45 > posXTubo3 && birdX - 3 < posXTubo3 + larghezzaTubo) {
			timer.stop();
		}
		
		if(birdY + 50 >= y - altezzaTerreno) {
			timer.stop();
		}
		
		g.drawImage(terreno, 0, y - 100, x * 1/4, 100, this);
		g.drawImage(terreno, 0, y - 100, x * 2/4, 100, this);
		g.drawImage(terreno, 0, y - 100, x * 3/4, 100, this);
		g.drawImage(terreno, 0, y - 100, x * 4/4, 100, this);

	}

	public void actionPerformed(ActionEvent arg0) {	
		repaint();
	}

	public void mouseDragged(MouseEvent arg0) {
	}

	public void mouseMoved(MouseEvent arg0) {
	}

	public void mouseClicked(MouseEvent arg0) {
	}

	public void mouseEntered(MouseEvent arg0) {
	}

	public void mouseExited(MouseEvent arg0) {
	}

	public void mousePressed(MouseEvent arg0) {
		salta = true;
	}

	public void mouseReleased(MouseEvent arg0) {
	}
}