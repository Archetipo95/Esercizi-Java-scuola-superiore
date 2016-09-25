/**
Esempio sull'uso delle stringhe: classe String.
@author Ramosini-Santi
@version 27 ott 2012
 */
public class Stringhe1

{public static void main(String[] args)
	//crea una stringa IMPLICITAMENTE
{String panino1 = "panino al salame";
System.out.println(panino1);


	// creazione esplicita di una String di valore "panino al formaggio"
	// ESATTAMENTE: crea una nuova ISTANZA di String
String panino2 = new String("panino al formaggio");
System.out.println(panino2);

	// assegnamento di stringhe
	// ATTENZIONE: tutte due le variabili riferiscono allo stesso contenuto
String panino3 = panino1;
System.out.println(panino3);

	// concatenazione di stringhe
String panino4= panino1 + " e salsa";
System.out.println(panino4);

	// concatenazione di stringhe e numeri
int numero=4;
System.out.println("Vorrei "+numero+" " +panino4);

	// sottostringa finale
String pezzo1=panino1.substring(10);
System.out.println(pezzo1);

	// sottostringa 
String pezzo2 = panino1.substring(0, 6);
System.out.println(pezzo2);

	// lunghezza di una stringa
int l1 = panino1.length();
System.out.println("La stringa panino1 è lunga "+ l1);

	// estrazione di un carattere da una stringa
System.out.println("panino1 inizia con il carattere: "+ panino1.charAt(0));

	// scansione della stringa un carattere alla volte
for(int i=0; i<panino1.length(); i= i+1)
	System.out.println("Il carattere alla pos. " + i+ " è " + panino1.charAt(i));



}
}