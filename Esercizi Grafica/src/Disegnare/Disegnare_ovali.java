package Disegnare;
/**
 * Masevski
 */

import javax.swing.*;

import java.awt.*;

public class Disegnare_ovali extends JPanel {
	private static final long serialVersionUID = 1L;

	Disegnare_ovali(){
		setPreferredSize(new Dimension(200, 200));
	}

	protected void paintComponent(Graphics g) {
		//SFONDO
		super.paintComponent(g);
		//this.getWidth()
		//this.getHeight()
		
		g.setColor(Color.green);
		g.drawOval(20,20, 100, 100);
		g.fillOval(20,20, 100, 100);

	}
	//MAIN
	public static void main(String args[]) {

		JFrame f = new JFrame("Prove Grafica");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = f.getContentPane();
		Disegnare_ovali pan = new Disegnare_ovali();
		c.add(pan);
		f.pack();
		f.setVisible(true);
	}
}
