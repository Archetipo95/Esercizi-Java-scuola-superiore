/**
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 11 12 13 14 15
 * 
 * Se n=5 devo ottenere il triangolo di sopra disegnato.
 * 
 * @author Fipponi, Masevski 4ai
 * @version 17/09/2013
 */
import java.util.*;
public class TriangoloFloyd {
	public static void main(String[] args) {
		Scanner t=new Scanner (System.in);
		int n,j=1;
		/**
		 * Chiede un numero naturale maggiore di zero per sapere quante righe fare (n).
		 */
		do{
			System.out.print("Scrivi un numero (maggiore di zero): ");
			n=t.nextInt();
		}while(n<1);


		for(int i=1;i<=n;i++){
			/**
			 * Printa 1
			 */
			if(i==1){
				System.out.print(j);
				j++;
			}
			/**
			 * Printa i numeri di una riga a seconda del K che deve comunque essere minore di i
			 */
			else{
				System.out.println("");
				for(int k=0;k<i;k++){
					System.out.print(j+" ");
					j++;
				}
			}
		}	
	}
}