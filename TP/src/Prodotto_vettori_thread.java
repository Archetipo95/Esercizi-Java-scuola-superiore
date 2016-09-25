/**
 *@author Fipponi 
 * 4^AI
 * 
 */
public class Prodotto_vettori_thread extends Thread {
	double ris, fat1, fat2;
	
	public Prodotto_vettori_thread(double num1, double num2)
	{
		fat1=num1;
		fat2=num2;
	}
	
	
	public void run()
	{
		ris=fat1*fat2;
		System.out.println(ris);
	}

}
