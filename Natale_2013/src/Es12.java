/**
 * 
 * @author Martin Masevski 4ai
 * 
 * Creare una finestra con due polsanti per settare la grandezza di essa a 300x300 o 600x600
 *
 */

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.util.*;

public class Es12 implements ActionListener {
	String titolo;
	JFrame finestra;
	int x,y;
	Scanner t= new Scanner (System.in);
	JButton bottone, bottone2;

	public Es12(){

		titolo= "Esercizio 12";
		finestra = new JFrame(titolo);

		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c= finestra.getContentPane();
		c.setLayout(new GridLayout (1,2));

		bottone = new JButton("Aumenta");
		bottone.addActionListener(this);
		c.add(bottone);

		bottone2 = new JButton("Diminuisci");
		bottone2.addActionListener(this);
		c.add(bottone2);

		y= 300;
		x= 300;
		finestra.setSize(x, y);

		finestra.setVisible(true);

	}

	public void actionPerformed(ActionEvent evt){
		
			if(evt.getSource()==bottone){
				finestra.setSize(600, 600);
			}
			if(evt.getSource()==bottone2){
				finestra.setSize(300, 300);
			}
		
	}

	public static void main(String[] args) {
		new Es12();
	}
}