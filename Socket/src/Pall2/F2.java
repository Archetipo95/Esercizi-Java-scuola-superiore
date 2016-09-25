package Pall2;
import java.awt.*;

import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

/**
 * Client
 * @author 4Ia Veronese Slanzi
 * @version 01/06/2013
 */

public class F2 extends JFrame {
	private Socket connessione = null;
	private DataOutputStream out = null;
	private DataInputStream input = null;

	public F2() {
		super("Finestra 2");
		this.setBounds(500,300,300,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// mi connetto al server
		connetti();
		this.setVisible(true);
	}// fine costruttore

	public void connetti() {
		try {
			// mi connetto al server sulla porta "6789"
			connessione = new Socket("localhost", 7777);
			// ottengo lo stream di input dal server e di output verso il server
			out = new DataOutputStream(connessione.getOutputStream());
			input = new DataInputStream(connessione.getInputStream());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
			System.exit(-1);
		}

		// inizio l'animazione
		Container c = this.getContentPane();
		// instanzio un oggetto di classe PannelloAnimazioneClient
		PannelloAnimazioneClient pan = new PannelloAnimazioneClient(this,
				c.getSize());
		// lo aggiungo alla JFrame
		c.add(pan);
	}

	public DataInputStream getInput() {
		return input;
	}

	public DataOutputStream getOutput() {
		return out;
	}
}/* --Fine classe PallaNetClient */

class PannelloAnimazioneClient extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private F2 finestra;
	private Dimension dimensioni;

	private Image bufferVirtuale;
	private Graphics offScreen;

	private Timer tim = null;
	private int xPallina = 10;
	private int yPallina = getHeight()/2;
	private int diametroPallina = 30;
	private int spostamento = 2;
	private int timerDelay = 5;

	private boolean destra, pallinaPresente, arrivoComunicato;

	public PannelloAnimazioneClient(F2 finestra,
			Dimension dimensioni) {
		super();
		this.finestra = finestra;
		this.setSize(dimensioni);
		// do le direzioni iniziali della pallina
		destra = true;
		// la pallina parte dalla Finestra1
		pallinaPresente = false;
		arrivoComunicato = false;
		tim = new Timer(timerDelay, this);
		tim.start();
	}

	public void update(Graphics g) {
		paint(g);
	}

	public void paint(Graphics g) {
		super.paint(g);
		// DoppioBuffering
		bufferVirtuale = createImage(getWidth(), getHeight());
		offScreen = bufferVirtuale.getGraphics();
		Graphics2D screen = (Graphics2D) g;
		offScreen.setColor(Color.red);
		// Palla
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
				if (xPallina > (getWidth() - diametroPallina)) {
					destra = false;
					xPallina -= spostamento;
				} else {
					xPallina += spostamento;
				}
			} else {

				if ((!arrivoComunicato) && (xPallina <= 0)) {
					/*
					 * devo comunicare al client che deve far entrare la pallina
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
						arrivoComunicato = false;
					}
				}
			}
		} else {
			/*
			 * devo rimanere in attesa del ritorno della pallina nel mio schermo
			 */
			int y = getHeight()/2;
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
