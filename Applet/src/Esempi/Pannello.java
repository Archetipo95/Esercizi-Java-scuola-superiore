package Esempi;

import java.awt.*;
import javax.swing.JPanel;


public class Pannello extends JPanel {

	private static final long serialVersionUID = 1L;

	// vogliamo che il pannello disegni
	// ridefinisco paintComponent della classe JComponent


	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		int w = getWidth();
		int h = getHeight();
		
		g.setColor(Color.white);
		g.fillRect(0,0,w,h);
		
		g.setColor(Color.red);
		g.drawRect(0,0,w-1,h-1);
		g.setColor(Color.black);
		
		for(int i=0; i<3; ++i)
		{
			Color col = new Color((float) Math.random(), (float) Math.random(), (float) Math.random(), 0.2f);
			g.setColor(col);
			g.fillOval(i*20, i*20, 40, 40);
		}
	}
}