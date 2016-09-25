import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_Uno {
	private ServerSocket server;
	private final int port = 7;

	public Server_Uno() {
		try {
			server = new ServerSocket(port);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Server_Uno example = new Server_Uno();
		example.handleConnection();
	}

	public void handleConnection() {

		while (true) {
			System.out.println("SERVER - Aspetto messaggio...");
			try {
				Socket socket = server.accept();
				System.out.println("Socket al Server:" + socket );
				makeConnection(socket);
				System.out.println("SERVER - Finita comunicazione");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void makeConnection(Socket sock)
	{
		try
		{
			// Attendo messaggio dal client
			ObjectInputStream ois = new ObjectInputStream(sock.getInputStream());
			ObjectOutputStream oos = new ObjectOutputStream(sock.getOutputStream());

			String message = (String) ois.readObject();
			System.out.println("SERVER - Message Received: " + message);
			System.out.println("SERVER ELABORAZIONE IN CORSO...");

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {		}
			
			// Invia una risposta
			System.out.println("SERVER RISPONDE");
			oos.writeObject("ServerHello - Connet");
			oos.close();

			ois.close();
			sock.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}



