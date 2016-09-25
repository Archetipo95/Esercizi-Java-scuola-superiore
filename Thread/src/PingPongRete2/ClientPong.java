package PingPongRete2;

import java.awt.Container;
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

public class ClientPong extends JFrame {
	private static final long serialVersionUID = 1L;

	private Socket socket = null;
	private DataOutputStream out = null;
	private DataInputStream input = null;
	private static int port = 7777;

	public ClientPong() {
		super("Frame Client (pedana destra)");
		this.setUndecorated(true);
		this.setPreferredSize(new Dimension(400, 300) );
		this.pack();
		this.setLocation(800, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Connect();
		this.setResizable(false);
		this.setVisible(true);
	}

	public void Connect() {
		try {
			socket = new Socket("localhost", port);
			out = new DataOutputStream(socket.getOutputStream());
			input = new DataInputStream(socket.getInputStream());
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,e.toString());
			System.exit(-1);
		}
		Container c = this.getContentPane();
		AnimationPannel2 pan = new AnimationPannel2(this, c.getSize());
		c.add(pan);
	}

	public DataInputStream getInput() {
		return input;		
	}

	public DataOutputStream getOutput() {
		return out;		
	}	
}