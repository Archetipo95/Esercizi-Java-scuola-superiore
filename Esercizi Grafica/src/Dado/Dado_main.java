/**
 * 	Fipponi, Masevski
 * 	4^AI
 * 	08/02/2014
 */
package Dado;

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

import javax.swing.*;

public class Dado_main implements ActionListener {
	int n,n1;
	Dado d, d1;
	JButton bot;
	JLabel label;

	int ndadi = 10;       							//Inserire numero di dadi

	Vector <Dado> da= new Vector<Dado>();

	public static void main(String[] args) {
		new Dado_main();
	}
	
	public Dado_main(){
		JFrame f = new JFrame("Dado");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		Container c = f.getContentPane();
		
		// c.setLayout(new GridLayout(1,ndadi+2,22,0));
		c.setLayout(new FlowLayout());
		bot= new JButton("Tira");
		label = new JLabel("Somma:");
		bot.addActionListener(this);
		c.add(bot);
		c.add(label);
		for(int i=0; i<ndadi; i++){
			da.add(new Dado());
			c.add(da.elementAt(i));
		}        	        
		f.pack();
		f.setMinimumSize(f.getSize());
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent arg0) {
		int somma=0;
		for(int j=0; j<ndadi; j++){
			n=(int) (Math.random()*6)+1;
			da.elementAt(j).setFaccia(n);
			somma= somma +n;
		}
		label.setText("Somma: "+somma);
	}
}