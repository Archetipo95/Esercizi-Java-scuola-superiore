/**
 * Masevski Fipponi
 * @author 4ai
 *
 */
import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner t= new Scanner (System.in);
		Vector <Fattura> vendite= new Vector <Fattura>();
		Vector <Contatto> clienti= new Vector <Contatto>();
		Vector <Dipendente> dipendenti= new Vector <Dipendente>();
		int n;
		String risp;
		
		do{
		System.out.println("PRESENTAZIONE MENU");
		System.out.print("Quale operazione vuoi fare? ");
		n=t.nextInt();
		t.nextLine();
		
		switch(n){
		
		case 1:
		do{
			System.out.print("Privato (p) o Azienda (a) ? ");
		risp=t.nextLine();
		
		}while(!(risp.equalsIgnoreCase("p") || risp.equalsIgnoreCase("a")));
		
		if(risp.equalsIgnoreCase("P")){	
		System.out.println("Contatto privato: ");                    
		Privato priv= new Privato ("Cognome", "Nome", "FISCALE");
		clienti.add(priv);
		}
		
		if(risp.equalsIgnoreCase("A")){
		System.out.println("Contatto azienda: ");
		Azienda azie= new Azienda("Ragione sociale", "IVA");
		clienti.add(azie);
		}
		break;
		case 2:
		
			for(int i=0; i<clienti.size(); i++){
			System.out.println(clienti.get(i));
		}
			break;
		case 3:
		System.out.println("Aggiungi una fattura: ");
		//Fattura fatt= new Fattura();
		}
		}while(n!=0);
	}
}