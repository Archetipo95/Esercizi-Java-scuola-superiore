/**
 * 
 * @author Martin Masevski 4ai
 * 
 * Scrivendo nella casella di testo una stringa, con invio si visualizza nella etichetta il numero dei carattere della stringa
 *
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Es03 implements ActionListener {
	String titolo;
	int x,y;
	Scanner t= new Scanner (System.in);
	JTextField testo;
	JButton bottone;
	JLabel etichetta;
	
	public Es03(){

		titolo= "Esercizio 3";
		JFrame finestra = new JFrame(titolo);

		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c= finestra.getContentPane();
		c.setLayout(new GridLayout (3,1));
		testo = new JTextField("Scrivi il tuo testo in questo punto");
		c.add(testo);
		
		bottone = new JButton("Conta");
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
		String s= testo.getText();
		int l= s.length();
		int conta= 0;
		
		for(int i=0; i<l; i++){
			if(!(s.charAt(i)==(' '))){
				conta++;
			}
		}
		String a= "" + conta + " caratteri";
		etichetta.setText(a);
	}

	public static void main(String[] args) {
		new Es03();
	}
}