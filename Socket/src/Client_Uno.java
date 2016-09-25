import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;

public class Client_Uno {
    public static void main(String[] args) {
        try {

            Socket socket = new Socket("127.0.0.1",7);
			System.out.println("Socket al Client:" + socket );

            ObjectOutputStream oos = new ObjectOutputStream(
            		socket.getOutputStream());
            
            ObjectInputStream ois = new ObjectInputStream(
            		socket.getInputStream());

            oos.writeObject("ClientHello There..." 
            + (new Date().getTime())%100000 );
            String message = (String) ois.readObject();
            System.out.println("CLIENT - Message: " + message);

            ois.close();
            oos.close();
            socket.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}