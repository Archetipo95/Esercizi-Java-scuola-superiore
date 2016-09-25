package Esempi;

import java.awt.*;

import javax.swing.*;

/**
 * Pannello che visualizza una campana
 * che oscilla a tempo.
 * 
 * @author santi
 *
 */
public class DA_CampanaPannelloTempo extends JPanel 
implements Runnable
{
	/**
	 * Modulo temporale della campana
	 */
	long tempo;
	String nomeFile;
	/**
	 * Indica la fase cui corrisponde un angolo 
	 * in cui si trova la campana (0..angoli.length-1).
	 * 
	 */
	int fase=0; 
	double angoli[] = {0,15,30,90,30,15,0,-15,-30,-90,-30,-15};
	ImageIcon img; 
	public DA_CampanaPannelloTempo(String name, long t) {
		nomeFile= name;
		tempo = t;
		img = new ImageIcon(nomeFile);
		Thread th = new Thread(this);
		th.start();
		//this.setBorder(BorderFactory.createEtchedBorder());
		setBackground(Color.white);
		this.setPreferredSize(new Dimension(200,200));
	}

	/**
	 * Implementa Runnable.run()
	 */
	@Override
	public void run() {
		while(true)
		{
			System.out.println(this.nomeFile
					+": "+fase);
			try {
				long t=tempo;
				Thread.sleep(t);
				fase = (fase+1)%angoli.length;
			} catch (InterruptedException e) {}
			this.repaint();
		} // end for 1 .. 5 volte
	}

	/**
	 * Implementa il disegno del semaforo.
	 */
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		int w = this.getWidth();
		int h = this.getHeight();
		// g.drawString(this.nomeFile, 5, 15);
		Graphics2D g2 = (Graphics2D)g;
		g2.rotate(Math.toRadians(angoli[fase]), w/2, h/4);
		g2.drawImage(img.getImage(), w/2-img.getIconWidth()/2, h/4, this);
	}
	
}
