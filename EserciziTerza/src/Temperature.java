/*
 * Fippni Davide, Masevski Martin
 * 3^AI
 * 
 */
import java.util.*;
public class Temperature {


	public static void main(String[] args) {
		Scanner tastiera=new Scanner (System.in);
		double tempmax,tempmin,mediatot,sommamin,sommamax,mediamin,mediamax,valoremin_min,valoremax_min,valoremin_max,valoremax_max;	
		int n=4;
		int i=1;
		sommamin=0;
		sommamax=0;
		valoremin_min=41.0;
		valoremax_min=-11.0;
		valoremin_max=41.0;
		valoremax_max=-11.0;
		while (i<=n)
		{  

			System.out.println("Inserisci temperatura minima giorno "+i+": ");
			tempmin=tastiera.nextDouble();
			while (!(tempmin>=-10.0 && tempmin<40.0))
			{System.out.println("Reinserire temperatura minima giorno "+i+": ");
			tempmin=tastiera.nextDouble();
			}
			System.out.println("Inserisci temperatura massima giorno "+i+": ");
			tempmax=tastiera.nextDouble();
			while (!(tempmax>=-10.0 && tempmax<40.0))
			{
				System.out.println("Reinserire temperatura massima giorno "+i+": ");
				tempmax=tastiera.nextDouble();
			}
			i=i+1;
			sommamin=sommamin+tempmin;
			sommamax=sommamax+tempmax;

			if(tempmin<valoremin_min)
			{
				valoremin_min=tempmin;
			}
			if(tempmin>valoremax_min)
			{
				valoremax_min=tempmin;
			}	
			if(tempmax<valoremin_max)
			{
				valoremin_max=tempmax;
			}
			if(tempmax>valoremax_max)
			{
				valoremax_max=tempmax;
			}		
		}  
		mediatot=(sommamin+sommamax)/n;
		mediamin=sommamin/n;
		mediamax=sommamax/n;
		System.out.println("La media delle temperature totali e: "+mediatot);
		System.out.println("La media delle temperature minime e: "+mediamin);
		System.out.println("La media delle temperature massime e: "+mediamax);
		System.out.println("Il minimo della temperatura minima e: "+valoremin_min);
		System.out.println("Il massimo della temperatura minima e: "+valoremax_min);
		System.out.println("Il minimo della temperatura massima e: "+valoremin_max);
		System.out.println("Il massimo della temperatura massima e: "+valoremax_max);

	}

}
