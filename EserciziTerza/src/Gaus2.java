/*
 * Fippni Davide, Masevski Martin
 * 3^AI
 *
 */
import java.util.*;
public class Gaus2
{public static void main (String args[])
  {Scanner tastiera=new Scanner (System.in);
   int i,n,somma1,somma2;
   System.out.println("Inserisci il valore di n ");
   n=tastiera.nextInt();
   somma1=0;
   somma2=0;
   for (i=1;i<=n;i++)
     {somma1=somma1+i;}
   somma2=n*(n+1)/2;
   if (somma1==somma2)
	  {System.out.println("Ok");
	  }
  }
}