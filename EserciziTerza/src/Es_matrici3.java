/* 
 * Fippni Davide, Masevski Martin
 * 3^AI
 * 12/01/2013
 * Calcolo del rango di una matrice 3x3
 */
import java.util.Scanner;
public class Es_matrici3
{  public static void main(String[] args) 
	{  Scanner tastiera=new Scanner (System.in);
	 int [][]mat= new int [3][3];
	 int i, j, k, h,det,conta=0,det33,controllo=0;
	 int []vett=new int [10];
		 for (i=0;i<3;i++)
	 	{
		 for (j=0;j<3;j++)
		 		{
			 	System.out.println("Inserire elemento "+(i+1) +" matrice:");
			    mat[i][j]=tastiera.nextInt();
		 		}
		 }
		 if (mat[0][0]==0 &&  mat[0][1]==0 && mat[0][2]==0 && mat[1][0]==0 && mat[1][1]==0 && mat[1][2]==0 && mat[2][0]==0 && mat[2][1]==0 && mat[2][2]==0 )
		 {
			System.out.println("Rango 0");
			controllo=controllo+1;
		 } 
	 if(controllo!=1)
	 { det33=mat[0][0]*(mat[1][1]*mat[2][2]-mat[1][2]*mat[2][1])-mat[0][1]*(mat[1][0]*mat[2][2]-mat[1][2]*mat[2][0])+mat[0][2]*(mat[1][0]*mat[2][1]-mat[1][1]*mat[2][0]);
	 if(det33==0)
	 {	
		 for(i=0;i<3;i++)
		 {
			 for(j=0;j<3;j++)
		 {
			 conta=0;
			 for(h=0;h<3;h++)
			 {
				 for(k=0;k<3;k++)
				 {
					 if(h!=i && k!=j)
					 {
						vett[conta]=mat[j][k]; 
						conta=conta+1;
					 }
				 }
			 }
		 }
		 }
			 det=(vett[0]*vett[2])-(vett[1]*vett[3]);
			 if(det==0)
			 {
				 System.out.println("Rango 1");
			 }
			 else
			{
				 System.out.println("Rango 2");
			}
	 }
	
	 else
	 {
		 System.out.println("Rango 3");
	 }
	 }
	 System.out.println();
	 System.out.print(mat[0][0]+"\t"+mat[0][1]+"\t"+mat[0][2]+"\n"+mat[1][0]+"\t"+mat[1][1]+"\t"+mat[1][2]+"\n"+mat[2][0]+"\t"+mat[2][1]+"\t"+mat[2][2]);
	 
	 }

}

	    
	