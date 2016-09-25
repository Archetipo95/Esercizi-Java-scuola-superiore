/*
 * Fippni Davide, Masevski Martin
 * 3^AI
 *
 */
import java.util.*;
public class Es_vettori0 {

	public static void main(String[] args) {
	Scanner tastiera=new Scanner (System.in);
	int i,somma;
	int []vett=new int [10];
	for (i=0; i<10; i++)
		{System.out.println("Inserisci il valore");
		vett [i]= tastiera.nextInt();
		}
        somma=0;
        for(i=0; i<10; i++)
        {
        somma=somma+vett[i];	
        }
        System.out.println("La somma è: "+somma);	
	}
}
