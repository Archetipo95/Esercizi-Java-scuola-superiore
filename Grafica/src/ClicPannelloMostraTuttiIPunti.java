
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;
/**
 * Pannello che mostra la posizione dell'ultimo clic del mouse. 
 * @author Mion - Santi
 * @version 3 dic 2012
 */
public class ClicPannelloMostraTuttiIPunti extends JPanel 
implements MouseListener, MouseMotionListener{

	public ClicPannelloMostraTuttiIPunti() {
		super();
		addMouseListener(this);
		addMouseMotionListener(this);
	} 

	public void mouseClicked(MouseEvent arg0) {
	}

	public void mouseEntered(MouseEvent arg0) {
	}

	public void mouseExited(MouseEvent arg0) {
	}

	public void mousePressed(MouseEvent arg0) {
	}

	public void mouseReleased(MouseEvent arg0) {
	}

	public void mouseDragged(MouseEvent arg0) {
		Graphics g = this.getGraphics();
		Point p = arg0.getPoint();
		int x = (int)(p.getX());
		int y = (int)(p.getY());
		g.fillOval(x-1, y-1, 6, 6);
	}

	public void mouseMoved(MouseEvent arg0) {
	}
}