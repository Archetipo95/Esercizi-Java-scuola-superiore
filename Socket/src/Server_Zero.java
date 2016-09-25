import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server_Zero {


	public static void main(String[] args) {
		ServerSocket server;
		final int port = 7777;
		try {
			server = new ServerSocket(port);

			while (true) {
				System.out.println("SERVER - Aspetto messaggio...");
				try {
					Socket sock = server.accept();
					System.out.println("Socket al Server:" + sock );

					// comunicazione inizio
					// Attendo messaggio dal client
					Scanner inServer = new Scanner(sock.getInputStream());
					PrintStream outServer = new PrintStream(sock.getOutputStream());
					String message = inServer.nextLine();
					System.out.println("SERVER - Message Received: " + message);
					System.out.println("SERVER ELABORAZIONE IN CORSO...");

					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {		}

					// Invia una risposta
					System.out.println("SERVER RISPONDE");
					outServer.println("ServerHello - Connet");
					outServer.close();
					inServer.close();
					sock.close();

					// fine


					System.out.println("SERVER - Finita comunicazione");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*
		try
		{
		} catch (IOException e) {
			e.printStackTrace();
		} 
		 */
	}
}





