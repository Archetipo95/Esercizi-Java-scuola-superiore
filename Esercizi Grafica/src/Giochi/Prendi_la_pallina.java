package Giochi;
/**
 * 4^AI
 * Masevski, Fipponi
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Prendi_la_pallina extends JPanel implements ActionListener, MouseListener {
	private static final long serialVersionUID = 1L;
	//private int dx1=1, dy1=1;		//valore di incremento x img1
	private int x1= 400,y1= 400;	//posizione iniziale ufo
	private Point p = null;
	private boolean running= true;		//sta ancora funzionando ?
	private int conta=0, xm, ym;
	int raggio_img=25;
	Timer timer;
	Image img1 = Toolkit.getDefaultToolkit().getImage("img/pallina2.png");
	Image img2 = Toolkit.getDefaultToolkit().getImage("img/space.png");

	public static void main(String args[]) {

		JFrame f = new JFrame("Prove Grafica");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		f.setUndecorated(true);
		f.setResizable(false);
		Container c = f.getContentPane();
		Prendi_la_pallina pan = new Prendi_la_pallina();
		c.add(pan);
		f.pack();
		f.setVisible(true);
	}

	Prendi_la_pallina() {
		setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
		addMouseListener(this);
		timer = new Timer (100, this);												//TIK timer
			timer.start();
	}

	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		
		int num = (int)(Math.random()*8);
		int valoreincremento = 0, valoreincremento2 = 0;
		
		if(num==0) {
			valoreincremento=(int)(Math.random()*10);		//destra
			for(int i=0; i<valoreincremento; i++){
				x1++;
			}
		}

		if(num==1) {
			valoreincremento=(int)(Math.random()*10);		//sinistra
			for(int i=0; i<valoreincremento; i++){
				x1--;
			}
		}

		if(num==2) {
			valoreincremento=(int)(Math.random()*10);		//su
			for(int i=0; i<valoreincremento; i++){
				y1--;
			}
		}

		if(num==3) {
			valoreincremento=(int)(Math.random()*10);		//giu
			for(int i=0; i<valoreincremento; i++){
				y1++;
			}
		}
		
		if(num==4) {
			valoreincremento=(int)(Math.random()*10);
			valoreincremento2=(int)(Math.random()*10);
			for(int i=0; i<valoreincremento; i++){
				for(int j=0; j<valoreincremento2; j++){
					y1-=i;
					x1+=j;
				}
			}
		}
		
		if(num==5) {
			valoreincremento=(int)(Math.random()*10);
			valoreincremento2=(int)(Math.random()*10);
			for(int i=0; i<valoreincremento; i++){
				for(int j=0; j<valoreincremento2; j++){
					y1+=i;
					x1+=j;
				}
			}
		}
		
		if(num==6) {
			valoreincremento=(int)(Math.random()*10);
			valoreincremento2=(int)(Math.random()*10);
			for(int i=0; i<valoreincremento; i++){
				for(int j=0; j<valoreincremento2; j++){
					y1+=i;
					x1-=j;
				}
			}
		}
	
		if(num==7) {
			valoreincremento=(int)(Math.random()*10);
			valoreincremento2=(int)(Math.random()*10);
			for(int i=0; i<valoreincremento; i++){
				for(int j=0; j<valoreincremento2; j++){
					y1-=i;
					x1-=j;
				}
			}
		}

		if (x1 < raggio_img) {
			//JOptionPane.showMessageDialog(null, "Hai fatto "+conta+" punti.");
			running= false;
			timer.stop();
		}
		if (x1 > getWidth() - raggio_img) {
			//JOptionPane.showMessageDialog(null, "Hai fatto "+conta+" punti.");
			
			running= false;
			timer.stop();
		}
		if (y1 < raggio_img/2) {
		//	JOptionPane.showMessageDialog(null, "Hai fatto "+conta+" punti.");
		
			running= false;
			timer.stop();
		}
		if (y1 > getHeight() - raggio_img/2) {
			//JOptionPane.showMessageDialog(null, "Hai fatto "+conta+" punti.");
			running= false;
			timer.stop();
		}

		g.drawImage(img2, 0, 0, this.getWidth(), this.getHeight(), this);
		g.setColor(Color.YELLOW);
		g.drawString(conta+" punti", 400, 20);
		g.drawImage(img1, x1 - raggio_img, y1 - raggio_img/2, this);					//pallina1
	}

	public void actionPerformed(ActionEvent e) {
		repaint();
	}
	public void mouseClicked(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
		p = e.getPoint();
		xm = (int)(p.getX());
		ym = (int)(p.getY());

		if((xm>x1-raggio_img && xm<x1+raggio_img) && (ym>y1-raggio_img && ym<y1+raggio_img) && (running)) {
			conta++;
		}
	}
	public void mouseReleased(MouseEvent e) {
	}
}