/*
 * Fippni Davide, Masevski Martin
 * 3^AI
 * 1/12/2012
 */
import java.util.*;
public class OrdinaVettore 
	{public static void main(String[] args) 
      	{Scanner tastiera=new Scanner (System.in);
      	int i,j,n,scambio;
      	System.out.print("Inserisci lunghezza vettore: ");
      	n=tastiera.nextInt();
      	int[] vett=new int[n];
      	for (i=0;i<n;i++)
  		{
  			System.out.print("Scrivi valore "+(i+1)+": ");
  			vett[i]=tastiera.nextInt();
  		}	
      	for (i=0;i<n;i++)
      		{ 
      			for (j=0;j<n;j++)
      			{
      				if(vett[j]>vett[i])
      				{
      					scambio=vett[j];
      					vett[j]=vett[i];
      					vett[i]=scambio;
      				}
      			}
      			
      		}
      	for (i= 0; i<n; i++)
    	{
    		System.out.print(vett[i] + " # ");
    	}
      	}
	}
        	
