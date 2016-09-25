package Disegnare;
/**
 * Masevski
 */

import javax.swing.*;

import java.awt.*;

public class Disegnare_rettangoli extends JPanel {
	private static final long serialVersionUID = 1L;

	Disegnare_rettangoli(){
		setPreferredSize(new Dimension(600, 600));
	}

	protected void paintComponent(Graphics g) {
		//SFONDO
		super.paintComponent(g);
		//this.getWidth()
		//this.getHeight()
		
//		int h = this.getHeight();				//Prova ridimensionamento
//		if(h!=this.getWidth())
//			this.setSize(h, h);
		
		int qx1 = this.getWidth()/8;
		int qy1 = this.getHeight()/8;
		
		int x=0;
		for(int i=0;i<4;i++) {
			g.setColor(Color.black);

			g.fillRect(x , 0, qx1, qy1);
			g.fillRect(x+qx1, qy1, qx1, qy1);
			g.fillRect(x , qy1*2, qx1, qy1);
			g.fillRect(x+qx1, qy1*3, qx1, qy1);
			g.fillRect(x , qy1*4, qx1, qy1);
			g.fillRect(x+qx1, qy1*5, qx1, qy1);
			g.fillRect(x , qy1*6, qx1, qy1);
			g.fillRect(x+qx1, qy1*7, qx1, qy1);

			x+=qx1*2;
		}
		qx1 = this.getWidth()/8;
		qy1 = this.getHeight()/8;
		x=0;
		for(int i=0;i<4;i++) {
			g.setColor(Color.white);
			
			g.fillRect(x+qx1   , 0, qx1, qy1);
			g.fillRect(x, qy1, qx1, qy1);
			g.fillRect(x+qx1   , qy1*2, qx1, qy1);
			g.fillRect(x, qy1*3, qx1, qy1);
			g.fillRect(x+qx1   , qy1*4, qx1, qy1);
			g.fillRect(x, qy1*5, qx1, qy1);
			g.fillRect(x+qx1   , qy1*6, qx1, qy1);
			g.fillRect(x, qy1*7, qx1, qy1);

			x+=qx1*2;
		}

	}
	//MAIN
	public static void main(String args[]) {

		JFrame f = new JFrame("Prove Grafica");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = f.getContentPane();
		Disegnare_rettangoli pan = new Disegnare_rettangoli();
		c.add(pan);
		//f.setResizable(false);			//se voglio che resti non ridimensionabile
		f.pack();
		f.setVisible(true);
	}
}