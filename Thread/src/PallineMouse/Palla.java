package PallineMouse;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Palla implements Runnable, ActionListener{

	public int x, y, xMouse, yMouse;					//posizioni (x,y)
	private int diam = 15;								// diametro palla
	private Color c;									//colore
	private Pannello p;									//pannello
	private Thread thread;
	
	public Palla(Pannello p) {
		super();
		this.p = p;
		x = (int) (Math.random() * 500+1);				//punto di partenza x
		y = (int) (Math.random() * 500+1);				//punto di partenza y
		
		
		thread = new Thread(this);
		thread.start();

		c = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
	}

	public void run() {

		while (true) {
			try {
				Thread.sleep(5 + (int) (Math.random() * 5));
			} catch (InterruptedException e) { System.out.println("ERRORE"); }
			
			x = p.getMouseX();
			y = p.getMouseY();
			
			p.repaint();
		}
	}

	protected void disegnaPallina(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);		//antialiasing
		g2.setColor(c);
		g2.fillOval((int) x, (int) y, diam, diam);
	}

	public void actionPerformed(ActionEvent arg0) {
		
	}
}