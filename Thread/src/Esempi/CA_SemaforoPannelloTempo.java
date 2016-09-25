package Esempi;

import java.awt.*;
import javax.swing.*;

/**
 * Pannello che visualizza un semaforo
 * (solo le scritte) in grafica.
 * Le fasi sono 4: rosso-verde, rosso-arancio,
 * verde-rosso, arancio-verde.
 * Il tempo di attesa dipende dalla fase in corso:
 * Nel caso di arancione (fasi 1 e 3) vale "tempo" ms.
 * Nel caso di verde (fasi 0 e 2) vale 6*tempo ms.
 * 
 * @author santi
 *
 */
public class CA_SemaforoPannelloTempo extends JPanel 
implements Runnable
{
	/**
	 * Modulo temporale del semaforo.
	 * tempoTotale = (6+1+6+1)*tempo.
	 */
	long tempo;
	String nomeSemaforo;
	/**
	 * Indica la fase in cui si trova il semaforo (0..3).
	 * 
	 */
	int fase=0; 
	public CA_SemaforoPannelloTempo(String name, long t) {
		nomeSemaforo= name;
		tempo = t;
		// crea un Thread per eseguire this !!!
		Thread th = new Thread(this);
		// vai, esegui! this!!!
		th.start();
		this.setBackground(Color.black);
		this.setForeground(Color.white);
		this.setBorder(BorderFactory.createEtchedBorder());
		this.setPreferredSize(new Dimension(100,100));
	}

	/**
	 * Implementa Runnable.run()
	 */
	@Override
	public void run() {
		while(true)
		{
			System.out.println(this.nomeSemaforo
					+": "+fase);
			try {
				long t=tempo;
				if(fase==0 || fase==2)
					t=tempo*6;
				Thread.sleep(t);
				fase = (fase+1)%4;
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
		g.drawString(this.nomeSemaforo, 5, 15);
		switch(fase)
		{
		case 0:
			g.drawString("Rosso - Verde", 5, 30);
			g.setColor(Color.red);
			g.fillOval(10, 10, 20, 20);
			g.drawOval(40, 10, 20, 20);
			g.setColor(Color.orange);
			g.drawOval(10, 40, 20, 20);
			g.drawOval(40, 40, 20, 20);
			g.setColor(Color.green);
			g.drawOval(10, 70, 20, 20);
			g.fillOval(40, 70, 20, 20);
			break;
		case 1:
			g.drawString("Rosso - Arancio", 5, 30);
			g.setColor(Color.red);
			g.fillOval(10, 10, 20, 20);
			g.drawOval(40, 10, 20, 20);
			g.setColor(Color.orange);
			g.drawOval(10, 40, 20, 20);
			g.fillOval(40, 40, 20, 20);
			g.setColor(Color.green);
			g.drawOval(10, 70, 20, 20);
			g.drawOval(40, 70, 20, 20);
			break;
		case 2:
			g.drawString("Verde - Rosso", 5, 30);
			g.setColor(Color.red);
			g.drawOval(10, 10, 20, 20);
			g.fillOval(40, 10, 20, 20);
			g.setColor(Color.orange);
			g.drawOval(10, 40, 20, 20);
			g.drawOval(40, 40, 20, 20);
			g.setColor(Color.green);
			g.fillOval(10, 70, 20, 20);
			g.drawOval(40, 70, 20, 20);
			break;
		case 3:
			g.drawString("Arancio - Rosso", 5, 30);
			g.setColor(Color.red);
			g.drawOval(10, 10, 20, 20);
			g.fillOval(40, 10, 20, 20);
			g.setColor(Color.orange);
			g.fillOval(10, 40, 20, 20);
			g.drawOval(40, 40, 20, 20);
			g.setColor(Color.green);
			g.drawOval(10, 70, 20, 20);
			g.drawOval(40, 70, 20, 20);
			break;
			
		}
	}
	
}
