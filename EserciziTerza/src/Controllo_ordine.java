/*
 * Fippni Davide, Masevski Martin
 * 3^AI
 * 07/11/2012
 */
import java.util.*;
public class Controllo_ordine {
	public static void main(String[] args) {
		Scanner tastiera=new Scanner (System.in);
		System.out.println("Scrivi una stringa: ");
		String linea= tastiera.nextLine();
		System.out.println("Scrivi un'altra stringa: ");
		String linea2= tastiera.nextLine();
		int comp= linea.compareToIgnoreCase(linea2);
		if (comp==0)
		{
			System.out.println("Sono uguali");
		}	
		if (comp<0)
		{
			System.out.println("La prima stringa in ordine alfabetico è: "+linea);
		}
		if (comp>0)
		{
			System.out.println("La prima stringa in ordine alfabetico è: "+linea2);
		}
	}

}
