package html;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class BottoniLink extends Esercizio2 implements ActionListener{
	BottoniLink(){		
	}


	
	public void actionPerformed(ActionEvent arg0) {
		

	}


	public static void main(String[] args) {
		JFrame frame;
		JButton btn;

		frame = new JFrame("Bottoni Link");
		frame.setSize(500,500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		JPanel p = (JPanel)frame.getContentPane();
		p.setLayout(new FlowLayout());


	}

}
