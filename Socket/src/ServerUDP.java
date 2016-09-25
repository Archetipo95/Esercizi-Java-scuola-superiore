/*
1 /127.0.0.1:1044
2 /127.0.0.1:1045
3 /127.0.0.1:1046
4 /127.0.0.1:1047
5 /127.0.0.1:1048
 */

import java.net.*;
import java.io.IOException;


/*
 * ServerUDP.java
 * Applicazione client/server su trasporto UDP: esempio di echo
 * - il client invia un messaggio ClientUDP.java
 * - il server restituisce lo stesso messaggio ServerUDP.java
 */ 

public class ServerUDP {
	public static void main (String args[]){
		try {
			// IP del server assegnato implicitamente 
			DatagramSocket server = new DatagramSocket(8888); // e porta 8888
			//System.out.println("Server UDP");
			//un esemplare vuoto di DatagramPacket
			// - un array di byte vuoto
			// - la dimensione dell array
			byte[]b1 = new byte[256];

			DatagramPacket messaggioUDP = new DatagramPacket(b1, b1.length);

			//riceve il messaggio UDP e confeziona il messaggio di risposta
			while(true)
			{
				server.receive(messaggioUDP);         //bloccante
				server.send(messaggioUDP);            //non bloccante
			}

		}catch(UnknownHostException uhe)
		{
			System.err.println("Host sconosciuto " + uhe.getMessage());
		}
		catch(SocketException se)
		{
			System.err.println("Connessione non riuscita " + se.getMessage());
		}
		catch(IOException ioe)
		{
			System.err.println("Ricezione o invio pacchetto non riuscita " + ioe.getMessage());
		}
	}

}
