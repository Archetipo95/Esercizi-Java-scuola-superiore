package Pall;

import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import javax.swing.*;

/**
 * Applicazione client-server per passare una pallina da una finestra
 * ad un'altra
 * @author 4Ia Veronese - Slanzi
 * @version 13/05/2013 v2
 */

public class Client extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Socket connessione;
	private DataOutputStream out;
	private DataInputStream input;

	public Client() {
		super("Finestra Client");
		this.setBounds(600,300,300,100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		connetti();
		this.setVisible(true);
	}

	public void connetti() {
		try {
			connessione = new Socket("Localhost", 7777);
			out = new DataOutputStream(connessione.getOutputStream());
			input = new DataInputStream(connessione.getInputStream());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
			System.exit(-1);
		}
		Container c = this.getContentPane();
		PannelloAnimazioneClient pan = new PannelloAnimazioneClient(this,this.getSize());
		c.add(pan);
	}

	public DataInputStream getInput() {
		return input;
	}

	public DataOutputStream getOutput() {
		return out;
	}
}

class PannelloAnimazioneClient extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Client finestra;
	private Image bufferVirtuale;
	private Graphics offScreen;
	private Timer tim = null;
	private int xPallina = 0;
	private int yPallina = getHeight()/2;
	private int diametroPallina =30;
	private int spostamento = 3;

	private boolean destra, pallinaPresente, arrivoComunicato;

	public PannelloAnimazioneClient(Client finestra,
			Dimension dimensioni) {
		super();
		this.finestra = finestra;
		// do le direzioni iniziali della pallina
		destra = true;
		// la pallina parte dalla mio schermo
		pallinaPresente = false;
		arrivoComunicato = false;
		dimensioni = getSize();
		tim = new Timer(1, this);
		tim.start();
	}

	public void update(Graphics g) {
		paint(g);
	}

	public void paint(Graphics g) {
		super.paint(g);
		//Doppio Buffering
		bufferVirtuale = createImage(getWidth(), getHeight());
		offScreen = bufferVirtuale.getGraphics();
		Graphics2D screen = (Graphics2D) g;
		// setto il colore della palla
		offScreen.setColor(Color.red);
		// disegno la palla
		if (pallinaPresente) {
			offScreen.drawOval(xPallina, yPallina, diametroPallina,
					diametroPallina);
		}
		screen.drawImage(bufferVirtuale, 0, 0, this);
		offScreen.dispose();
	}

	public void actionPerformed(ActionEvent e) {
		if (pallinaPresente) {
			/* direzione orizzontale */
			if (destra) {
				if (xPallina >= (this.getWidth() - diametroPallina)) {
					destra = false;
					xPallina -= spostamento;
				} else {
					xPallina += spostamento;
				}
			} else {

				if ((!arrivoComunicato) && (xPallina <= 0)) {
					/*
					 * devo comunicare al server che deve far entrare la pallina
					 * da sinistra
					 */
					try {
						finestra.getOutput().writeBoolean(destra);
						finestra.getOutput().writeInt(yPallina);
						arrivoComunicato = true;
					} catch (Exception ecc) {
						JOptionPane.showMessageDialog(null, ecc.toString());
						System.exit(-1);
					}
				} else {
					xPallina -= spostamento;
					if (xPallina <= -diametroPallina) {
						pallinaPresente = false;
						arrivoComunicato =false;
					}
				}
			}
		} else {
			/*
			 * devo rimanere in attesa del ritorno della pallina nella finestra Client
			 */
			int y = 0;
			try {
				destra = finestra.getInput().readBoolean();
				y = finestra.getInput().readInt();
				destra = true;
				yPallina = y;
				xPallina = -diametroPallina;
				pallinaPresente = true;
			} catch (Exception ecc) {
				JOptionPane.showMessageDialog(null, ecc.toString());
				System.exit(-1);
			}
		}
		repaint();
	}
}
