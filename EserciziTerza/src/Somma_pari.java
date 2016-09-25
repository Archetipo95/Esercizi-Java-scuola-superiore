/*
 * Fippni Davide, Masevski Martin
 * 3^AI
 *
 */
import java.util.Scanner;
public class Somma_pari
{public static void main (String args[])
{Scanner tastiera=new Scanner (System.in);
int i,n,somma;
System.out.println("Inserisci il valore di n ");
n=tastiera.nextInt();
somma=0;
for (i=2;i<=n;i=i+2)
{somma=somma+i;}
System.out.println("La somma è: "+somma);  
}
}