
import java.awt.Container;

import javax.swing.*;
public class ClicFinestra {
	public static void main(String[] args) {
		JFrame win = new JFrame();
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = win.getContentPane();
		c.add(new ClicPannelloMostraTuttiIPunti());
		win.setSize(300, 400); 
		
		win.setVisible(true);
	}
}
