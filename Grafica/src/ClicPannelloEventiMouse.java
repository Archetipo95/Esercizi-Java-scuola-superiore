

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;
/**
 * Pannello che mostra gli eventi del mouse. 
 * @author Mion - Santi
 * @version 3 dic 2012
 */
public class ClicPannelloEventiMouse 
	extends JPanel
	implements MouseListener	{
	private static final long serialVersionUID = 1L;

	public ClicPannelloEventiMouse() {
		super();
		addMouseListener(this);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Clicked " + e.getPoint());
		System.out.println("nclick " + e.getClickCount());
		System.out.println("bottone1 " 
				+ (e.getButton() == MouseEvent.BUTTON1));
		System.out.println("bottone2 " 
				+ (e.getButton() == MouseEvent.BUTTON2));
		System.out.println("bottone3 " 
				+ (e.getButton() == MouseEvent.BUTTON3));
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Entered " + e.getPoint());
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Exited " + e.getPoint());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Pressed " + e.getPoint());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Released " + e.getPoint());
	}


}
