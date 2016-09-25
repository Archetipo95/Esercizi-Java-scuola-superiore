/*
 * Fippni Davide, Masevski Martin
 * 3^AI
 * 09/01/2013
 * Somma tra matrici 3x3
 */
import java.util.*;
public class Es_matrici1 
{public static void main(String[] args) 
	{Scanner tastiera=new Scanner (System.in);
	 int i,j;
	 int [][] somma= new int [3][3];
	 int [][] mat1= new int [3][3];
	 int [][] mat2= new int [3][3];
	 for (i=0;i<3;i++)
	 {
		for (j=0;j<3;j++)
		{
			mat1 [i][j]= tastiera.nextInt();
		}
	 }
	 for (i=0;i<3;i++)
		 {
			for (j=0;j<3;j++)
			{
				mat2 [i][j]= tastiera.nextInt();
			}
		 }
	 for (i=0;i<3;i++)
		 {
			for (j=0;j<3;j++)
			{
				somma [i][j]= mat1 [i][j]+mat2 [i][j];
				
				System.out.print(somma [i][j]);
				
			}
		 }
	}

}
