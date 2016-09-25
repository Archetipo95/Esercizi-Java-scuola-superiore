package ServerClient;

import java.io.IOException;
import java.net.*;

public class MultiServerTCP {
	public static void main (String[] args) {
		try {
			ServerSocket server = new ServerSocket(7777);
			
			while(true) {
				Socket sock = server.accept();
				
				Thread thread = new SingleServerTCP(sock);
				thread.start();
			}
		}catch(IOException e) {
			System.err.println("Connessione non riuscita: "+ e.getMessage());
		}
	}
}
