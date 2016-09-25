/**
 * 
 * @author Masevski, Fipponi 4ai
 * @version 25/01/2014
 *
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;
public class Indirizzo_Host implements ActionListener
{
	JTextField host;
	JLabel dst;
	JButton ind;
	
	public Indirizzo_Host ()
	{
		JFrame fin= new JFrame ("Indirizzo");
		fin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c= fin.getContentPane();
		c.setLayout(new GridLayout (3,1));
		
		host= new JTextField ("Host");
		c.add(host);
		
		ind= new JButton ("Indirizzo!");
		ind.addActionListener(this);
		c.add(ind);
		
		dst= new JLabel ("DESTINAZIONE");
		c.add(dst);
		
		fin.setSize(200,200);
		fin.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new Indirizzo_Host ();
	}
	
	public void actionPerformed(ActionEvent evt) 
	{
		InetAddress s;
		String s1= "";
		
		
			try 
			{
				s= java.net.InetAddress.getByName(host.getText());
				
				s1= s + "";
			} 
			
			catch (UnknownHostException e) 
			{
				e.printStackTrace();
			}
		
		
		dst.setText(s1);
	}
}