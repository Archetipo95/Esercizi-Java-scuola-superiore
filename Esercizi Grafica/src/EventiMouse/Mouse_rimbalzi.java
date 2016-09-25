package EventiMouse;
/**
 * 4^AI
 * Masevski
 */

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Mouse_rimbalzi extends JPanel implements ActionListener, MouseListener {
	private static final long serialVersionUID = 1L;
	
	private Point p = null;
	private Timer timer;

	int dx1=2;		//valore di incremento x img1
	int dy1=2;		//valore di incremento y img1
	int x1=0,y1=0;
	
	public static void main(String args[]) {

		JFrame f = new JFrame("Prove Grafica");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = f.getContentPane();
		Mouse_rimbalzi pan = new Mouse_rimbalzi();
		c.add(pan);
		f.pack();
		f.setVisible(true);
	}
	
	Mouse_rimbalzi(){
		super();
		addMouseListener(this);
		setPreferredSize(new Dimension(300, 350));
		timer = new Timer (5, this);
		timer.start();
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Image img1 = Toolkit.getDefaultToolkit().getImage("img/pallina.png");

		int raggio_img=5;
		
		if(p!=null) {
			
			x1+=dx1;
			y1+=dy1;
			
			if (x1 < raggio_img)				dx1 = Math.abs(dx1);            //rimbalzo lato sx
			if (x1 > getWidth() - raggio_img)	dx1 = -Math.abs(dx1);			//rimbalzo lato dx
			if (y1 < raggio_img)				dy1 = Math.abs(dy1);			//rimbalzo su
			if (y1 > getHeight() - raggio_img)	dy1 = -Math.abs(dy1);			//rimbalzo giù

			g.drawImage(img1, x1 - raggio_img, y1 - raggio_img, this);			//pallina1
		}
		
	}

	public void actionPerformed(ActionEvent e) {		
		repaint();
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		p = arg0.getPoint();											//set coordinates where click
		x1 = (int)p.getX();
		y1 = (int)p.getY();
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