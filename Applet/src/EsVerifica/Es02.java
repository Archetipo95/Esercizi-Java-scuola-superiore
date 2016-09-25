/**
 * 
 */
package EsVerifica;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Es02 extends JApplet implements ActionListener {

	private static final long serialVersionUID = 1L;
	Timer timer;
	JLabel label;
	String s;

	public void init() {
		super.init();
		timer = new Timer(1000, this);
		label = new JLabel();
//		getContentPane().setBackground(Color.WHITE);
		getContentPane().add(label);
		label.setLayout(new FlowLayout());
		s = getParameter("scritta");
		if(s==null){
			s = "Stringa nulla";
		}
		Container c = getContentPane();
	}

	public void start() {
		super.start();
			timer.start();
	}

	public void actionPerformed(ActionEvent arg0) {
		repaint();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		int w = getWidth();
		int h = getHeight();
		
		int x=(int) (Math.random()*w);
		int y=(int) (Math.random()*h);
		g.drawString(s, x, y);
		}
}