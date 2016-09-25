package PingPongRete2;

import java.net.ServerSocket;

import javax.swing.JOptionPane;

/**
 * 
 * @author 4ai Masevski Fipponi
 *
 */

public class ThreadConnection implements Runnable {
	private ServerPong frame;
	private Thread th;
	private static int port = 7777;
	
	public ThreadConnection(ServerPong frame) {
		this.frame = frame;
		th = new Thread(this);
		th.start();
	}

	public void run() {
		try {
			ServerSocket server = new ServerSocket(port);
		   frame.setConnection(server.accept());
		   server.close();		   
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,e.toString());	
			System.exit(-1);
		}			
	}
}