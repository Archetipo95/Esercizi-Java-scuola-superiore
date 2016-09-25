package SlideShow;
/**
 * Masevski Fipponi
 * 2014
 */

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Slide extends JPanel implements ActionListener, MouseListener, MouseMotionListener{
	private static final long serialVersionUID = 1L;

	private static int lato = 600;								//lato frame
	private static JPanel p;
	private static String titolo = "Slide Immagini";			//titolo frame
	private static JFrame frame;								//frame

	private Timer timer;										//timer
	static ImageIcon img1, img2, img3, img4;
	static Image image1, image2, image3, image4;

	int zero=0, foto=0, x1=0,x11, x2=lato, x3, x4;											//numero della foto
	int dif=0;
	int y=lato;
	int x=lato;

	static JToolBar toolBar = new JToolBar();
	
	public static void main(String[] args) {
		frame = new JFrame(titolo);
		frame.getContentPane().add(toolBar, BorderLayout.SOUTH);
		toolBar.setFloatable(false);
		Container a = frame.getContentPane();
		Slide oggetto = new Slide();
		a.add(oggetto);
		JButton bot = new JButton("Back");
		toolBar.add(bot);
		JButton bot1 = new JButton("Next");
		toolBar.add(bot1);
		
//		a.add(c);
		
		
		frame.setSize(lato, lato);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public Slide() {
		super();
		setPreferredSize(new Dimension(lato, lato));
		addMouseListener(this);
		addMouseMotionListener(this);
//		timer = new Timer(24, this);
//		timer.start();
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		img1 = new ImageIcon("img/wall1.png");
		img2 = new ImageIcon("img/wall2.png");
		img3 = new ImageIcon("img/wall3.png");
		img4 = new ImageIcon("img/wall4.png");
		
		image1 = img1.getImage();
		image2 = img2.getImage();
		image3 = img3.getImage();
		image4 = img4.getImage();
		
		if(foto==0){
			System.out.println("img1");
			g.drawImage(image1, x1, x1, lato, lato, null);
		}
		if(foto==1){
			System.out.println("img2");
			g.drawImage(image2, x1, x1, lato, lato, null);
		}
		if(foto==2){
			System.out.println("img3");
			g.drawImage(image3, x1, x1, lato, lato, null);
		}
		if(foto==3){
			System.out.println("img4");
			g.drawImage(image4, x1, x1, lato, lato, null);
		}
		
		
	}

	public void actionPerformed(ActionEvent arg0) {
				repaint();
	}

	public void mouseClicked(MouseEvent arg0) {
		if(foto==3){
			foto=-1;
		}
		foto++;
		repaint();
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
	}

	public void mouseMoved(MouseEvent arg0) {
	}
}