package EsVerifica;
/**
 * 4^AI
 * Masevski, Fipponi
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Es5_Verifica extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	int dx1=1, dy1=1;		//valore di incremento x img1
	int x1=150,y1=150;
	Timer timer;
	
	public static void main(String args[]) {

		JFrame f = new JFrame("Prove Grafica");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = f.getContentPane();
		Es5_Verifica pan = new Es5_Verifica();
		c.add(pan);
		f.pack();
		f.setVisible(true);
	}
	
	Es5_Verifica(){
		setPreferredSize(new Dimension(300, 350));
		timer = new Timer (5, this);
		timer.start();
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Image img1 = Toolkit.getDefaultToolkit().getImage("img/pallina.png");

		int raggio_img=5;
		
		x1+=dx1*(int)(Math.random()*10);
		y1+=dy1*(int)(Math.random()*10);
		
		x1-=dx1*(int)(Math.random()*10);
		y1-=dy1*(int)(Math.random()*10);
		
		
		if (x1 < raggio_img)				timer.stop();
		if (x1 > getWidth() - raggio_img)	timer.stop();
		if (y1 < raggio_img)				timer.stop();
		if (y1 > getHeight() - raggio_img)	timer.stop();

		g.drawImage(img1, x1 - raggio_img, y1 - raggio_img, this);			//UFO
	}

	public void actionPerformed(ActionEvent e) {		
		repaint();
	}
}