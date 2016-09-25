package Esercizi;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PannelloPalline extends JPanel {

	private static final long serialVersionUID = 1L;
	Vector<Palla> palline;
	Palla b;

	public PannelloPalline(){
		palline= new Vector<Palla>();
	}

	//aggiunge un oggetto Palla al pannello
	public void addPallina(){
		b = new Palla(this);
		palline.add(b);
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);

		for(Palla p:palline)
			p.disegnaPallina(g);
	}

	public static void main(String[] args) {
		JFrame win = new JFrame("Palline");
		win.setSize(600,600);
		win.setLocationRelativeTo(null);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = win.getContentPane();
		PannelloPalline pan = new PannelloPalline();
		pan.setBackground(Color.white);
		
		//aggiunge l'oggetto pallina alla frame
		for(int i=0; i<100; ++i) {
			pan.addPallina();
		}
		c.add(pan);
		win.setVisible(true);
	}
}