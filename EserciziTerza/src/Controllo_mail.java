/*
 * Fippni Davide, Masevski Martin
 * 3^AI
 * 07/11/2012
 */
import java.util.*;
public class Controllo_mail {
	public static void main(String[] args) {
		int led;
		Scanner tastiera=new Scanner (System.in);
		System.out.println("Scrivi l'indirizzo e-mail: ");
		String indirizzo= tastiera.nextLine();
		String capovolta= "";
		int lunghezza = indirizzo.length();
		for(int i=lunghezza-1; i>=0; i= i-1)
		{ 
			capovolta=capovolta + indirizzo.charAt(i);
		}
		int posAt = capovolta.indexOf("@");
		int posPunto = capovolta.indexOf(".");
		if (posPunto<posAt && posAt>0 && posPunto>0)
		{
			led=1;
		}
		else
		{
			led=0;
		}


		if (led==1)
		{
			System.out.println("OKEY");
		}
		else 
		{
			System.out.println("Sbagliato");
		}
	}

}	