/**
 * 
 * @author Martin Masevski 4ai
 * 
 * Inserire ore minuti e secondi e visualizzare il totale in secondi
 *
 */

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.util.*;

public class Es05 implements ActionListener {
	String titolo;
	int x,y;
	Scanner t= new Scanner (System.in);
	JTextField testo, testo2, testo3;
	JButton bottone;
	JLabel etichetta, info, info2, info3, info4;
	JPanel a,b;
	
	public Es05(){

		titolo= "Esercizio 5";
		JFrame finestra = new JFrame(titolo);

		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = finestra.getContentPane();
		c.setLayout(new GridLayout (3,1));
		
		a = new JPanel();
		a.setLayout(new GridLayout (3,2));
		b = new JPanel();
		b.setLayout(new GridLayout (1,2));
		
		info =  new JLabel("Ore: ");	
		info2 =  new JLabel("Minuti: ");
		info3 =  new JLabel("Secondi: ");
		info4 =  new JLabel("Totale in secondi: ");
		
		testo = new JTextField("0");
		a.add(info);
		a.add(testo);
		testo2 = new JTextField("0");
		a.add(info2);
		a.add(testo2);
		testo3 = new JTextField("0");
		a.add(info3);
		a.add(testo3);
		
		bottone = new JButton("INVIO");
		bottone.addActionListener(this);
		
		
		etichetta = new JLabel ("");
		b.add(info4);
		b.add(etichetta);
		
		c.add(a);
		c.add(bottone);
		c.add(b);
		
		y= 300;
		x= 450;
		finestra.setSize(x, y);
		
		finestra.setVisible(true);

	}
	
	public void actionPerformed(ActionEvent arg0){
		try{
		int n1= Integer.parseInt(testo.getText());
		int n2= Integer.parseInt(testo2.getText());
		int n3= Integer.parseInt(testo3.getText());
		int totale= (n1*3600)+(n2*60)+n3;
		etichetta.setText(""+totale);
		}
		catch(NumberFormatException nfe){
			etichetta.setText("ERRORE");
		}
	}

	public static void main(String[] args) {
		new Es05();
	}
}