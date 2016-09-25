/**Si vuole gestire la vendita dei biglietti di una partita di calcio.
I dati sono contenuti in un file di testo calcio.txt organizzati secondo il seguente protocollo:
NOMEPARTITA#DATA#POSIZIONE#NUMEROPOSTO#PREZZO

Ad esempio:
juve-milan#10/05/2013#curva#5#40,00
juve-milan#10/05/2013#tribuna#75#55,00
.......

Costruire una classe "partita" che ha i seguenti attributi: Nome partita, giorno, mese, anno

Costruire poi la classe "biglietto" estensione della classe "partita" con i seguenti attributi aggiuntivi: posizione, numero posto, prezzo.

Nel programma principale definire un vettore di oggetti di tipo "biglietto" che viene caricato mediante i dati contenuti nel file.
Determinare infine il totale dell'incasso.**/

/*
Classe 3AI
29/05/2013
Fipponi, Masevski
*/

import java.util.*;
import java.io.*;
public class Partita_main {

	
	public static void main(String[] args) throws IOException {
		String nomefile, linea;
		int conta, incasso, i;
		double prezzo;
		nomefile="Partita.txt";
		FileInputStream fin= new FileInputStream(nomefile);
		Scanner in= new Scanner(fin);
		conta=0;
		prezzo=0;
		i=0;
		while(in.hasNextLine())
			{
				linea=in.nextLine();
				conta++;
			}
		Biglietto[] Biglietto=new Biglietto [conta];
		String vett[]= new String[5];
		FileInputStream fin2= new FileInputStream(nomefile);
		Scanner in2= new Scanner(fin2);
		
		System.out.printf("%-15.25s     %-10s    %-10s   %7s    %7s\n",
				"Nome partita",
				"Data",
				"Posizione",
				"N.posto",
				"Prezzo");
		
		while(in2.hasNextLine())
			{
				linea=in2.nextLine();
				vett=Utile.Separatore(linea, '#');
				Biglietto[i]=new Biglietto(vett[0], vett[1], vett[2], vett[3], vett[4]);
				prezzo=prezzo+Biglietto[i].getPrezzo();
				
			
		System.out.printf("%-15.25s     %-10s    %-10s   %7d    %7.2f\n",
		Biglietto[i].getNomepartita(), 
		vett[1],
		Biglietto[i].getPosizione(),
		Biglietto[i].getNumeroposto(),
		Biglietto[i].getPrezzo());
		
		i++;
			}
		
		System.out.println();
		System.out.println("\t \t \t \t \t Il prezzo totale è: "+prezzo);
	}

}
