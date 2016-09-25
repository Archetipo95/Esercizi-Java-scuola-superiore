/**
 * Masevski Fipponi
 * @author 4ai
 *
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalcolatriceFinale implements ActionListener {
	JTextField src;
	JButton somma, sottrazione, moltiplicazione, divisione, elevo, radice, uguale ;
	double totale;
	int operazioneprec=0;
	
	
	public CalcolatriceFinale() {
		
		// Finestra
		JFrame win = new JFrame("Calcolatrice");
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container a = win.getContentPane();
		a.setLayout(new GridLayout(3, 1));
		
		src = new JTextField("0");
		a.add(src);
		
		JPanel c= new JPanel();
		c.setLayout(new GridLayout(1, 6));
		
		
		
		
		somma = new JButton("+");
		somma.addActionListener(this);
		c.add(somma);
		
		
		sottrazione = new JButton("-");
		sottrazione.addActionListener(this);
		c.add(sottrazione);
		
		moltiplicazione = new JButton("*");
		moltiplicazione.addActionListener(this);
		c.add(moltiplicazione);
		
		divisione = new JButton("/");
		divisione.addActionListener(this);
		c.add(divisione);
		
		elevo = new JButton("N1^N2");
		elevo.addActionListener(this);
		c.add(elevo);
		
		radice = new JButton("SQUAR N1");
		radice.addActionListener(this);
		c.add(radice);
		
		a.add(c);
		
		uguale = new JButton("=");
		uguale.addActionListener(this);
		a.add(uguale);
		
		
		// Etichetta destinazione
		//dst = new JLabel("Risultato");
		//c.add(dst); 

		win.setSize(500,300);
		win.setVisible(true);
	}
	public void actionPerformed(ActionEvent evt){
		switch(operazioneprec){
		
		case 1:														//addizione
			totale= totale + Integer.parseInt((src.getText()));
			break;
			
		case 2:														//sottrazione
			totale= totale - Integer.parseInt((src.getText()));
			break;
			
		case 3:														//moltiplicazione
			totale= totale * Integer.parseInt((src.getText()));
			break;
			
		case 4:														//divisione
			totale= totale / Integer.parseInt((src.getText()));
			break;
			
		case 5:                                                    //uguale
			if (Integer.parseInt(src.getText()) != 0.0)
			{
				totale = Integer.parseInt(src.getText());
			}
			break;
		default:
			totale= Integer.parseInt(src.getText());
		}
			
		String d= totale+"";
		src.setText(d);
		
		if(evt.getSource()==somma){
			operazioneprec= 1;
		}
		if(evt.getSource()==sottrazione){
			operazioneprec= 2;
		}
		if(evt.getSource()==moltiplicazione){
			operazioneprec= 3;
		}
		if(evt.getSource()==divisione){
			operazioneprec= 4;
		}
		if(evt.getSource()==uguale){
			operazioneprec= 5;
		}
		
	}

	public static void main(String args[]){
		new CalcolatriceFinale();
	}
}
