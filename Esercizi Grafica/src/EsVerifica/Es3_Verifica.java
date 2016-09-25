package EsVerifica;
/**
 * 4^AI
 * Masevski, Fipponi
 */

import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;

public class Es3_Verifica extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	int n=10;
	JButton btn1;
	JButton btn2;
	JLabel lbl;
	Timer t;
	
	public Es3_Verifica(){
		btn1 = new JButton("AVVIA");
		btn1.addActionListener(this);
		add(btn1);
		
		btn2= new JButton("ARRESTA");
		btn2.addActionListener(this);
		add(btn2);
		
		lbl = new JLabel("10");
		add(lbl);
		
		t = new Timer(1000, this);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==t)
		{
			n--;
			lbl.setText("" + n);
			if(n==0){
				t.stop();
			}
		}
		if(e.getSource()==btn1){
			t.start();
		}
		
		if(e.getSource()==btn2){
			t.stop();
		}
	}
	
	public static void main(String[] args) {
		JFrame win;
		Container pannello;

		win=new JFrame("Esercizo4");
		pannello= win.getContentPane();
		win.setSize(50,100);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pannello.add(new  Es3_Verifica());
		win.setVisible(true);

	}
}
