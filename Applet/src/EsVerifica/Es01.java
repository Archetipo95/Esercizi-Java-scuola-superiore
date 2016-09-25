/**
 * 
 */
package EsVerifica;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Es01 extends JApplet implements ActionListener {

	private static final long serialVersionUID = 1L;
	Timer timer;
	JLabel label;
	int molti, numero;
	boolean controllo;

	public void init() {
		super.init();
		timer = new Timer(1000, this);
		molti = 1;
		label = new JLabel();
		getContentPane().setBackground(Color.WHITE);
		getContentPane().add(label);
		label.setLayout(new FlowLayout());

		try {
			numero = Integer.parseInt(getParameter("numero"));
		}
		catch (NumberFormatException e) {
			showStatus("Errore");
			controllo = true;
		}
	}

	public void start() {
		super.start();
		if(!controllo) {
			timer.start();
		}
	}

	public void actionPerformed(ActionEvent arg0) {
		Container c = getContentPane();
		if(molti==10){
			timer.stop();
		}
		label.setText("Numero: "+numero+" ; Multipli: "+(molti * numero));
		molti++;	
	}	
}