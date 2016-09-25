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
		double base,profondità,altezza;
		System.out.println("Scrivi la lunghezza della base");
		base= tastiera.nextInt();
		System.out.println("Scrivi la profondità");
		profondità= tastiera.nextInt();
		System.out.println("Scrivi l'altezza");
		altezza= tastiera.nextInt();
		System.out.println("Il volume è: "+volume (base,altezza,profondità));

		double areatotale;
		areatotale=(area (base,altezza)+area (base,profondità)+area (altezza, profondità))*2;
		System.out.println("L'area totale è: "+ areatotale);	
	}
}