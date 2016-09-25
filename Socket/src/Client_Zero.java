import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.Scanner;

public class Client_Zero {
    public static void main(String[] args) {
        try {

            Socket socket = new Socket("127.0.0.1",7777);
			System.out.println("Socket al Client:" + socket );

			
			
			PrintStream outClient 
			= new PrintStream(socket.getOutputStream());
            
			Scanner inClient = new Scanner(socket.getInputStream());

			outClient.println("ClientHello There..." 
            + (new Date().getTime())%100000 );
            String message = inClient.nextLine();
            System.out.println("CLIENT - Message: " + message);

            inClient.close();
            outClient.close();
            socket.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}