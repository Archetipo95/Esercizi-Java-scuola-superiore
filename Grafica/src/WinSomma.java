/**
 * Masevski Fipponi
 * @author 4ai
 *
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WinSomma implements ActionListener {
	JTextField src;
	JTextField src2;
	JLabel dst;
	public WinSomma() {
		JFrame win = new JFrame("Somma");
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = win.getContentPane();
		c.setLayout(new GridLayout(4,1));
		src = new JTextField("0");
		//src.setHorizontalAlignment(JTextField.RIGHT);
		c.add(src); // campo di inserimento
		src2 = new JTextField("0");
		c.add(src2);
		JButton bMai = new JButton("Somma");
		bMai.addActionListener(this);
		c.add(bMai); // bottone di comando
		dst = new JLabel("Risultato");
		c.add(dst); // etichetta destinazione

		win.setSize(500,300);
		win.setVisible(true);
	}
	public void actionPerformed(ActionEvent arg0){
		try{
			String s;
			int n1,n2,somma;
			s = src.getText();
			n1 = Integer.parseInt(s);
			s = src2.getText();
			n2 = Integer.parseInt(s);
			somma = n1 + n2;
			s = "";
			s = s + somma;
			dst.setText(s);
		}
		catch(NumberFormatException nfe)
		{
			dst.setText("Errore!!!");
		}
	}

	public static void main(String[] args) {
		new WinSomma();
	}
}







