/**
 *@author Fipponi 
 * 4^AI
 * 
 */

public class Prodotto_vettori{
	public static void main (String[] args){
		
		 double vett1[]= new double[5];
		 double vett2[]= new double[5];
		 
		 for(int i=0; i<5; i++)
		 	{
			 	vett1[i]=Math.random() * 100;
				vett2[i]=Math.random() * 100;
		 	}

		 for(int i=0; i<5; i++)
		 	{
			 	Prodotto_vettori_thread p= new Prodotto_vettori_thread(vett1[i], vett2[i]);
			 	p.start();
		 	}
		 
}		
}
