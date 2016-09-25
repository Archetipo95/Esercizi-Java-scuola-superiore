package PingPongRete2;

import java.awt.Dimension;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * 
 * @author 4ai Masevski Fipponi
 *
 */

public class ServerPong extends JFrame {
	private static final long serialVersionUID = 1L;

	private Socket socket = null;
	private DataOutputStream out = null;
	private DataInputStream input = null;

	public ServerPong() {
		super("Frame Server (pedana sinistra)");
		this.setUndecorated(true);
		this.setPreferredSize(new Dimension(400, 300) );
		this.pack();
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		new ThreadConnection(this);
		this.setResizable(false);
		this.setVisible(true);
	}

	public void setConnection(Socket socket) {
		this.socket = socket;
		try {
			out = new DataOutputStream(socket.getOutputStream());
			input = new DataInputStream(socket.getInputStream());
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,e.toString());
			System.exit(-1);
		}
		AnimationPannel pan = new AnimationPannel(this,this.getSize());
		this.add(pan);
	}
	public DataInputStream getInput() {
		return input;		
	}

	public DataOutputStream getOutput() {
		return out;		
	}	
}