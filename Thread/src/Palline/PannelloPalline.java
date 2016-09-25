package Palline;

import java.awt.Container;
import java.awt.Graphics;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PannelloPalline extends JPanel {
	
	private static final long serialVersionUID = 1L;
	Vector<PallinaIndipendente> palline;
	
	public PannelloPalline(){
		palline= new Vector<PallinaIndipendente>();
	}
	
	public void addPallina(){//aggiunge un oggetto PallinaIndipendente al pannello
		PallinaIndipendente b;
		b = new PallinaIndipendente(this);
		palline.add(b);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		for(PallinaIndipendente p:palline)
			p.disegnaPallina(g);// disegna la pallina p
	}
	
	public static void main(String[] args) {
		JFrame win = new JFrame("Palline rimbalzineee!!");
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = win.getContentPane();
		PannelloPalline pan = new PannelloPalline();
		
		for(int i=0; i<50; ++i)//aggiunge l'oggetto pallina alla frame
			pan.addPallina();
		c.add(pan);
		
		win.setSize(600,600);
		win.setVisible(true);
	}
}
