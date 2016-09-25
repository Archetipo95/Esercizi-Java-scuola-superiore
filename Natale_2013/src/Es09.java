/**
 * 
 * @author Martin Masevski 4ai
 * 
 *	Equazione di primo grado ax+b=0
 *
 */

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.util.*;

public class Es09 implements ActionListener {
	String titolo;
	int x,y;
	Scanner t= new Scanner (System.in);
	JTextField testo, testo2;
	JButton bottone;
	JLabel etichetta;

	public Es09(){

		titolo= "Esercizio 9";
		JFrame finestra = new JFrame(titolo);

		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c= finestra.getContentPane();
		c.setLayout(new GridLayout (1,4));

		testo = new JTextField ("0");
		c.add(testo);
		
		testo2 = new JTextField ("0");
		c.add(testo2);
		
		bottone = new JButton("Risolvi");
		bottone.addActionListener(this);
		c.add(bottone);

		etichetta = new JLabel ("Risultato", JLabel.CENTER);
		c.add(etichetta);
		
		y= 300;
		x= 450;
		finestra.setSize(x, y);

		finestra.setVisible(true);

	}

	public void actionPerformed(ActionEvent evt){
		try{
			double numero = Double.parseDouble(testo.getText());
			double numero2 = Double.parseDouble(testo2.getText());
			double n;

			if(evt.getSource()==bottone){
				n = -numero2 / numero;
				n = Math.floor(n*100);
				n = n/100;
				etichetta.setText(""+n);
				
			}
		}
		catch(NumberFormatException nfe){
			etichetta.setText("ERRORE");
		}
	}

	public static void main(String[] args) {
		new Es09();
	}
}