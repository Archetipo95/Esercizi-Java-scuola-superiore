import java.util.*;
public class MetodiPara
{
	public static double volume(double a, double b, double c) 
	{
		double volumecalc;
		volumecalc= a*b*c;
		return volumecalc;
	}
	public static double area(double b, double h) 
	{
		double areacalc;
		areacalc=b*h;
		return areacalc;
	}
	public static void main (String args [])
	{
		Scanner tastiera=new Scanner (System.in);
		double base,profondit�,altezza;
		System.out.println("Scrivi la lunghezza della base");
		base= tastiera.nextInt();
		System.out.println("Scrivi la profondit�");
		profondit�= tastiera.nextInt();
		System.out.println("Scrivi l'altezza");
		altezza= tastiera.nextInt();
		System.out.println("Il volume �: "+volume (base,altezza,profondit�));

		double areatotale;
		areatotale=(area (base,altezza)+area (base,profondit�)+area (altezza, profondit�))*2;
		System.out.println("L'area totale �: "+ areatotale);	
	}
}