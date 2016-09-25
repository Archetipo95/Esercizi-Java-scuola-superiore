/*
 * Fippni Davide, Masevski Martin
 * 3^AI
 * 
*/
import java.util.*;
import static java.lang.Math.*;
public class Equazione
   { public static void main(String args[])
	{Scanner tastiera = new Scanner(System.in);
	  double a,b,c,d,xmax,xmin,xcentr,ymin,ycentr;
	  System.out.print("Inserisci il coefficiente della x al terzo grado: ");	  
	  a=tastiera.nextDouble();
	  System.out.println();
	  System.out.print("Inserisci il coefficiente della x al secondo grado: ");
	  b=tastiera.nextDouble();
	  System.out.println();
	  System.out.print("Inserisci il coefficiente della x al primo grado: ");
	  c=tastiera.nextDouble();
	  System.out.println();
	  System.out.print("Inserisci il termine noto: ");
	  d=tastiera.nextDouble();
	  System.out.println();
	  xmin=-1000;
	  xmax=1000;
	  xcentr= (xmax+xmin)/2;
	  ymin=(a*xmin*xmin*xmin)+(b*xmin*xmin)*+c*xmin+d;
	  ycentr=(a*xcentr*xcentr*xcentr)+(b*xcentr*xcentr)*+c*xcentr+d;
	  while(abs(ycentr)>1e-5)
		{if((ymin*ycentr)<0)
		      {xmax=xcentr;}
		  else
		       {xmin=xcentr;}
	  	  xcentr=(xmin+xmax)/2;
		  ymin=(a*xmin*xmin*xmin)+ b*xmin*xmin *+ c*xmin + d;
	 	  ycentr=(a*xcentr*xcentr*xcentr)+(b*xcentr*xcentr)+c*xcentr+d;
	 	 }	  
	  System.out.print("La soluzione dell'equazione e': "+xcentr);	  
	 }
    }