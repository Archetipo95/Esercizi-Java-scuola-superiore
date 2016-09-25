package EsVerifica;
/**
 * 4^AI
 * Masevski, Fipponi
 */

import java.awt.*;
import javax.swing.*;

public class Es1_Verifica  {
	public static void main(String[] args) {
	JFrame win;
	Container c;
	JLabel lbl;
	
	int r = (int)(Math.random()*256);
	int g = (int)(Math.random()*256);
	int b = (int)(Math.random()*256);
	
	win = new JFrame("Esercizio1");
	win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	c = win.getContentPane();
	Color randomColor = new Color(r, g, b);
	
	lbl = new JLabel ("Davide Martin");
	lbl.setForeground(randomColor);
	c.add(lbl);
	
	win.pack();
	win.setVisible(true);
			
	}

}
