/**
 * Masevski Fipponi
 */
package PingPong;

import java.awt.*;

import javax.swing.*;

public class MainPong extends JPanel {

	private static final long serialVersionUID = 1L;				//version
	private static String titolo = "PingPong";						//titolo frame
	private static int width = 800;									//larghezza frame
	private static int height = width / 16 * 9;						//altezza frame in 16:9

	private Palla palla;											//oggetto palla

	static JFrame frame;											//frame
	static Container c;												//container
	static MainPong pannello = new MainPong();

	//costruttore
	public MainPong() {
		palla = new Palla(this, width, height);
		palla.start();

	}

	//metodo paint component per repaint
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		palla.disegna(g);

	}

	//metodo per il frame
	public void Finestra () {
		
		frame = new JFrame(titolo);
		c = frame.getContentPane();
		c.setPreferredSize(new Dimension(width, height));
		pannello.setBackground(Color.BLACK);
		c.add(pannello);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.addKeyListener(palla);

	}

	//main
	public static void main(String[] args) {
		pannello.Finestra();
	}

}