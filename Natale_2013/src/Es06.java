/**
 * 
 * @author Martin Masevski 4ai
 * 
 * Inserendo un numero nella casella di testo, il primu pulsante deve memorizzare il numero sucessivo e l'altro il numero precedente
 *
 */

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.util.*;

public class Es06 implements ActionListener {
	String titolo;
	int x,y;
	Scanner t= new Scanner (System.in);
	JTextField testo;
	JButton bottone, bottone2;
	JLabel etichetta;

	public Es06(){

		titolo= "Esercizio 6";
		JFrame finestra = new JFrame(titolo);

		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c= finestra.getContentPane();
		c.setLayout(new GridLayout (1,4));
		testo = new JTextField("Scrivi un numero");
		c.add(testo);

		bottone = new JButton("Sucessivo");
		bottone.addActionListener(this);
		c.add(bottone);

		bottone2 = new JButton("Precedente");
		bottone2.addActionListener(this);
		c.add(bottone2);


		etichetta = new JLabel ("Destinazione");
		c.add(etichetta);

		y= 300;
		x= 450;
		finestra.setSize(x, y);

		finestra.setVisible(true);

	}

	public void actionPerformed(ActionEvent evt){
		try{
			int numero = Integer.parseInt(testo.getText());
			int n=0;

			if(evt.getSource()==bottone){
				n = numero + 1;
			}
			if(evt.getSource()==bottone2){
				n = numero -1;
			}

			etichetta.setText(""+n);
		}
		catch(NumberFormatException nfe){
			etichetta.setText("ERRORE");
		}
	}

	public static void main(String[] args) {
		new Es06();
	}
}