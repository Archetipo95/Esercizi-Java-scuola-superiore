/**
 * Esempio per utilizzare la class Cilindro
 * @author Fipponi-Visentin
 * @version 06/04/2013
 */
public class TestCilindro {
	public static void main (String args[])
		{
		// cilindro di default r=1, h=1
			Cilindro ca= new Cilindro();
			System.out.println("ca="+ca);
			
		// cilindro con parametri r=2, h=4
			Cilindro cb= new Cilindro(2,4);
			System.out.println("cb"+cb);
		}
}

