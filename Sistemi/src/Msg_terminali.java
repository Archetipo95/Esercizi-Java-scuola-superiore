/**
 *@author Fipponi Masevski
 * 4^AI
 * 
 */
import java.util.*;
public class Msg_terminali {

	private String ip;
	private String sub;
	private Vector <String> buffer;
	Scanner t=new Scanner(System.in);

	public Msg_terminali(){
		buffer= new Vector();
		ip=null;
		setSub(null);
	}

	public Msg_terminali(String ip, String sub){
		buffer=new Vector();
		setIp(ip);
		setSub(sub);
	}

	
	
	public void Ricevi(String msg){
		buffer.add(msg);
	}
	
	public String getIp(){
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
	public void VisualizzaMsg(){
		System.out.println("MESSAGGIO: ");
		for(int i=0; i<buffer.size(); i++){
			System.out.println(buffer.get(i));
		}
	}

	public String toString() {
		
		return "Terminale: ip=" + ip + ", sub=" + sub;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;	
	}

	public Vector<String> getBuffer() {
		return buffer;
	}
}