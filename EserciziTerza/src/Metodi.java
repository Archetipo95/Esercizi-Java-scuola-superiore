import java.util.*;
public class Metodi 
{
   public static void leggiVett(double v[]) 
   {
	  Scanner tast = new Scanner(System.in);
	  for(int i=0; i<v.length; ++i)
    		{
		      System.out.println("Inserisci l'elemento"+(i+1)+":");
		      v[i]=tast.nextDouble();
    		}
   }

/**
*Esegue la somma dei valori double del vettore dato
*@param v i valori da sommare
*@return la somma degli elementi del vettore
*/
public static double sommaVett(double v[]) 
	{
	double s=0;
	for(int i=0;i<v.length; ++i)
		{
		 s=s+v[i];
		}
	return s;
	}


/**
*Legge da input una serie di valori double
*inserendoli nel vettore dato.
*@param v il vettore in cui inserire i valori
*/
public static void leggiVet(double v[])
{
	Scanner tast= new Scanner(System.in);
	for(int i=0;i<v.length;++i)
		{
		System.out.println("Inserisci l'elemento "+(i+1)+":");
		v[i]=tast.nextDouble();
		}
}
	
	
public static void main(String[]args){
	Scanner tast=new Scanner(System.in);
	System.out.println("Calcolo della somma e della media");
	System.out.println("Quanti valori si devono inserire?");
	int num=tast.nextInt();
	double valori[]=new double [num];
	leggiVet(valori);
	double somma= sommaVett(valori);
	System.out.println("Somma= "+somma);
	System.out.println("Media= "+(somma/valori.length));
	}


}