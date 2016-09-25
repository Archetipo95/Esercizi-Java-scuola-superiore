package Palline;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class PallinaIndipendente implements Runnable, ActionListener{

	private int x, y, dx, dy;
	private int diam = 15;// diametro pallina
	private Color c;
	private PannelloPalline p;
	private Timer t;
	private Thread th;

	public PallinaIndipendente(PannelloPalline p) {
		this.p = p;
		x = (int) (Math.random() * 500);//punto di partenza x
		y = (int) (Math.random() * 500);//punto di partenza y
		dx = (int) (Math.random() * 5+1);//velocità asse x
		dy = (int) (Math.random() * 5+1);//velocità asse y
		th = new Thread(this);
		th.start();
		t=new Timer((int)(Math.random()*7+1),this);
		t.start();
		c = new Color((int) (Math.random() * 256), (int) (Math.random() * 256),
				(int) (Math.random() * 256));
	}

	public void run() {

		while (true) {
			try {
				Thread.sleep(5 + (int) (Math.random() * 5));
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			x += dx;
			y += dy;

			if (x <= 0)// rimbalzo sx
				dx = -dx;

			if (x + diam >= p.getWidth())// rimbalzo dx
				dx = -dx;

			if (y <= 0)// rimbalzo giu
				dy = -dy;

			if (y + diam >= p.getHeight())// rimbalzo su
				dy = -dy;

			p.repaint();
		}
	}

	protected void disegnaPallina(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
		RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setColor(c);
		g2.fillOval((int) x, (int) y, diam, diam);
	}

	
	public void actionPerformed(ActionEvent arg0) {
		
	}

	
}