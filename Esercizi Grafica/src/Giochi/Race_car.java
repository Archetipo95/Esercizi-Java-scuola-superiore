package Giochi;
/**
 * Masevski
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Race_car extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	int dx1=(int)(Math.random()*5)+1;		//velocità img1
	int dx2=(int)(Math.random()*5)+1;      //velocità img2

	int x1=0, x2=0;

	//MAIN
	public static void main(String args[]) {

		JFrame f = new JFrame("Prove Grafica");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = f.getContentPane();
		Race_car pan = new Race_car();
		c.add(pan);
		f.setResizable(false);
		f.pack();
		f.setVisible(true);
	}

	Race_car(){
		setPreferredSize(new Dimension(800, 150));
	}

	protected void paintComponent(Graphics g) {
		//this.getWidth()
		//this.getHeight()
		super.paintComponent(g);

		Image img1 = Toolkit.getDefaultToolkit().getImage("img/green_car.png");
		Image img2 = Toolkit.getDefaultToolkit().getImage("img/red_car.png");
		Image img3 = Toolkit.getDefaultToolkit().getImage("img/arrivo.png");
		Image img4 = Toolkit.getDefaultToolkit().getImage("img/asfalto.png");
		//four attributes: the image, x/y position, an image observer

		Timer timer = new Timer (24, this);
		timer.start();
		g.drawImage(img4, 0, 0, this);				//sfondo
		g.drawImage(img3, 750, 0, this);			//arrivo
		g.drawImage(img1, x1, 15, this);			//mac1
		g.drawImage(img2, x2, 85, this);			//mac2

		System.out.println(x1 +" e "+ x2);
			x1+=dx1;
			x2+=dx2;



	}

	public void actionPerformed(ActionEvent e) {
		repaint();
	}
}