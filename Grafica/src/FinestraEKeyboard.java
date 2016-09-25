package grafica.keyboard;

import javax.swing.*;
import java.awt.*;
public class FinestraEKeyboard {
	public static void main(String[] args) {
		JFrame win = new JFrame();
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// prende il pannello contenitore del frame
		Container c = win.getContentPane();
		// imposta Layout Manager
		c.setLayout(new GridLayout(3,1));
//		c.setLayout(new FlowLayout());
		// aggiunge qualche campo testo
		c.add(new JTextField(" Testo modificabile 1 "));
		c.add(new FocusableClickable());
		c.add(new JTextField(" Testo modificabile 2 "));
		win.pack(); // ridimensiona finestra sul contenuto
		win.setVisible(true);
	}
}