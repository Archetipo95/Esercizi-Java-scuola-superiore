/**
 * 
 * @author Martin Masevski 4ai
 * 
 * Quiz
 *
 */
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.util.*;
import java.io.*;

public class Es16 implements ActionListener 
{
	JFrame win;
	JTextField txt;
	JLabel lbl1, lbl2, lbl3, lbl4, lbl5;
	JButton btn1, btn2;
	
	int x, lunghezza, numero, punteggio=0;
	boolean fine=false;
	Vector<String> domande;
	String[] quiz = new String[10];
	String domanda, r1, r2, r3, ris;
	StringTokenizer st;
	
	public Es16() throws FileNotFoundException
	{
		win = new JFrame("Quiz");
		Container c = win.getContentPane();
		c.setLayout(new GridLayout(2,4));
		win.setSize(500, 400);
		
		domande = new Vector<String>();
		
		FileInputStream fis = new FileInputStream("Domande.txt");
		Scanner sc = new Scanner(fis);
		
		while(sc.hasNextLine())
		{
			domande.add(sc.nextLine());
		}

		lunghezza = domande.size();
		
		for(int i=0 ; i<10 ; i++)
		{
			x = (int) (Math.random() * lunghezza);
			quiz[i] = domande.elementAt(x);
			domande.remove(x);
			lunghezza--;
		}
		
		lbl1 = new JLabel("");
		c.add(lbl1);
		
		lbl2 = new JLabel("");
		c.add(lbl2);
		
		lbl3 = new JLabel("");
		c.add(lbl3);
		
		lbl4 = new JLabel("");
		c.add(lbl4);
		
		txt = new JTextField();
		c.add(txt);
		
		btn1 = new JButton("Inizia");
		btn1.setMnemonic('N');
		btn1.addActionListener(this);
		c.add(btn1);
		
		btn2 = new JButton("Controlla");
		btn2.setMnemonic('C');
		btn2.addActionListener(this);
		c.add(btn2);
		
		lbl5 = new JLabel("Il gioco deve ancora iniziare");
		c.add(lbl5);
		
		win.pack();
		win.setVisible(true);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) throws FileNotFoundException 
	{
		new Es16();
	}
	
	public void actionPerformed(ActionEvent evt) 
	{
		if(evt.getSource() == btn1)
		{
			if(btn1.getActionCommand().equals("Inizia"))
			{
				btn1.setText("Nuova");
			}
			
			if(numero == 10)
			{
				JOptionPane.showMessageDialog(null, "Complimenti!!! Hai finito il quiz e il tuo punteggio finale è: " + punteggio);
				win.setVisible(false);
				win.dispose();
				fine = true;
			}
			
			if(fine == false)
			{
				lbl5.setText("Domanda numero: " + (numero+1) + "           punteggio: " + punteggio);
				
				st = new StringTokenizer(quiz[numero], "#");
				
				domanda = st.nextToken();
				r1 = st.nextToken();
				r2 = st.nextToken();
				r3 = st.nextToken();
				ris = st.nextToken();
				
				ris = ris.toUpperCase();
				
				lbl1.setText(domanda);
				lbl2.setText(r1);
				lbl3.setText(r2);
				lbl4.setText(r3);
				
				numero++;
			}
		}
		
		else
		{
			if(txt.getText().toUpperCase().equals(ris))
			{
				JOptionPane.showMessageDialog(null, "Complimenti!!! Hai indovinato!!!");
				punteggio++;
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Mi dispiace ma non hai indovinato :(");
			}
			
			lbl5.setText("Domanda numero: " + (numero) + "           punteggio: " + punteggio);
		}
	}
}
