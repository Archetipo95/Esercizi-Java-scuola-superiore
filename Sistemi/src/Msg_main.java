/**
 *@author Fipponi Masevski
 * 4^AI
 * 
 */
import java.util.*;

public class Msg_main {
	public static void main(String[] args){
		Scanner t= new Scanner(System.in);
		Msg_rete rete = new Msg_rete();
		int scelta=0;
		do
		{
			System.out.println(" 1. Aggiungi un terminale \n 2. Togli un terminale \n 3. Elenca i terminali presenti \n 4. Invia messaggio \n 5. Visualizza Messaggio");
			scelta=t.nextInt();
			t.nextLine();
			
			if(scelta==1)
				{
					rete.aggiungi();
				}
			if(scelta==2)
				{
					rete.rimuovi();
				}
			if (scelta==3)
				{
					rete.visualizzaterminali();
				}
			if (scelta==4)
				{
					rete.invio();
				}
			if (scelta==5)
				{
					rete.visualizzaMsg();
				}
		}
		while (scelta>=1 && scelta < 6);


	
	}

}