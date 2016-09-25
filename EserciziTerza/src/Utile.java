
public class Utile 
{
	//Areatriangolo
	public static double areatriangolo (double b, double h)
	{
		double area;
		area= b*h/2;
		return area;
	}
	//Area rettangolo	
	public static double arearettangolo (double b, double h)
	{
		double area;
		area= b*h;
		return area;
	}
	//Volume Parallelepipedo
	public static double volumeparallelepipedo(double a, double b, double c) 
	{
		double volumecalc;
		volumecalc= a*b*c;
		return volumecalc;
	}
	//Calcolo area parallelepipedo
	public static double areaparallelepipedo(double b, double h,double p) 
	{
		double areacalc;
		areacalc=(arearettangolo (b,h)+arearettangolo (p,h)+arearettangolo (b,p))*2;
		return areacalc;
	}
	//Somma interi n	
	public static int sommainteri (int n)
	{
		int i,somma;
		somma=0;
		for (i=1;i<=n;i++)
		{
			somma=somma+i;
		}
		return somma;
	}
	//Fattoriale di un numero
	public static int fattoriale (int n)
	{
		int i,prodotto;
		prodotto=1;
		for (i=1;i<=n;i++)
		{
			prodotto=prodotto*i;
		}
		return prodotto;
	}
	//Ottengo una stringa rovesciata
	public static String reverse(String s)
	{
		String rovescia;
		int i;
		rovescia="";
		for(i=s.length()-1;i>=0;i--)
		{
			rovescia=rovescia+s.charAt(i);
		}
		return rovescia;
	}
	//Palindroma o no?
	public static Boolean Palindroma(String s)
	{
		String rovescia;
		Boolean controllo;
		rovescia=reverse(s);
		controllo=rovescia.equals(s);
		return controllo;
	}	
	//Punto medio
	public static void puntomedio(double x1,double x2,double y1,double y2 )
	{
		double xm,ym;
		xm=(x1+x2)/2;
		ym=(y1+y2)/2;
		System.out.println("Il punto medio è: ("+xm+";"+ym+")");
	}
	//Separa stringhe con separatore incorporato
	public static String[] Separatore(String s, char separatore)
	{	
		String appoggio;
		int i, conta, j;
		conta=0;
		for(i=0;i<s.length(); i++)
		{
			if(s.charAt(i)==separatore)
			{
				conta=conta+1;
			}
		}
		String[] v= new String [conta+1];
		appoggio="";
		j=0;
		for(i=0; i<s.length();i++)
		{
			if(s.charAt(i)==separatore)
			{
				v[j]=appoggio;
				appoggio="";
				j=j+1;
			}
			else
			{
				appoggio=appoggio+s.charAt(i);
			}
			v[j]=appoggio;
		}
		return v;
	}		
	//Annullare gli spazi
	public static String anullaspazi(String s)
	{
		String senzaspazio;
		int i, posspazio=0, conta;
		conta=0;
		for(i=0; i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				conta=conta+1;
			}
			else
			{
				conta=0;
			}
			if(conta>1)
			{
				posspazio=i;
				break;
			}
		}
		senzaspazio=s.substring(0, posspazio-1);
		return senzaspazio;
	}
	//Numero elementi
	public static int numeroelementi(String s, char separatore)
	{	
		int i, conta;
		conta=1;
		for(i=0;i<s.length(); i++)
		{
			if(s.charAt(i)==separatore)
			{
				conta=conta+1;
			}
		}
		return conta-1;
	}
}