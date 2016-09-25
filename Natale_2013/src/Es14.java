/**
 * 
 * @author Martin Masevski 4ai
 * 
 * XXX
 *
 */
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class Es14 implements ActionListener
{
	JTextField t;
	JLabel lbl, lbl2;
	JButton btn;
	int x, tentativi = 0;
	String titolo;

	public Es14()
	{
		titolo = "Esercizio 11";
		JFrame win = new JFrame(titolo);
		Container c = win.getContentPane();
		c.setLayout(new GridLayout(4,1));

		 lbl2 = new JLabel("Indovina il numero da 0 a 1000");
		c.add(lbl2);
		
		t = new JTextField();
		c.add(t);

		lbl = new JLabel("Tentativi");
		c.add(lbl);

		btn = new JButton("Conferma");
		btn.addActionListener(this);
		c.add(btn);

		x = (int) (Math.random() * 1000);

		win.setSize(500, 150);
		win.setVisible(true);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) 
	{
		new Es14();
	}

	public void actionPerformed(ActionEvent evt) 
	{
		tentativi ++;

		int numero = Integer.parseInt(t.getText());
		if(numero == x)
		{
			lbl.setText(tentativi + "");
			JOptionPane.showMessageDialog(null, "Complimenti! Hai indovinato con " + tentativi + " tentativi!");
		}
		else
		{
			if(numero<x)
			{
				JOptionPane.showMessageDialog(null, "Hai sbagliato! Il numero è più grande di quello che hai inserito!");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Hai sbagliato! Il numero è più piccolo di quello che hai inserito!");
			}
		}
	}
}