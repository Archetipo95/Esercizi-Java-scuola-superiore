/**
 *@author Fipponi Masevski
 * 4^AI
 * 
 */
import java.util.*;
public class Msg_rete {
	private Vector <Msg_terminali> vett;
	Scanner t;

	public Msg_rete(){
		vett= new Vector <Msg_terminali>();
		t=new Scanner(System.in);
	}

	public void invio(){
		String msg;
		System.out.print("Inserire messaggio da inviare: ");
		msg=t.nextLine();
		System.out.println("Inserire IP destinatario: ");
		String ipdest=t.nextLine();
		String frame=ipdest+msg;
		for(int i = 0; i<vett.size(); i++){
			 vett.elementAt(i).Ricevi(frame);
		}
		
	
	}

	public void aggiungi(){
		Msg_terminali a= new Msg_terminali();
		System.out.print("Inserire IP macchina: ");
		String ip= t.nextLine();
		a.setIp (ip);
		System.out.print("Inserire SUBNET macchina: ");
		String sub= t.nextLine();
		a.setSub (sub);
		vett.add(a);
	}
	
	public void rimuovi(){
		System.out.print("Inserire IP macchina da rimuovere: ");
		String ip= t.nextLine();
		int trovato=0;
			for(int i=0; i<vett.size(); i++)
			{
				if(ip.equals(vett.elementAt(i).getIp()))
				{
					vett.remove(i);
					trovato=1;
				}
			}
			if(trovato==0){
				System.out.println("Terminale non trovato!");
			}
		
	}
	
	public void visualizzaterminali(){
		for(int i=0; i<vett.size(); i++)
			{
				System.out.println(vett.elementAt(i).toString());
			}

	}
	
	public void visualizzaMsg(){
		int trovato=0;
		System.out.print("Inserire IP destinatario: ");
		String ipdest= t.nextLine();
		for(int i=0; i<vett.size(); i++)
		{
			if(ipdest.equals(vett.elementAt(i).getIp()))
			{
				trovato=1;
				vett.elementAt(i).getBuffer();
			}
		}
		if(trovato==0){
			System.out.println("Terminale non trovato!");
		}
	}
	
}
