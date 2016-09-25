

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EsNatale9 implements ActionListener
{
	JTextField n1, n2;
	JLabel lbl1, lbl2,ris;
	JButton ca;
	
	public EsNatale9()
	{
		JFrame win = new JFrame("Equazione_Primo_Grado");
		Container c = win.getContentPane();
		c.setLayout(new GridLayout(1,5));
		
		n1 = new JTextField();
		c.add(n1);
		
		lbl1 = new JLabel("x + ");
		c.add(lbl1);
		
		n2 = new JTextField();
		c.add(n2);
		
		lbl2 = new JLabel(" = 0");
		c.add(lbl2);
		
		ca = new JButton("Calcola");
		ca.addActionListener(this);
		c.add(ca);
		
		ris = new JLabel("Risultato");
		c.add(ris);
		
		win.setSize(500, 150);
		win.setVisible(true);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) 
	{
		new EsNatale9();
	}
	
	public void actionPerformed(ActionEvent evt) 
	{
		try
		{
			double num1 = Double.parseDouble(n1.getText());
			double num2 = Double.parseDouble(n2.getText());
			double risultato = num2 * (-1) / num1;
			ris.setText("x = " + risultato + "");
		}
		catch(NumberFormatException e)
		{
			ris.setText("Formato numero errato!");
		}
	}

}
