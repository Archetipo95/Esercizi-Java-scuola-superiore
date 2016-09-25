/*
 * Fippni Davide, Masevski Martin
 * 3^AI
 *
 */
import java.util.*;
public class Es_vettori2 
	{
	public static void main(String[] args) 
	{
	Scanner tastiera=new Scanner (System.in);	
	int i,q,a;
	a=0;
	System.out.println("Scrivi lunghezza vettore: ");
    q=tastiera.nextInt ();
    int []vett=new int [q];
    int []capovolta=new int [q];
    for (i=0; i<q; i++)
		{
		 vett[i]=(int)Math.random()*100+1;
		}
	for(i=q-1; i>=0;i--)
		{
		capovolta[a]=vett[i];
		a++;
		}
	for(i=0;i<q;i++)
		{
			System.out.print(capovolta[i]);
		}
	}
}
