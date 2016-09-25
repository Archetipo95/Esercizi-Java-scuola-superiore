/**
 * Masevski Fipponi
 * @author 4ai
 *
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WinCalcolatrice implements ActionListener {
	JTextField src, src2;
	JLabel dst;
	JButton somma, meno, per, diviso, elevo, radice ;
	
	public WinCalcolatrice() {
		
		// Finestra
		JFrame win = new JFrame("Calcolatrice");
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Contenitore
		Container c = win.getContentPane();
		c.setLayout(new GridLayout(5,1));
		
		// Input
		src = new JTextField("0");
		//src.setHorizontalAlignment(JTextField.RIGHT);
		c.add(src);
		src2 = new JTextField("0");
		
		c.add(src2);
		somma = new JButton("+");
		somma.addActionListener(this);
		c.add(somma);
		
		meno = new JButton("-");
		meno.addActionListener(this);
		c.add(meno);
		
		per = new JButton("*");
		per.addActionListener(this);
		c.add(per);
		
		diviso = new JButton("/");
		diviso.addActionListener(this);
		c.add(diviso);
		
		elevo = new JButton("N1^N2");
		elevo.addActionListener(this);
		c.add(elevo);
		
		radice = new JButton("SQUAR N1");
		radice.addActionListener(this);
		c.add(radice);
		
		// Etichetta destinazione
		dst = new JLabel("Risultato");
		c.add(dst); 

		win.setSize(500,300);
		win.setVisible(true);
	}
	public void actionPerformed(ActionEvent arg0){
		try{
			String s, m, p, d, e;
			double n1,n2, piu, min, prod, div;
			double el, rad;
			s = src.getText();
			n1 = Double.parseDouble(s);
			s = src2.getText();
			n2 = Double.parseDouble(s);
			
			if(arg0.getSource()==somma){
				piu = n1 + n2;
				s = "";
				s = s + piu;
				dst.setText(s);
			}
			if(arg0.getSource()==meno){
				min= n1-n2;
				m= "";
				m= m+min;
				dst.setText(m);
			}
			if(arg0.getSource()==per){
				prod= n1*n2;
				p= "";
				p= p+prod;
				dst.setText(p);
			}
			if(arg0.getSource()==diviso){

				div= n1/n2;
				d = "";
				d = d + div;
				dst.setText(d);
			}
			if(arg0.getSource()==elevo){

				el = Math.pow(n1, n2);
				e = "";
				e = e + el;
				dst.setText(e);
			}
			if(arg0.getSource()==radice){
				rad = Math.sqrt(n1);
				e = "";
				e = e + rad;
				dst.setText(e);
			}
		}

		catch(NumberFormatException nfe)
		{
			dst.setText("ERROR");
		}
		catch(java.lang.ArithmeticException nfe)
		{
			dst.setText("ERROR");
		}
	}

	public static void main(String[] args) {
		new WinCalcolatrice();
	}
}
