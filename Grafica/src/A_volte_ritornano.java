/**
 * Masevski Fipponi
 * @author 4ai
 * 14/12/2013
 */

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class A_volte_ritornano implements ActionListener {
	JTextField sp1, sp2, sp3, sp4, sp5, sp6, sp7, sp8;
	JLabel iplab, indirizzorete, lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8;
	JButton esegui;
	
	
	public A_volte_ritornano() {
		
		JFrame f = new JFrame("Reti");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container a = f.getContentPane();
		a.setLayout(new GridLayout(2,1));
		
		JPanel b= new JPanel();
		b.setLayout(new GridLayout(2,5));
		
		JPanel c= new JPanel();
		c.setLayout(new GridLayout(2,4));
		
		JPanel d= new JPanel();
		d.setLayout(new GridLayout(1,1));
		
		JPanel e= new JPanel();
		e.setLayout(new GridLayout(1,2));

		
		
		//f.setLocation(400, 500);
		
		
		sp1= new JTextField("");
		sp2= new JTextField("");
		sp3= new JTextField("");
		sp4= new JTextField("");

		sp5= new JTextField("");
		sp6= new JTextField("");
		sp7= new JTextField("");
		sp8= new JTextField("");
		
		iplab = new JLabel ("Inserisci IP");
		indirizzorete = new JLabel ("Inserisci SUBNET");
		lb1 = new JLabel ("Tipo di indirizzo");
		lb2 = new JLabel ("Indirizzo di rete");
		lb3 = new JLabel ("Numero dell'host della sottorete");
		lb4 = new JLabel ("Numero possibile di indirizzi usabili");
		
		lb5 = new JLabel ("XXXXXXXXXXXXX");
		lb6 = new JLabel ("XXXXXXXXXXXXXXX");
		lb7 = new JLabel ("XXXXXXXXXXXXXX");
		lb8 = new JLabel ("XXXXXXXXXXXXXXX");
		
		esegui = new JButton("Esegui");
		esegui.addActionListener(this);
		
		
		b.add(iplab);
		
		b.add(sp1);
		b.add(sp2);
		b.add(sp3);
		b.add(sp4);
		
		b.add(indirizzorete);
		
		b.add(sp5);
		b.add(sp6);
		b.add(sp7);
		b.add(sp8);
		
		d.add(esegui);
		
		c.add(lb1);
		c.add(lb5);
		c.add(lb2);
		c.add(lb6);
		c.add(lb3);
		c.add(lb7);
		c.add(lb4);
		c.add(lb8);
		
		e.add(c);
		e.add(d);

		a.add(b);
		a.add(e);
		
		f.pack();
		f.setSize(1200,400);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent evt){
		if(evt.getSource()==esegui){
			int in1,in2,in3,in4,sub1,sub2,sub3,sub4, n = 0;
			String tipo, classe = "", sottorete;

				
			in1 = Integer.parseInt(sp1.getText());
			while(in1<0 || in1>255){
				sp1.setText("Hai sbagliato!");
			}

			in2 =Integer.parseInt(sp2.getText());
			while(in2<0 || in2>255){
				sp2.setText("Hai sbagliato!");
			}

			in3 =Integer.parseInt(sp3.getText());
			while(in3<0 || in3>255){
				sp3.setText("Hai sbagliato!");
			}

			in4 = Integer.parseInt(sp4.getText());
			while(in4<0 || in4>255){
				sp4.setText("Hai sbagliato!");
			}

			sub1 = Integer.parseInt(sp5.getText());
			while(sub1<0 ||sub1>255){
				sp5.setText("Hai sbagliato!");
			}
			sub2 = Integer.parseInt(sp6.getText());
			while(sub2<0 ||sub2>255){
				sp6.setText("Hai sbagliato!");
			}
			sub3 = Integer.parseInt(sp7.getText());
			while(sub3<0 ||sub3>255){
				sp7.setText("Hai sbagliato!");
			}
			sub4 = Integer.parseInt(sp8.getText());
			while(sub4<0 ||sub4>255){
				sp8.setText("Hai sbagliato!");
			}

			if((in1 == 10) || ((in1 == 192) && (in2 == 168)))
			{
				lb5.setText("privato");
			}
			else
			{
				lb5.setText("publico");
			}
			if(in1==127 && in2==0 && in3==0 && in4==1){
				lb5.setText("local host");;
			}

			if (!((sub1 == 255) && (sub2 == 255)))
			{
				classe = "A";
				n = (255 * 255 * 255) - (3*3);
			}
			else
			{
				if(!(sub3 == 255))
				{
					classe = "B";
					n = (255 * 255) - (3*2);
				}
				
					if(!(sub4 == 255))
					{
						classe = "C";
						n = 255 - 3;
					}
				}

			sottorete = in1 + "." + in2 + "." + in3 + ".0";

			lb6.setText(classe);
			
			lb7.setText(sottorete);
			String x= n+""; 
			lb8.setText(x);
			
			}
	}
	public static void main(String[] args) {
		new A_volte_ritornano();
	}
}
