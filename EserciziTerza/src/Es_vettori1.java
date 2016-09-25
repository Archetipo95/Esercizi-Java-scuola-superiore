/*
 * Fippni Davide, Masevski Martin
 * 3^AI
 *
 */
import java.util.*;
public class Es_vettori1
    {
     public static void main (String args[])
     {Scanner tastiera=new Scanner (System.in);
     int i,minimo,massimo,q;
     double media,somma;
 	 q=0;
 	 massimo=0;
     System.out.println("Scrivi lunghezza vettore: ");
     q=tastiera.nextInt ();
     int []vett=new int [q];
 	 for (i=0; i<q; i++)
 		{
 		 System.out.println("Inserisci il valore:");
 		 vett [i]= tastiera.nextInt();
 		}
         somma=0;
         media=0;
         for(i=0; i<q; i++)
         {
         somma=somma+vett[i];
         }
         
         minimo=vett[0];
         for (i=1; i<q; i++)
  			{
        	 if (vett[i]<minimo)
        		 minimo=vett [i];
  			}
         massimo=vett[0];
         for (i=1; i<q; i++)
  			{
        	 if (vett[i]>massimo)
        		 massimo=vett [i];
  			}
         
         media=somma/q;
         System.out.println("La somma è: "+somma);
         System.out.println("La media è: "+media);
         System.out.println("Il massimo è: "+massimo);
         System.out.println("Il minimo è: "+minimo);
 	}
 
	  
  }

