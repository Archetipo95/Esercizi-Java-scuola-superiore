/**
 * 
 * @author Martin Masevski 4ai
 * 
 *  Applicazione grafica con 2 caselle di testo e un pulsante. Alla pressione del pulsante i contenuti delle 2 caselle devono essere scambiati.
 *
 */

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.util.*;

public class Es11 implements ActionListener {
	String titolo;
	int x,y;
	Scanner t= new Scanner (System.in);
	JButton bottone;
	JTextField text, text2;

	public Es11(){

		titolo= "Esercizio 11";
		JFrame finestra = new JFrame(titolo);

		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c= finestra.getContentPane();
		c.setLayout(new GridLayout (1,3));

		text = new JTextField ("Primo");
		c.add(text);

		bottone = new JButton("Scambia");
		bottone.addActionListener(this);
		c.add(bottone);

		text2 = new JTextField ("Secondo");
		c.add(text2);

		y= 300;
		x= 450;
		finestra.setSize(x, y);

		finestra.setVisible(true);

	}

	public void actionPerformed(ActionEvent evt){
		String s1, s2;
		if(evt.getSource()==bottone){
			s1 = text.getText();
			s2 = text2.getText();

			text.setText(s2);
			text2.setText(s1);
		}
	}

	public static void main(String[] args) {
		new Es11();
	}
}