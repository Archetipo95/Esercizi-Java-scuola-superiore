

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Classe per esemplificare la gestione di eccezioni runtime.
 * Prende InputMismatchException generate da fomato numerico errato.
 *
 * @author Mion-Santi 
 * @version 2013 11 12
 */
public class GestioneEccezioniNumeri1 {
	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		int num;
		double prezzo;
		double importo;
		try {
			System.out.print("Inserisci numero panini:");
			num = keyb.nextInt();
			System.out.print("Inserisci prezzo panini:");
			prezzo = keyb.nextDouble();
			importo = num*prezzo;
			System.out.println("Per comprare " + num + " panini ");
			System.out.println("spendi " + importo + " euro ");
		}
		catch(InputMismatchException ime)
		{
			System.out.println("Hai inserito un numero in formato errato!");
		}
	}

}
