package ServerClient;

import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;


public class SingleServerTCP extends Thread {
	private Socket sock;
	
	public SingleServerTCP(Socket s) {
		sock = s;
	}
		public void run()  {
			try {
				BufferedReader reader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				String msg = reader.readLine();
				PrintWriter out = new PrintWriter(sock.getOutputStream());
				out.println("Al server è arrivato il msg: "+ msg);
				out.flush();
				InetAddress remoteIP = sock.getInetAddress();
				System.out.println("Conessione riuscita dal client: "+remoteIP+" porta: "+sock.getPort());
			}catch(UnknownHostException e){
				System.err.println("Host sconosciuto: "+e.getMessage());
			}catch(IOException e){
				System.err.println("Conessione non riuscita: "+e.getMessage());
			}
		}
	}