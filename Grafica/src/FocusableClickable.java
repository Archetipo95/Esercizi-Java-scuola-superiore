package grafica.keyboard;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class FocusableClickable 
extends JPanel 
implements MouseListener, KeyListener, FocusListener {
	private int x, y;
//	private boolean hasFocus = false;

	public FocusableClickable() {
		super();
		setPreferredSize(new Dimension(200,200));
		setFocusable(true);
		addMouseListener(this);
		addKeyListener(this);
		addFocusListener(this);
		x=y=100;
	}



	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		if(this.isFocusOwner())
			//		if(hasFocus)
			g.setColor(Color.red);
		else
			g.setColor(Color.black);
		g.fillOval(x-4, y-4, 9, 9);
	}



	@Override
	public void keyPressed(KeyEvent k) {
//		System.out.println(k);
		if (k.getKeyCode()  == KeyEvent.VK_LEFT) {
			x -= 10;
			repaint();
		}
		if (k.getKeyCode() == KeyEvent.VK_RIGHT) {
			x += 10;
			repaint();
		}
		if (k.getKeyCode() == KeyEvent.VK_UP) {
			y -= 10;
			repaint();
		}
		if (k.getKeyCode() == KeyEvent.VK_DOWN) {
			y += 10;
			repaint();
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		requestFocusInWindow();
		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}



	@Override
	public void focusGained(FocusEvent arg0) {
//		hasFocus = true;
		repaint();
	}



	@Override
	public void focusLost(FocusEvent arg0) {
//		hasFocus = false;
		repaint();
	}


}
