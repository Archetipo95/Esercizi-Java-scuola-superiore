package EventiMouse;
/**
 * Masevski
 */

import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Mouse_click extends JPanel implements MouseListener {
	private static final long serialVersionUID = 1L;

	private Point p = null;
	int dim = 1;

	public static void main(String args[]) {

		JFrame f = new JFrame("Prove Grafica");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = f.getContentPane();
		Mouse_click pan = new Mouse_click();
		c.add(pan);
		f.pack();
		f.setVisible(true);
	}

	Mouse_click() {
		super();
		addMouseListener(this);
		setPreferredSize(new Dimension(400, 400));
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		if(p!=null) {
			int x = (int)(p.getX());
			int y = (int)(p.getY());
			g.setColor(Color.black);
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
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}
}