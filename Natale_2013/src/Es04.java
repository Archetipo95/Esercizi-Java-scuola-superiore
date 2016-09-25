/**
 * 
 * @author Martin Masevski 4ai
 * 
 * Inserire due numeri e calcolarne la media
 *
 */

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.util.*;

public class Es04 implements ActionListener {
	String titolo;
	int x,y;
	Scanner t= new Scanner (System.in);
	JTextField testo, testo2;
	JButton bottone;
	JLabel etichetta;
	
	public Es04(){

		titolo= "Esercizio 4";
		JFrame finestra = new JFrame(titolo);

		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c= finestra.getContentPane();
		c.setLayout(new GridLayout (4,1));
		testo = new JTextField("");
		c.add(testo);
		testo2 = new JTextField("");
		c.add(testo2);
		
		
		bottone = new JButton("Calcola media");
		bottone.addActionListener(this);
		c.add(bottone);
		
		etichetta = new JLabel ("Destinazione");
		c.add(etichetta);
		
		y= 300;
		x= 450;
		finestra.setSize(x, y);
		
		finestra.setVisible(true);

	}
	
	public void actionPerformed(ActionEvent arg0){
		try{
		Double n1= Double.parseDouble(testo.getText());
		Double n2= Double.parseDouble(testo2.getText());
		Double media= (n1 + n2) /2;
		etichetta.setText(""+media);
		}
		catch(NumberFormatException nfe){
			etichetta.setText("ERRORE");
		}
	}

	public static void main(String[] args) {
		new Es04();
	}
}