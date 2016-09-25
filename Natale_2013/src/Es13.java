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

public class Es13 implements ActionListener
{
	JTextField txt;
	JLabel lbl;
	JButton btn;
	String titolo;

	public Es13()
	{
		titolo = "Esercizio 11";
		JFrame win = new JFrame(titolo);
		Container c = win.getContentPane();
		c.setLayout(new GridLayout(3,1));

		txt = new JTextField();
		c.add(txt);

		lbl = new JLabel("Mese");
		c.add(lbl);

		btn = new JButton("Converti");
		btn.addActionListener(this);
		c.add(btn);

		win.setSize(500, 150);
		win.setVisible(true);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent evt) 
	{
		if(txt.getText().equals("01"))
		{
			lbl.setText("Gennaio");
		}
		else if(txt.getText().equals("02"))
		{
			lbl.setText("Febbraio");
		}
		else if(txt.getText().equals("03"))
		{
			lbl.setText("Marzo");
		}
		else if(txt.getText().equals("04"))
		{
			lbl.setText("Aprile");
		}
		else if(txt.getText().equals("05"))
		{
			lbl.setText("Maggio");
		}
		else if(txt.getText().equals("06"))
		{
			lbl.setText("Giugno");
		}
		else if(txt.getText().equals("07"))
		{
			lbl.setText("Luglio");
		}
		else if(txt.getText().equals("08"))
		{
			lbl.setText("Agosto");
		}
		else if(txt.getText().equals("09"))
		{
			lbl.setText("Settembre");
		}
		else if(txt.getText().equals("10"))
		{
			lbl.setText("Ottobre");
		}
		else if(txt.getText().equals("11"))
		{
			lbl.setText("Novembre");
		}
		else if(txt.getText().equals("12"))
		{
			lbl.setText("Dicembre");
		}
		else
		{
			lbl.setText("Input non valido. Formato MM 01-12");
		}
	}
	public static void main(String[] args) 
	{
		new Es13();
	}
}