package Pall;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

/**
 * Applicazione client-server per passare una pallina da una finestra
 * ad un'altra
 * @author 4Ia Veronese - Slanzi
 * @version 13/05/2013 v2
 */

public class Server extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private DataOutputStream out;
	private DataInputStream input;
	private Socket socket;

	public Server() {
		super("Finestra Server");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		new Connessione(this);
		this.setBounds(300, 300, 300, 100);
		this.setVisible(true);
	}
	
	public void setconnetti(Socket socket) {
		this.socket = socket;
		try {
			out = new DataOutputStream(this.socket.getOutputStream());
			input = new DataInputStream(this.socket.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e.toString());
			System.exit(-1);
		}
		Pan p = new Pan(this, this.getSize());
		this.add(p);
	}
	
	public DataInputStream in() {
		return input;
	}

	public DataOutputStream outs() {
		return out;
	}
}

class Connessione implements Runnable {

	private Server server;
	private Thread th;

	public Connessione(Server server) {
		this.server = server;
		th = new Thread(this);
		th.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			ServerSocket sock = new ServerSocket(7777);
			server.setconnetti(sock.accept());
			sock.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e.toString());
			System.exit(-1);
		}
	}
}

class Pan extends JPanel implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Server server;
	private Image bufferVirtuale;
	private Graphics offScreen;
	private Timer tim = null;
	private int xPallina = 0;
	private int yPallina = getHeight()/2;
	private int diametroPallina = 30;
	private int spostamento = 3;
		
	private boolean destra,pallinaPresente,arrivoComunicato;
	
	public Pan(Server server, Dimension dimensioni)
	{
		super();
		this.server = server;
		destra = true;
		dimensioni = this.getSize();
		pallinaPresente = true;
		arrivoComunicato = false;
		tim = new Timer(1,this);	
		tim.start();
	}
	
	public void update(Graphics g)
	{
		paint(g);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		bufferVirtuale = createImage(getWidth(),getHeight());
		offScreen = bufferVirtuale.getGraphics();		
		Graphics2D screen = (Graphics2D) g;		
		offScreen.setColor(Color.red);
		if(pallinaPresente)
		{
			offScreen.drawOval(xPallina,yPallina,diametroPallina,diametroPallina);	
		}		
		screen.drawImage(bufferVirtuale,0,0,this);
		offScreen.dispose();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		repaint();
		if(pallinaPresente)
		{
			
			if(destra)
			{
				if((!arrivoComunicato)&&(xPallina >= (this.getWidth()-diametroPallina)))
				{
					/*
					 * devo comunicare al client che deve far entrare la pallina da destra
					 */
					try{
						server.outs().writeBoolean(destra);
						server.outs().writeInt(yPallina);
						arrivoComunicato = true;
					}catch(Exception ecc)
					{
						JOptionPane.showMessageDialog(null,ecc.toString());
						System.exit(-1);					
					}				
				}else{
					xPallina += spostamento;
					if(xPallina >= this.getWidth())
					{
						pallinaPresente = false;
						arrivoComunicato = false;							
					}					
				}
			}else{
				if(xPallina <=0 )
				{
					//cambio direzione
					destra = true;
					xPallina += spostamento;
				}else{
					xPallina -= spostamento;
				}
			}
		}else{
			/*
			 * devo rimanere in attesa del ritorno della pallina nella finestra Server
			 */
			boolean direzione;
			int y = 0;
			try
			{			
				direzione = server.in().readBoolean();
				y = server.in().readInt();
			    destra = direzione;
			    destra = false;
			    yPallina = y;
			    xPallina =getWidth();
			    pallinaPresente = true;
			}catch(Exception ecc)
			{
				 JOptionPane.showMessageDialog(null,ecc.toString());
				 System.exit(-1);			
			}	
		}
		repaint();		
	}
}
