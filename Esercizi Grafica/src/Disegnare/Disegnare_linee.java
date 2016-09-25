package Disegnare;
/**
 * Masevski
 */

import javax.swing.*;
import java.awt.*;

public class Disegnare_linee extends JPanel {
	private static final long serialVersionUID = 1L;

	Disegnare_linee(){
		setPreferredSize(new Dimension(200, 200));
	}

	protected void paintComponent(Graphics g) {
		//SFONDO
		super.paintComponent(g);
		//this.getWidth()
		//this.getHeight()
		int xver=10, yver=0;
		int xori=0, yori=10;
		int linea=10;
		for(int i=0;i<100;i++) {
			g.drawLine(xver,yver,linea,this.getWidth());
			g.drawLine(xori,yori,this.getHeight(),linea);
			xver+=10;
			yori+=10;
			linea+=10;
		}
	}
	//MAIN
	public static void main(String args[]) {

		JFrame f = new JFrame("Prove Grafica");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = f.getContentPane();
		Disegnare_linee pan = new Disegnare_linee();
		c.add(pan);
		f.pack();
		f.setVisible(true);
	}
}