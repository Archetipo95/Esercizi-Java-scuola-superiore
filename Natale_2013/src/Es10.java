/**
 * 
 * @author Martin Masevski 4ai
 * 
 *	Applicazione grafica che presenta due pulsanti (rettangolo e cerchio), alla loro pressione si deve visualizzare una finestra con la rispettiva immagine
 *
 */

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.util.*;

public class Es10 implements ActionListener {
	JFrame finestra;
	String titolo;
	int x,y;
	Scanner t= new Scanner (System.in);
	JButton bottone, bottone2;

	public Es10(){

		titolo= "Esercizio 10";
		finestra = new JFrame(titolo);

		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c= finestra.getContentPane();
		c.setLayout(new GridLayout (1,2));

		bottone = new JButton("Rettangolo");
		bottone.addActionListener(this);
		c.add(bottone);

		bottone2 = new JButton("Cerchio");
		bottone2.addActionListener(this);
		c.add(bottone2);
		
		finestra.pack();
		finestra.setVisible(true);

	}

	public void actionPerformed(ActionEvent evt){
		if(evt.getSource()==bottone){
			JOptionPane.showMessageDialog(finestra, 
					"Rettangolo",
					"Finestra rettangolo",
					JOptionPane.OK_OPTION, new ImageIcon("img/rettangolo.jpg"));

		}
		if(evt.getSource()==bottone2){
			JOptionPane.showMessageDialog(finestra, 
					"Cerchio",
					"Finestra cerchio",
					JOptionPane.OK_OPTION, new ImageIcon("img/cerchio.jpg"));

		}
	}

	public static void main(String[] args) {
		new Es10();
	}
}
