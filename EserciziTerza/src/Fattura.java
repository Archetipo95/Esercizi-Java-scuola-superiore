/*
 * Fippni Davide, Masevski Martin
 * 3^AI
 * 1/12/2012
 Dati 5 vettori 1 di stringhe (descrizioni), 1 di int (le quantità), 3 double (importoUnitario, ivaCalcolata, totaleRiga).
Leggere il numero di righe e poi, per ogni riga acquisire descrizione articolo, quantità, prezzo.
Per ogni riga calcolare l'importo dell'iva supposta una percentuale fissa del 21%, e il prezzo totale che è dato dall'importoUnitario*quantita + iva.
L'iva va calcolata su importoUnitario*quantita.
Visualizzare tutti i dati separandoli con un carattere di tabulazione inserito in una stringa "\t".
 
 */
import java.util.*;
public class Fattura 
	{public static void main(String[] args) 
      	{Scanner tastiera=new Scanner (System.in);
      	int n,i;
      	double totale=0;
      	System.out.print("Inserire numero articoli: ");
      	n=tastiera.nextInt();
      	String []descrizione= new String [n];
      	int []quantita= new int [n];
      	double []importoUnitario= new double [n];
      	double []ivaCalcolata= new double [n];
      	double []totaleRiga= new double [n];
      	System.out.println("");
      	for(i=0;i<n;i++)
      	{
      		System.out.print("Inserire quantità prodotto "+(i+1)+": ");
            quantita[i]=tastiera.nextInt();
            System.out.println("");
            tastiera.nextLine();
            System.out.print("Inserire descrizione prodotto "+(i+1)+": ");
            descrizione[i]=tastiera.nextLine();
            System.out.println("");
            System.out.print("Inserire prezzo prodotto "+(i+1)+": ");
            System.out.println("");
            importoUnitario[i]=tastiera.nextDouble();
            ivaCalcolata[i]=quantita[i]*importoUnitario[i]*21/100;
            totaleRiga[i]=importoUnitario[i]*quantita[i]+ivaCalcolata[i];
            totale=totale+totaleRiga[i];
           
      	}
      	System.out.println("NOME" + "\t" + "QUANTITA" + "\t" + "IMPORTO UNITARIO" + "\t" + "IVA CALCOLATA" + "\t" + "TOTALE");  
        for(i=0;i<n;i++)
      	{
        	System.out.println(descrizione[i] + "\t" + quantita[i] + "\t\t" + importoUnitario[i] + "\t\t\t" +ivaCalcolata[i] + "\t\t" + totaleRiga[i]);
      	}
      	System.out.println("\nIl totale è: "+totale);
      	
	}
}
	