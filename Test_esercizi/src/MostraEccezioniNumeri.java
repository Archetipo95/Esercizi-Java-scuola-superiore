
import java.util.Scanner;

/**
 * Classe per visualizzare errori runtime.
 * Prova a inserire un numero non corretto!
 * 
 * Exception in thread "main" java.util.InputMismatchException
	at java.util.Scanner.throwFor(Unknown Source)
	at java.util.Scanner.next(Unknown Source)
	at java.util.Scanner.nextDouble(Unknown Source)
	at eccezioni.MostraEccezioniNumeri.main(MostraEccezioniNumeri.java:18)

 * @author Mion-Santi 
 * @version 2013 11 12
 */
public class MostraEccezioniNumeri {
	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		int num;
		double prezzo;
		double importo;
		System.out.print("Inserisci numero panini:");
		num = keyb.nextInt();
		System.out.print("Inserisci prezzo panini:");
		prezzo = keyb.nextDouble();
		importo = num*prezzo;
		System.out.println("Per comprare " + num + " panini ");
		System.out.println("spendi " + importo + " euro ");
	}
}









