package Disegnare;
/**
 * Masevski
 */

import javax.swing.*;

import java.awt.*;

public class Disegnare_immagini extends JPanel {
	private static final long serialVersionUID = 1L;

	Disegnare_immagini(){
		setPreferredSize(new Dimension(200, 200));
	}

	protected void paintComponent(Graphics g) {
		//SFONDO
		super.paintComponent(g);
		//this.getWidth()
		//this.getHeight()
		
		Image img1 = Toolkit.getDefaultToolkit().getImage("img/impronte.png");
		//four attributes: the image, x/y position, an image observer
		g.drawImage(img1, 10, 10, this);
	}
	//MAIN
	public static void main(String args[]) {

		JFrame f = new JFrame("Prove Grafica");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = f.getContentPane();
		Disegnare_immagini pan = new Disegnare_immagini();
		c.add(pan);
		f.pack();
		f.setVisible(true);
	}
}
