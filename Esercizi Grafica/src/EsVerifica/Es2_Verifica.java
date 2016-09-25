package EsVerifica;
/**
 * 4^AI
 * Masevski, Fipponi
 */

import java.awt.*;
import javax.swing.*;

import java.awt.event.*;

public class Es2_Verifica implements ActionListener {
	
	
	JFrame win;
	Container c;
	JButton butt;
	JLabel lbl;
	
	public Es2_Verifica()
	{
		win = new JFrame("Eserczio2");
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		c = win.getContentPane();
		c.setLayout(new GridLayout());
		
		butt = new JButton("Clicca");	
		butt.addActionListener(this);
		c.add(butt);
		
		lbl = new JLabel();
		c.add(lbl);
		
		win.pack();
		win.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		int n;
		n = (int)(Math.random()*2);
		
		if(n==0)
			lbl.setText("Testa");
		
		if(n==1)
			lbl.setText("Croce");
	}

	public static void main(String[] args) {
		new Es2_Verifica();
	}
}