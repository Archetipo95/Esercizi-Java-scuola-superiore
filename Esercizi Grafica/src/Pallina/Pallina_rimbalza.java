package Pallina;
/**
 * 4^AI
 * Masevski, Fipponi
 */

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Pallina_rimbalza extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	int dx1=1, dy1=1;		//valore di incremento x img1
	int x1=0,y1=0;
	Timer timer;
	
	public static void main(String args[]) {

		JFrame f = new JFrame("Prove Grafica");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = f.getContentPane();
		Pallina_rimbalza pan = new Pallina_rimbalza();
		c.add(pan);
		f.pack();
		f.setVisible(true);
	}
	
	Pallina_rimbalza(){
		setPreferredSize(new Dimension(300, 350));
		timer = new Timer (5, this);
		timer.start();
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Image img1 = Toolkit.getDefaultToolkit().getImage("img/pallina.png");

		int raggio_img=5;
		
		x1+=dx1*4;           //velocità moltiplicata x4
		y1+=dy1*4;
		
		if (x1 < raggio_img)				dx1 = 1;            //rimbalzo lato sx
		if (x1 > getWidth() - raggio_img)	dx1 = -1;			//rimbalzo lato dx
		if (y1 < raggio_img)				dy1 = 1;			//rimbalzo su
		if (y1 > getHeight() - raggio_img)	dy1 = -1;			//rimbalzo giù

		g.drawImage(img1, x1 - raggio_img, y1 - raggio_img, this);			//pallina1
	}

	public void actionPerformed(ActionEvent e) {		
		repaint();
	}
}