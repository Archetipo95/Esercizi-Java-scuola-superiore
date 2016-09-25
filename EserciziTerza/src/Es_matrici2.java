/*
 * Fippni Davide, Masevski Martin
 * 3^AI
 * 09/01/2013
 * Calcolo del determinante di una matrice 3x3
 */
import java.util.*;
public class Es_matrici2 
{public static void main(String[] args) 
	{Scanner tastiera=new Scanner (System.in);
	 int det33,i,j,c=0;
	 int [][] mat= new int [3][3];
	 for (i=0;i<3;i++)
	 	{
		 for (j=0;j<3;j++)
		 		{
			 	System.out.println("Inserire elemento "+(c+1) +" matrice:");
			 mat [i][j]=tastiera.nextInt();
		 		c=c+1;
		 		}
	 	}
	 det33=mat[0][0]*(mat[1][1]*mat[2][2]-mat[1][2]*mat[2][1])-mat[0][1]*(mat[1][0]*mat[2][2]-mat[1][2]*mat[2][0])+mat[0][2]*(mat[1][0]*mat[2][1]-mat[1][1]*mat[2][0]);
	System.out.println(det33); 
	
	}
}