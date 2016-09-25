package EsVerifica;
/**
 * Fipponi Masevski
 */
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Es4_Verifica extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	int dx1=(int)(Math.random()*10)+1;		//velocità img1
	int dx2=(int)(Math.random()*10)+1;      //velocità img2

	int x1=0, x2=0;

	Timer timer;

	//MAIN
	public static void main(String args[]) {

		JFrame f = new JFrame("Prove Grafica");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = f.getContentPane();
		Es4_Verifica pan = new Es4_Verifica();
		c.add(pan);
		f.setResizable(false);
		f.pack();
		f.setVisible(true);
	}

	Es4_Verifica(){
		setPreferredSize(new Dimension(800, 150));
		timer = new Timer (24, this);
		timer.start();
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		Image img1 = Toolkit.getDefaultToolkit().getImage("img/pallina.png");
		Image img2 = Toolkit.getDefaultToolkit().getImage("img/pallina.png");

		g.drawImage(img1, x1, 15, this);			//mac1
		g.drawImage(img2, x2, 85, this);			//mac2

		x1+=dx1;
		x2+=dx2;

		if(x1>600 && x2>600){
			System.out.println("Pari");
			timer.stop();
		}
		else{
			if(x1>600)	{
				System.out.println("Vince la pallina 1");
				timer.stop();
			}
			if (x2>600){
				System.out.println("Vince la pallina 2");
				timer.stop();
			}
			if(x1>600 && x2>600){
				System.out.println("Pari");
				timer.stop();
			}	
		}
	}

	public void actionPerformed(ActionEvent e) {
		repaint();
	}
}