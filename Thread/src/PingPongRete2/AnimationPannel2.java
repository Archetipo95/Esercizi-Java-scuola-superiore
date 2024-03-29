package PingPongRete2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * 
 * @author 4ai Masevski Fipponi
 *
 */

public class AnimationPannel2 extends JPanel implements Runnable, KeyListener, ActionListener {
	private static final long serialVersionUID = 1L;

	private ClientPong frame;
	private Thread th;
	private Timer ti;
	private int xBall;
	private int yBall;
	private int sizeBall = 20;
	private int xPong1;
	private int yPong1;
	private int xPong2;
	private int yPong2;
	private int widthPong = 10;
	private int heightPong = 100;
	private boolean upPong2, downPong2;
	private int point1 = 0, point2 = 0;
	private boolean win1 = false, win2 = false;


	public AnimationPannel2(ClientPong frame,Dimension dimension) {
		super();
		this.frame = frame;
		this.setSize(dimension);
		xBall = frame.getWidth()/2;
		yBall = frame.getHeight()/2;
		xPong1 = 10;
		yPong1 = (frame.getHeight() / 2) - (heightPong / 2);
		xPong2 = frame.getWidth() - xPong1 - widthPong;
		yPong2= (frame.getHeight() / 2) - (heightPong / 2);
		upPong2 = false;
		downPong2 = false;
		frame.addKeyListener(this);
		th = new Thread(this);	
		th.start();
		ti = new Timer(1, this);
		ti.start();
	}
	
	public void run() {
		while(true){
//			send();
//			receive();
			repaint();
		}
	}
	
	public void receive() {
		try {			
			xBall = frame.getInput().readInt();
			yBall = frame.getInput().readInt();
			xPong1 = frame.getInput().readInt();
			yPong1 = frame.getInput().readInt();
			xPong2 = frame.getInput().readInt();
			yPong2 = frame.getInput().readInt();
			point1 = frame.getInput().readInt();
			point2 = frame.getInput().readInt();
			win1 = frame.getInput().readBoolean();
			win2 = frame.getInput().readBoolean();
		}catch(Exception ecc) {
			JOptionPane.showMessageDialog(null,ecc.toString());
			System.exit(-1);			
		}	
	}

	public void send() {
		try {
			frame.getOutput().writeBoolean(upPong2);
			frame.getOutput().writeBoolean(downPong2);
		}catch(Exception ecc) {
			JOptionPane.showMessageDialog(null,ecc.toString());
			System.exit(-1);					
		}		
	}

	public void paint(Graphics g) {
		super.paintComponent(g);		
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		g2.setColor(Color.RED);
		g2.fillRect(0, 0, frame.getWidth(), frame.getHeight());

		g2.setColor(Color.BLACK);
		g2.fillRect(4, 4, frame.getWidth()-8, frame.getHeight()-8);

		g2.setColor(Color.WHITE);
		g2.setFont(new Font("Arial Black", Font.PLAIN, 20));
		g2.drawString(""+point1, 5, 20);
		g2.drawString(""+point2, frame.getWidth()-30, 20);

		if(win1) {
			g2.drawString("Player 1 wins", 30, frame.getHeight()/2);
		}else if(win2) {
			g2.drawString("Player 2 wins", 230, frame.getHeight()/2 );
		}

		g2.setColor(Color.RED);
		g2.fillRect((frame.getWidth()/2)-2, 0, 4, frame.getHeight());
		g2.fillOval(xBall,yBall,sizeBall,sizeBall);
		g2.fillRoundRect(xPong1, yPong1, widthPong, heightPong, 10, 10);
		g2.fillRoundRect(xPong2, yPong2, widthPong, heightPong, 10, 10);
	}

	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();

		if (keyCode == KeyEvent.VK_UP) {
			upPong2= true;
		}

		if (keyCode == KeyEvent.VK_DOWN) {
			downPong2= true;
		}

		if (keyCode == KeyEvent.VK_ESCAPE) {
			System.exit(0);
		}
	}

	public void keyReleased(KeyEvent e) {
		int keyCode = e.getKeyCode();

		if (keyCode == KeyEvent.VK_UP) {
			upPong2 = false;
		}

		if (keyCode == KeyEvent.VK_DOWN) {
			downPong2 = false;
		}
	}

	public void keyTyped(KeyEvent e) {
	}

	public void actionPerformed(ActionEvent e) {
		send();
		receive();
	}
}