/*
 * Fippni Davide, Masevski Martin
 * 3^AI
 * 10/11/2012
 */
import java.util.*;
public class Controllo_cf {
	public static void main(String args[]) {
		int i,lunghezza,k;
		char lettera;
		Scanner tastiera= new Scanner (System.in);
		System.out.println("Scrivi il codice fiscale: ");
		String cf= tastiera.nextLine();
		String CF= cf.toUpperCase();
		i=0;
		lettera=CF.charAt(i);
		String pezzo1 = CF.substring(0, 6);
		//String pezzo2 = CF.substring(6, 8);
		//String pezzo3 = CF.substring(8, 9);
		//String pezzo4 = CF.substring(9, 11);
		//String pezzo5 = CF.substring(11, 12);
		//String pezzo6 = CF.substring(12, 15);
		//String pezzo7 = CF.substring(15, 16);
		lunghezza = pezzo1.length();
		
		for (k=0;k==lunghezza;k++)
		{
			lettera=CF.charAt(i);
			i=i++;
			if (lettera>='A' && lettera<='Z')
			{
				System.out.println("ok");
			}
		}
	
	// rmsncl72r21h620l	
		
		
		
		
		
		
		
	}

}
