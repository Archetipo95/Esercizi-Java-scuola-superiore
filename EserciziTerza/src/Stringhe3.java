
public class Stringhe3 {
public static void main (String args[]){

String nomeCognome = new String ("Paolo Santi");
System.out.println(nomeCognome);
	//ritorna una cpoia in maiuscolo
String ncMaiuscolo = nomeCognome.toUpperCase();
	System.out.println(ncMaiuscolo);
	// ritorna una copia in minuscolo
	String ncMinuscolo = nomeCognome.toLowerCase();
		System.out.println(ncMinuscolo);
		
		int a=5;
		int b=5;
		if (a==b)
			System.out.println("uguali");
		else
			System.out.println("diversi");
		//Confronto boolean di due stringhe
		//Carattere per carattere
		String s=new String("ciao");
		String t=new String("ciao");
		if(s.equals(t))
			System.out.println("uguali");
		else
			System.out.println("diversi");
// compara due strighe...
		int comp= s.compareTo(t);
		if (comp==0)
		{  
			System.out.println("sono uguali");
		}
		else
		{
			if(comp>0)
			{
				System.out.println("s maggiore");
			}
			else
			{
				System.out.println("t maggiore");
			}
		}	
// compara due stringhe ignorando maiuscolo/minuscolo
int compIC= s.compareToIgnoreCase(t);
System.out.println(compIC);

//------------------------------------------------------------------------

//cercare una stringa dentro ad un' altra
String msg = new String ("arrivo alle ore 12.00");
// vogliamo sapere se la stringa ore è presente in msg
int posOre = msg.indexOf("ore");
System.out.println("stringa \"ore\" a pos: " + posOre);
}
}
