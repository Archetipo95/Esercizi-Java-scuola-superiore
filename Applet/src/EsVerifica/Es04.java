/**
 * 
 */
package EsVerifica;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Es04 extends JApplet implements ActionListener {

	private static final long serialVersionUID = 1L;
	Timer timer;
	JLabel label;
	int raggio;
	String colore;

	public void init() {
//		super.init();
		timer = new Timer(1000, this);
		label = new JLabel();
		getContentPane().setBackground(Color.WHITE);
		getContentPane().add(label);
		label.setLayout(new FlowLayout());
		try {
			raggio = Integer.parseInt(getParameter("raggio"));
		} catch (NumberFormatException e) {
			System.out.println("Raggio settato a 10 di default");
			raggio=10;
		}
		colore = getParameter("colore");
		if(colore==null) {
			System.out.println("Colore settato a rosso di default");
			colore = "rosso";
		}
		
		//parametri fuori range
		if(raggio<1 || raggio>20) {
			System.out.println("Parametro raggio fuori range");
		}
		if(!(colore.equalsIgnoreCase("rosso")) || (colore.equalsIgnoreCase("blu")) || (colore.equalsIgnoreCase("verde"))) {
			System.out.println("Parametro colore fuori range");
		}

		Container c = getContentPane();
	}

	public void start() {
		super.start();
		timer.start();
	}

	public void actionPerformed(ActionEvent arg0) {
		repaint();
	}

	public void paint(Graphics g) {
		super.paint(g);
		int w = getWidth();
		int h = getHeight();
		int diametro = raggio * 2;

		int x=(int) (Math.random()*w);
		int y=(int) (Math.random()*h);

		//Per non farla uscire dai bordi
		while(!((x < w - diametro) && (x > 0 + diametro) && (y < h - diametro) && (y > 0 + diametro))) {
			x=(int) (Math.random()*w);
			y=(int) (Math.random()*h);
		}

		//colore
		if(colore.equalsIgnoreCase("rosso"))
			g.setColor(Color.RED);
		if(colore.equalsIgnoreCase("verde"))
			g.setColor(Color.GREEN);
		if(colore.equalsIgnoreCase("blu"))
			g.setColor(Color.BLUE);

		g.fillOval(x, y, diametro, diametro);
	}
}