package Pall2;
import java.awt.*;

import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

/**
 * Server
 * @author 4Ia Veronese Slanzi
 * @version 01/06/2013
 */

public class F1 extends JFrame
{
	private Socket connessione = null;
	private DataOutputStream out = null;
	private DataInputStream input = null;
	
	public F1()
	{
		super("Finestra 1");
		this.setBounds(200,300,300,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//instanzio un oggetto di classe ThreadConnessione per attendere la connessione di un client		
		new ThreadConnessione(this);
		this.setVisible(true);
	}
	
	public void setConnessione(Socket connessione)
	{
		//ricevo il riferimento per la connessione con il client
		this.connessione = connessione;
		   //ricevo lo stream di output e di input
		   try
		   {
		       out = new DataOutputStream(connessione.getOutputStream());
		       input = new DataInputStream(connessione.getInputStream());
		   }catch(Exception e)
		   {
			   JOptionPane.showMessageDialog(null,e.toString());
			   System.exit(-1);
		   }
		PannelloAnimazione pan = new PannelloAnimazione(this,this.getSize());
		this.add(pan);
	}
	
	public DataInputStream getInput()
	{
		return input;		
	}
	
	public DataOutputStream getOutput()
	{
		return out;		
	}
}


class ThreadConnessione implements Runnable
{
	private F1 finestra;
	private Thread me;
	
	public ThreadConnessione(F1 finestra)
	{
		//ottengo il riferimento alla JFrame
		this.finestra = finestra;		
		//instanzio il Thread
		me = new Thread(this);
		//attivo il Thread
		me.start();
	}
	
	public void run()
	{
		try
		{
			//instanzio un oggetto di classe ServerSocket in ascolto sulla porta 7777
		   ServerSocket server = new ServerSocket(7777);
		    //rimango in attesa di una connessione
		   finestra.setConnessione(server.accept());
		    //chiudo il server
		   server.close();		   
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,e.toString());	
			System.exit(-1);
		}		
	}
}



class PannelloAnimazione extends JPanel implements ActionListener
{
	private F1 finestra;
	private Dimension dimensioni;
	
	private Image bufferVirtuale;
	private Graphics offScreen;
	
	private Timer tim = null;
	private int xPallina = 10;
	private int yPallina = getHeight()/2;
	private int diametroPallina = 30;
	private int spostamento = 2;
	private int timerDelay = 5;
		
	private boolean destra,pallinaPresente,arrivoComunicato;
	
	public PannelloAnimazione(F1 finestra,Dimension dimensioni)
	{
		super();
		this.finestra = finestra;
		this.setSize(dimensioni);
		//do le direzioni iniziali della pallina
		destra = true;
		//la pallina parte da questa Finestra
		pallinaPresente = true;
		arrivoComunicato = false;
		tim = new Timer(timerDelay,this);	
		tim.start();
	}
	
	public void update(Graphics g)
	{
		paint(g);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		//DoppioBuffering
		bufferVirtuale = createImage(getWidth(),getHeight());
		offScreen = bufferVirtuale.getGraphics();		
		Graphics2D screen = (Graphics2D) g;			
		//PALLA
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
		if(pallinaPresente)
		{
			/*direzione orizzontale*/		
			if(destra)
			{
				if((!arrivoComunicato)&&(xPallina > (this.getWidth()-diametroPallina)))
				{
					/*
					 * devo comunicare al client che deve far entrare la pallina da destra
					 */
					try{
						finestra.getOutput().writeBoolean(destra);
						finestra.getOutput().writeInt(yPallina);
						arrivoComunicato = true;
					}catch(Exception ecc)
					{
						JOptionPane.showMessageDialog(null,ecc.toString());
						System.exit(-1);					
					}				
				}else{
					xPallina += spostamento;
					if(xPallina > this.getWidth())
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
			 * devo rimanere in attesa del ritorno della pallina nel mio schermo
			 */
			int y = getHeight()/2;
			try
			{			
				destra = finestra.getInput().readBoolean();
				y = finestra.getInput().readInt();
			    destra = false;
			    yPallina = y;
			    xPallina = this.getWidth();
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