import java.net.InetAddress;
import java.net.UnknownHostException;


public class GetByName {
	public static void main(String[] args) {
		String hostName = "www.google.com";
		try {
			System.out.println("Recuperare l'indirizzo da host name:"
					+ hostName);
			InetAddress inet = InetAddress.getByName(hostName);
			System.out.println(inet);
			System.out.println();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			//InetAddress inet = InetAddress.getByName(hostName);
			System.out.println("Recuperare tutti gli indirizzi da un host name:" + hostName);
			InetAddress inetAll[] = InetAddress.getAllByName(hostName);
			for(int i=0; i<inetAll.length; ++i)
				System.out.println(inetAll[i]);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
