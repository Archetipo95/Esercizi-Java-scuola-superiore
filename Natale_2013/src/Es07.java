/**
 * 
 * @author Martin Masevski 4ai
 * 
 * Inserendo un numero nella casella di testo, il primu pulsante deve aumentare di 1 unità il valore e il secondo resettare a zero.
 *
 */

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.util.*;

public class Es07 implements ActionListener {
	String titolo;
	int x,y;
	Scanner t= new Scanner (System.in);
	JButton bottone, bottone2;
	JLabel etichetta;

	public Es07(){

		titolo= "Esercizio 7";
		JFrame finestra = new JFrame(titolo);

		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c= finestra.getContentPane();
		c.setLayout(new GridLayout (1,3));

		etichetta = new JLabel ("0", JLabel.CENTER);
		c.add(etichetta);
		
		bottone = new JButton("Aumenta");
		bottone.addActionListener(this);
		c.add(bottone);

		bottone2 = new JButton("Reset");
		bottone2.addActionListener(this);
		c.add(bottone2);

		y= 300;
		x= 450;
		finestra.setSize(x, y);

		finestra.setVisible(true);

	}

	public void actionPerformed(ActionEvent evt){
		try{
			int numero = Integer.parseInt(etichetta.getText());
			int n=0;

			if(evt.getSource()==bottone){
				n = numero + 1;
				etichetta.setText(""+n);
			}
			if(evt.getSource()==bottone2){
				etichetta.setText("0");
			}
		}
		catch(NumberFormatException nfe){
			etichetta.setText("ERRORE");
		}
	}

	public static void main(String[] args) {
		new Es07();
	}
}