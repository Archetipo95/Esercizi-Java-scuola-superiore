/*
 * Fippni Davide, Masevski Martin
 * 3^AI
 * 31/10/2012
 */
import java.util.*;
public class Es_stringhe_palindroma 
	{public static void main (String args[])
	{ 
		Scanner tastiera=new Scanner(System.in);
		int carattere,contacarattere,led;
		System.out.print("Scrivi una parola: ");
		String parola= tastiera.nextLine();
		carattere=0; contacarattere=0;
		String capovolta="";
		led=0;
		int lunghezza= parola.length();
		for(int i=lunghezza-1; i>=0; i= i-1)
		{ 
			capovolta=capovolta + parola.charAt(i);
		}
	
		while(contacarattere<lunghezza)
			{
				if (!(parola.charAt(carattere)==capovolta.charAt(carattere)))
				{ 
					led=led+1;
					carattere=carattere+1;
				}
				else 
				{
					carattere=carattere+1;
				}
				contacarattere=contacarattere+1;
			}
		if(led==0)
		{
			System.out.println("PALINDROMA");
		}
		else System.out.println("NON E PALINDROMA");
	}
}
