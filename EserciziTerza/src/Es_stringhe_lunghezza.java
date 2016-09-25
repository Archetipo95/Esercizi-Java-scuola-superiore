/*
 * Fippni Davide, Masevski Martin
 * 3^AI
 * 31/10/2012
 */
import java.util.*;
public class Es_stringhe_lunghezza 
	{public static void main (String args[])
	{ Scanner tastiera=new Scanner(System.in);
	System.out.println("Scrivi la prima frase: ");
	int lunghezza1,lunghezza2;
	String parola1= tastiera.nextLine();
	lunghezza1=parola1.length();
	System.out.println("Scrivi la seconda frase: ");
	String parola2= tastiera.nextLine();
	lunghezza2=parola2.length();
		if(lunghezza1>lunghezza2)
		{System.out.println("La più lunga è: "+parola1);
		}
		if(lunghezza1<lunghezza2)
		{System.out.println("La più lunga è: "+parola2);	
		}
		if(lunghezza1==lunghezza2)
		{System.out.println("Sono uguali");
		}
	}
	}

	