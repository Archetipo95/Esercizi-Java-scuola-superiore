package PallineMouse;

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.*;

public class Pannello extends JPanel implements MouseMotionListener{

	private static final long serialVersionUID = 1L;
	Vector<Palla> palline;
	Palla b;

	Point p = null;
	public int x=55, y=0;

	public Pannello(){
		super();
		palline= new Vector<Palla>();

		addMouseMotionListener(this);
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
		Container c = win.getContentPane();
		Pannello pan = new Pannello();
		pan.setBackground(Color.white);

		//aggiunge l'oggetto pallina alla frame
		for(int i=0; i<1; ++i) {
			pan.addPallina();
		}
		c.add(pan);

		win.setSize(600,600);
		win.setLocationRelativeTo(null);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setVisible(true);
	}

	public void mouseDragged(MouseEvent e) {
	}

	public void mouseMoved(MouseEvent e) {
		Point p = e.getPoint();
		x = (int)(p.getX());
		y = (int)(p.getY());
	}

	public int getMouseX() {
		return x;
	}

	public int getMouseY() {
		return y;
	}
}