

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
/**
 * Pannello che mostra la posizione dell'ultimo clic del mouse. 
 * @author Mion - Santi
 * @version 3 dic 2012
 */
public class ClicPannelloMostraPunto extends JPanel 
	implements MouseListener{
	/**
	 * Posizione memorizzata.
	 * All'inizio null indica nessun punto premuto.
	 */
	private Point p = null;
	int dim=1;
	public ClicPannelloMostraPunto() {
		super();
		addMouseListener(this);
	}

	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(p!=null)
		{
			int x = (int)(p.getX());
			int y = (int)(p.getY());
			g.fillOval(x-dim, y-dim, dim*2, dim*2);
			String s = new String(" x= " + x + " y= " + y);
			g.drawString(s, x, y-dim);
		}
	}


	@Override
	public void mouseClicked(MouseEvent arg0) {
		p = arg0.getPoint();
		dim++;
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
	}
}
