import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WinMaiuscola implements ActionListener {
	JTextField src;
	JLabel dst;
	public WinMaiuscola() {
		JFrame win = new JFrame("Maiuscolizzatore");
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = win.getContentPane();
		c.setLayout(new GridLayout(3,1));
		src = new JTextField("stringa in minuscolo");
		c.add(src); // campo di inserimento
		JButton bMai = new JButton("Maiuscolizza");
		bMai.addActionListener(this);
		c.add(bMai); // bottone di comando
		dst = new JLabel("DESTINAZIONE");
		c.add(dst); // etichetta destinazione
		win.pack();
		win.setVisible(true);
	}
	public void actionPerformed(ActionEvent arg0){
		String s = src.getText();
		dst.setText(s.toUpperCase());
	}

	public static void main(String[] args) {
		new WinMaiuscola();
	}
}
