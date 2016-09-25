/**
 * 
 * @author Martin Masevski 4ai
 * 
 * Inserendo un numero in un'etichetta, il primo pulsante deve aumentare di 1 unità il valore e il secondo diminuire di 1, se è minore di zero i numeri sono rossi se è maggiore di zero sono neri.
 *
 */

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.util.*;

public class Es08 implements ActionListener {
	String titolo;
	int x,y;
	Scanner t= new Scanner (System.in);
	JButton bottone, bottone2;
	JLabel etichetta;

	public Es08(){

		titolo= "Esercizio 8";
		JFrame finestra = new JFrame(titolo);

		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c= finestra.getContentPane();
		c.setLayout(new GridLayout (1,3));

		bottone = new JButton("Aumenta");
		bottone.addActionListener(this);
		c.add(bottone);

		etichetta = new JLabel ("0", JLabel.CENTER);
		c.add(etichetta);

		bottone2 = new JButton("Diminuisci");
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
				if(n>=0){
					etichetta.setForeground(Color.black);
					etichetta.setText(""+n);
				}
				else{
					etichetta.setForeground(Color.red);
					etichetta.setText(""+n);
				}
			}
			if(evt.getSource()==bottone2){
				n = numero - 1;
				if(n<0){
					etichetta.setForeground(Color.red);
					etichetta.setText(""+n);
				}
				else{
					etichetta.setForeground(Color.black);
					etichetta.setText(""+n);
				}
			}
		}
		catch(NumberFormatException nfe){
			etichetta.setText("ERRORE");
		}
	}

	public static void main(String[] args) {
		new Es08();
	}
}