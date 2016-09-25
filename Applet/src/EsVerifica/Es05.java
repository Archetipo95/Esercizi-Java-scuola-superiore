/**
 * 
 */
package EsVerifica;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Es05 extends JApplet implements ActionListener, MouseListener {

	private static final long serialVersionUID = 1L;
	Timer timer;
	JLabel label;
	JButton bottone;
	boolean arresta;
	int conta;
	int mouse;

	public void init() {
		super.init();
		timer = new Timer(1000, this);
		setLayout(new FlowLayout()); 
		label = new JLabel("Time: 0");
		bottone = new JButton ("Bottone");
		bottone.addActionListener(this);
		bottone.addMouseListener(this);
		setBackground(Color.WHITE);
		add(label);
		add(bottone);
		arresta = false;
		conta = 0;
	}

	public void start() {
		super.start();
		timer.start();
	}

	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==bottone) {
			arresta = !arresta;
		}
		if(!arresta)
			conta++;
		label.setText("Time: "+conta);
	}

	public void mouseClicked(MouseEvent arg0) {
		if (arg0.getClickCount() == 2) {
			conta = 0;
		  }
	}

	public void mouseEntered(MouseEvent arg0) {
	}

	public void mouseExited(MouseEvent arg0) {
	}

	public void mousePressed(MouseEvent arg0) {
	}

	public void mouseReleased(MouseEvent arg0) {
	}	
}