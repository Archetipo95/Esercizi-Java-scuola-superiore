import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingMaiMin implements ActionListener {
	JTextField src;
	JLabel dst;
	JButton bMai;
	JButton bMin;
	
	public SwingMaiMin() {
		JFrame win = new JFrame("Maiuscolizzatore");
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = win.getContentPane();
		c.setLayout(new GridLayout(4,1));
		
		src = new JTextField("Inserisci testo");
		c.add(src); // campo di inserimento
		
		bMai = new JButton("Maiuscolizza");
		bMai.addActionListener(this);
		c.add(bMai); // bottone di comando
		
		bMin = new JButton("Minuscolizza");
		bMin.addActionListener(this);
		c.add(bMin);
		
		dst = new JLabel("DESTINAZIONE");
		c.add(dst); // etichetta destinazione
		win.pack();
		win.setVisible(true);
	}
	public void actionPerformed(ActionEvent arg0){
		String s = src.getText();
		if(arg0.getSource()==bMai)
			dst.setText(s.toUpperCase());
			else
			dst.setText(s.toLowerCase());
			}

	public static void main(String[] args) {
		new SwingMaiMin();
	}
}