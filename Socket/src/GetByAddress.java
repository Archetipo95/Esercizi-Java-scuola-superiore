import java.net.InetAddress;
import java.net.UnknownHostException;


public class GetByAddress {

	public static void main(String[] args) {
		byte [] ad = new byte[]{(byte)173, (byte)194, (byte)44, (byte)80};
		try {
			System.out.println("Test nome da indirizzo");
			InetAddress addr =  InetAddress.getByAddress(ad);
			System.out.println(addr.getHostName());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}