/**
 * 
 * @author Martin Masevski 4ai
 * 
 * XXX
 *
 */
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Es15 implements ActionListener
{
	JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24,btn25;
	Vector <String> nomi = new Vector<String>();
	int casuale, moltiplicatore=25;
	boolean x1=false,x2=false,x3=false,x4=false,x5=false,x6=false,x7=false,x8=false,x9=false,x10=false,x11=false,x12=false,x13=false,x14=false,x15=false,x16=false,x17=false,x18=false,x19=false,x20=false,x21=false,x22=false,x23=false,x24=false,x25=false;
	ImageIcon cioccolatino;
	ImageIcon grigio;
	
	public Es15()
	{
		JFrame fin = new JFrame("Cioccolatini");
		Container c = fin.getContentPane();
		c.setLayout(new GridLayout(5,5));
		
		cioccolatino = new ImageIcon("img/cioccolatino.png");
		grigio = new ImageIcon("img/Grigio.png");
		
		for(int i=0 ; i<25 ; i++)
		{
			String nome = ""+(i+1);
			System.out.println(i);
			nomi.setElementAt(nome, i);
		}
		
		casuale = (int)(Math.random() * moltiplicatore);
		btn1 = new JButton(nomi.elementAt(casuale),grigio);
		btn1.addActionListener(this);
		c.add(btn1);
		nomi.remove(casuale);
		moltiplicatore--;
		
		casuale = (int)(Math.random() * moltiplicatore);
		btn2 = new JButton(nomi.elementAt(casuale),grigio);
		btn2.addActionListener(this);
		c.add(btn2);
		nomi.remove(casuale);
		moltiplicatore--;
		
		casuale = (int)(Math.random() * moltiplicatore);
		btn3 = new JButton(nomi.elementAt(casuale),grigio);
		btn3.addActionListener(this);
		c.add(btn3);
		nomi.remove(casuale);
		moltiplicatore--;
		
		casuale = (int)(Math.random() * moltiplicatore);
		btn4 = new JButton(nomi.elementAt(casuale),grigio);
		btn4.addActionListener(this);
		c.add(btn4);
		nomi.remove(casuale);
		moltiplicatore--;
		
		casuale = (int)(Math.random() * moltiplicatore);
		btn5 = new JButton(nomi.elementAt(casuale),grigio);
		btn5.addActionListener(this);
		c.add(btn5);
		nomi.remove(casuale);
		moltiplicatore--;
		
		casuale = (int)(Math.random() * moltiplicatore);
		btn6 = new JButton(nomi.elementAt(casuale),grigio);
		btn6.addActionListener(this);
		c.add(btn6);
		nomi.remove(casuale);
		moltiplicatore--;
		
		casuale = (int)(Math.random() * moltiplicatore);
		btn7 = new JButton(nomi.elementAt(casuale),grigio);
		btn7.addActionListener(this);
		c.add(btn7);
		nomi.remove(casuale);
		moltiplicatore--;
		
		casuale = (int)(Math.random() * moltiplicatore);
		btn8 = new JButton(nomi.elementAt(casuale),grigio);
		btn8.addActionListener(this);
		c.add(btn8);
		nomi.remove(casuale);
		moltiplicatore--;
		
		casuale = (int)(Math.random() * moltiplicatore);
		btn9 = new JButton(nomi.elementAt(casuale),grigio);
		btn9.addActionListener(this);
		c.add(btn9);
		nomi.remove(casuale);
		moltiplicatore--;
		
		casuale = (int)(Math.random() * moltiplicatore);
		btn10 = new JButton(nomi.elementAt(casuale),grigio);
		btn10.addActionListener(this);
		c.add(btn10);
		nomi.remove(casuale);
		moltiplicatore--;
		
		casuale = (int)(Math.random() * moltiplicatore);
		btn11 = new JButton(nomi.elementAt(casuale),grigio);
		btn11.addActionListener(this);
		c.add(btn11);
		nomi.remove(casuale);
		moltiplicatore--;
		
		casuale = (int)(Math.random() * moltiplicatore);
		btn12 = new JButton(nomi.elementAt(casuale),grigio);
		btn12.addActionListener(this);
		c.add(btn12);
		nomi.remove(casuale);
		moltiplicatore--;
		
		casuale = (int)(Math.random() * moltiplicatore);
		btn13 = new JButton(nomi.elementAt(casuale),grigio);
		btn13.addActionListener(this);
		c.add(btn13);
		nomi.remove(casuale);
		moltiplicatore--;
		
		casuale = (int)(Math.random() * moltiplicatore);
		btn14 = new JButton(nomi.elementAt(casuale),grigio);
		btn14.addActionListener(this);
		c.add(btn14);
		nomi.remove(casuale);
		moltiplicatore--;
		
		casuale = (int)(Math.random() * moltiplicatore);
		btn15 = new JButton(nomi.elementAt(casuale),grigio);
		btn15.addActionListener(this);
		c.add(btn15);
		nomi.remove(casuale);
		moltiplicatore--;
		
		casuale = (int)(Math.random() * moltiplicatore);
		btn16 = new JButton(nomi.elementAt(casuale),grigio);
		btn16.addActionListener(this);
		c.add(btn16);
		nomi.remove(casuale);
		moltiplicatore--;
		
		casuale = (int)(Math.random() * moltiplicatore);
		btn17 = new JButton(nomi.elementAt(casuale),grigio);
		btn17.addActionListener(this);
		c.add(btn17);
		nomi.remove(casuale);
		moltiplicatore--;
		
		casuale = (int)(Math.random() * moltiplicatore);
		btn18 = new JButton(nomi.elementAt(casuale),grigio);
		btn18.addActionListener(this);
		c.add(btn18);
		nomi.remove(casuale);
		moltiplicatore--;
		
		casuale = (int)(Math.random() * moltiplicatore);
		btn19 = new JButton(nomi.elementAt(casuale),grigio);
		btn19.addActionListener(this);
		c.add(btn19);
		nomi.remove(casuale);
		moltiplicatore--;
		
		casuale = (int)(Math.random() * moltiplicatore);
		btn20 = new JButton(nomi.elementAt(casuale),grigio);
		btn20.addActionListener(this);
		c.add(btn20);
		nomi.remove(casuale);
		moltiplicatore--;
		
		casuale = (int)(Math.random() * moltiplicatore);
		btn21 = new JButton(nomi.elementAt(casuale),grigio);
		btn21.addActionListener(this);
		c.add(btn21);
		nomi.remove(casuale);
		moltiplicatore--;
		
		casuale = (int)(Math.random() * moltiplicatore);
		btn22 = new JButton(nomi.elementAt(casuale),grigio);
		btn22.addActionListener(this);
		c.add(btn22);
		nomi.remove(casuale);
		moltiplicatore--;
		
		casuale = (int)(Math.random() * moltiplicatore);
		btn23 = new JButton(nomi.elementAt(casuale),grigio);
		btn23.addActionListener(this);
		c.add(btn23);
		nomi.remove(casuale);
		moltiplicatore--;
		
		casuale = (int)(Math.random() * moltiplicatore);
		btn24 = new JButton(nomi.elementAt(casuale),grigio);
		btn24.addActionListener(this);
		c.add(btn24);
		nomi.remove(casuale);
		moltiplicatore--;
		
		casuale = (int)(Math.random() * moltiplicatore);
		btn25 = new JButton(nomi.elementAt(casuale),grigio);
		btn25.addActionListener(this);
		c.add(btn25);
		nomi.remove(casuale);
		moltiplicatore--;
		
		fin.pack();
		fin.setVisible(true);
		fin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) 
	{
		new Es15();
	}
	
	public void actionPerformed(ActionEvent evt) 
	{
		
		if(evt.getActionCommand().equals("1") )
		{
			x1 = true;
			if(evt.getSource() == btn1)
			{
				btn1.setIcon(cioccolatino);
			}
			else if(evt.getSource() == btn2)
			{
				btn2.setIcon(cioccolatino);
			}
			else if(evt.getSource() == btn3)
			{
				btn3.setIcon(cioccolatino);
			}
			else if(evt.getSource() == btn2)
			{
				btn2.setIcon(cioccolatino);
			}
			else if(evt.getSource() == btn2)
			{
				btn2.setIcon(cioccolatino);
			}
			else if(evt.getSource() == btn2)
			{
				btn2.setIcon(cioccolatino);
			}
			else if(evt.getSource() == btn2)
			{
				btn2.setIcon(cioccolatino);
			}
			else if(evt.getSource() == btn2)
			{
				btn2.setIcon(cioccolatino);
			}
			else if(evt.getSource() == btn2)
			{
				btn2.setIcon(cioccolatino);
			}
			else if(evt.getSource() == btn2)
			{
				btn2.setIcon(cioccolatino);
			}
			else if(evt.getSource() == btn2)
			{
				btn2.setIcon(cioccolatino);
			}
			else if(evt.getSource() == btn2)
			{
				btn2.setIcon(cioccolatino);
			}
			else if(evt.getSource() == btn2)
			{
				btn2.setIcon(cioccolatino);
			}
			else if(evt.getSource() == btn2)
			{
				btn2.setIcon(cioccolatino);
			}
			else if(evt.getSource() == btn2)
			{
				btn2.setIcon(cioccolatino);
			}
			else if(evt.getSource() == btn2)
			{
				btn2.setIcon(cioccolatino);
			}
			else if(evt.getSource() == btn2)
			{
				btn2.setIcon(cioccolatino);
			}
			else if(evt.getSource() == btn2)
			{
				btn2.setIcon(cioccolatino);
			}
			
		}
		
	}

}

	
