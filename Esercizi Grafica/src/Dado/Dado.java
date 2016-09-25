/**
 * 	Fipponi, Masevski
 * 	4^AI
 * 	08/02/2014
 */
package Dado;

import javax.swing.*;
import java.awt.*;

public class Dado extends JPanel {
	private static final long serialVersionUID = 1L;
	int faccia;
	int modulo=10;
	int ndadi;

	public int getFaccia() {
		return faccia;
	}

	public void setFaccia(int faccia) {
		this.faccia = faccia;
	}

	Dado()
	{
		setMinimumSize(new Dimension(7*modulo, 7*modulo));
		setPreferredSize(new Dimension(7*modulo, 7*modulo));
	}


	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		int x, y;

		g.drawRoundRect(0, 0, 7*modulo-1, 7*modulo-1, modulo/2, modulo/2);     

		if(faccia==1){
			x=3; y=3;
			g.fillOval(x*modulo, y*modulo, modulo, modulo); 
			repaint();
		}
		if(faccia==2){
			x=1; y=5;
			g.fillOval(x*modulo, y*modulo, modulo, modulo); 
			x=5; y=1;
			g.fillOval(x*modulo, y*modulo, modulo, modulo);
			repaint();
		} 
		if(faccia==3){
			x=3; y=3;
			g.fillOval(x*modulo, y*modulo, modulo, modulo); 
			x=5; y=1;
			g.fillOval(x*modulo, y*modulo, modulo, modulo);
			x=1; y=5;
			g.fillOval(x*modulo, y*modulo, modulo, modulo);
			repaint();
		}
		if(faccia==4){
			x=1; y=1;
			g.fillOval(x*modulo, y*modulo, modulo, modulo); 
			x=5; y=1;
			g.fillOval(x*modulo, y*modulo, modulo, modulo);
			x=5; y=5;
			g.fillOval(x*modulo, y*modulo, modulo, modulo);
			x=1; y=5;
			g.fillOval(x*modulo, y*modulo, modulo, modulo);
			repaint();
		}
		if(faccia==5){
			x=1; y=1;
			g.fillOval(x*modulo, y*modulo, modulo, modulo); 
			repaint();
			x=5; y=1;
			g.fillOval(x*modulo, y*modulo, modulo, modulo);
			repaint();
			x=3; y=3;
			g.fillOval(x*modulo, y*modulo, modulo, modulo);
			repaint();
			x=1; y=5;
			g.fillOval(x*modulo, y*modulo, modulo, modulo);
			repaint();
			x=5; y=5;
			g.fillOval(x*modulo, y*modulo, modulo, modulo);
			repaint();
		}
		if(faccia==6){
			x=1; y=1;
			g.fillOval(x*modulo, y*modulo, modulo, modulo); 
			x=5; y=1;
			g.fillOval(x*modulo, y*modulo, modulo, modulo);
			x=1; y=3;
			g.fillOval(x*modulo, y*modulo, modulo, modulo);
			x=5; y=3;
			g.fillOval(x*modulo, y*modulo, modulo, modulo);
			x=1; y=5;
			g.fillOval(x*modulo, y*modulo, modulo, modulo);
			x=5; y=5;
			g.fillOval(x*modulo, y*modulo, modulo, modulo);
			repaint();
		}
		repaint();
	}
}