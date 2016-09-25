package ServerClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTCP {
	public static void main (String[]args)  {
		try{
			InetAddress addr = InetAddress.getLocalHost();
			int porta = 7777;
			Socket sock = new Socket(addr, porta);
			System.out.println("Indirizzo del socket: "+sock.getLocalAddress()+" porta: "+ sock.getPort());
			PrintWriter out = new PrintWriter(sock.getOutputStream());
			out.println("Sono un client");
			out.flush();
			BufferedReader reader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			System.out.println(reader.readLine());
			reader.close();
			out.close();
			sock.close();
		}catch(UnknownHostException e){
			System.err.println("Host sconosciuto: "+ e.getMessage());
		}catch(IOException e){
			System.err.println("Conessione non riuscita: "+e.getMessage());
		}
	}
}
