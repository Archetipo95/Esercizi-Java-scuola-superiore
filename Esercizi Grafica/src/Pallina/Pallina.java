package Pallina;
/**
 * Masevski
 */

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Pallina extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	int dx1=2;		//velocità img1
	int dy1=2;		//velocità img1
	int x1=0,y1=0;
	
	//MAIN
	public static void main(String args[]) {

		JFrame f = new JFrame("Prove Grafica");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = f.getContentPane();
		Pallina pan = new Pallina();
		c.add(pan);
		f.pack();
		f.setVisible(true);
	}
	
	Pallina(){
		setPreferredSize(new Dimension(800, 150));
	}

	protected void paintComponent(Graphics g) {
		//this.getWidth()
		//this.getHeight()
		super.paintComponent(g);
		
		Image img1 = Toolkit.getDefaultToolkit().getImage("img/pallina.png");
		//four attributes: the image, x/y position, an image observer

		Timer timer = new Timer (200, this);
		timer.start();
		int raggio_img=5;
		
		x1+=dx1;
		y1+=dy1;
		
		if (x1 < raggio_img)			dx1 = Math.abs(dx1);
		if (x1 > getWidth() - raggio_img)	dx1 = -Math.abs(dx1);
		if (y1 < raggio_img)			dy1 = Math.abs(dy1);
		if (y1 > getHeight() - raggio_img)	dy1 = -Math.abs(dy1);

		g.drawImage(img1, x1 - raggio_img, y1 - raggio_img, this);			//pallina1
		
	}

	public void actionPerformed(ActionEvent e) {		
		repaint();
	}
}