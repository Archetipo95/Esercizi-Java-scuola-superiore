/**
 *Lettura a linee di un file .txt con addizione
 * @author Fipponi-Masevski
 * @version 04/05/2013
 */
import java.io.*;
import java.util.*;

public class Es_lettura2 {
	public static void main(String[] args) throws IOException 
	{
		int  conta=0;
		double media, somma=0;
		String file= "Prova3.txt";	
			FileInputStream fin= new FileInputStream(file);
			Scanner t= new Scanner(fin);
			while(t.hasNext())
			{
				String parola=t.next();
				int n=Integer.parseInt(parola);
				somma=somma+n;
				conta++;
			}
			media=somma/conta;
			System.out.println("La somma è: "+somma);
			System.out.println("La media è: "+media);
	}
}

	
