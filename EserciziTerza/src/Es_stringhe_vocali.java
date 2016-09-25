/*
 * Fippni Davide, Masevski Martin
 * 3^AI
 * 31/10/2012
 */
import java.util.*;
public class Es_stringhe_vocali 
	{public static void main (String args[])
	{ Scanner tastiera=new Scanner(System.in);
	System.out.println("Scrivi una frase: ");
	int conta,carattere,lunghezza;
	carattere= 0;
	String linea= tastiera.nextLine();
	lunghezza=linea.length();
		for (conta=0;conta<lunghezza;conta=conta+1)
		{
			if (linea.charAt(carattere)=='a' || linea.charAt(carattere)=='e' || linea.charAt(carattere)=='i' || linea.charAt(carattere)=='o' || linea.charAt(carattere)=='u')
			{System.out.print(linea.charAt(carattere)+"-");
			}
		carattere=carattere+1;
		}
	}
	}


