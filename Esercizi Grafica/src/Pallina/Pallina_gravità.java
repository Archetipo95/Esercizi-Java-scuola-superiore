package Pallina;
/**
 * 4^AI
 * Masevski, Fipponi
 */

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Pallina_gravità extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	private int dx1=1, dy1=1;		//valore di incremento x img1
	private int x1=10,y1=10;
	private int salto=3;
	Timer timer;
	
	public static void main(String args[]) {

		JFrame f = new JFrame("Prove Grafica");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = f.getContentPane();
		Pallina_gravità pan = new Pallina_gravità();
		c.add(pan);
		f.pack();
		f.setVisible(true);
	}
	
	Pallina_gravità(){
		setPreferredSize(new Dimension(300, 350));
		timer = new Timer (5, this);												//TIK timer
		timer.start();
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Image img1 = Toolkit.getDefaultToolkit().getImage("img/pallina.png");

		int raggio_img=5;
		
		if (x1 < raggio_img)				dx1 = Math.abs(dx1);            //rimbalzo lato sx
		if (x1 > getWidth() - raggio_img)	dx1 = -Math.abs(dx1);			//rimbalzo lato dx
		if (y1 < raggio_img)				dy1 = Math.abs(dy1);			//rimbalzo su
		if (y1 > getHeight() - raggio_img)	dy1 = -Math.abs(dy1);			//rimbalzo giù
		
		x1+=dx1;
		if(dy1<0){
			while(y1>salto){
			System.out.println(y1);
			y1+=dy1;
			salto--;
			}
		}
		else y1+=dy1;
		
		
		g.drawImage(img1, x1 - raggio_img, y1 - raggio_img, this);			//pallina1
	}

	public void actionPerformed(ActionEvent e) {
		repaint();
	}
}