import java.util.*;
public class Virgola_numeri {

	public static void main(String[] args) 
	{
		Scanner tastiera= new Scanner (System.in);	
		double valore;
		int posvirgola, lunghezza, arrotondamentoint, partedecimaleint;
		valore=tastiera.nextDouble();
		String valores= ""+valore;
		String blocco1,blocco2,blocco3;
		posvirgola= valores.indexOf('.');
		lunghezza= valores.length();
		String partedecimale="";
		String arrotondamento=valores.substring(posvirgola+2, posvirgola+3);
		arrotondamentoint= Integer.parseInt(arrotondamento);
		String partedecimalestring= valores.substring(posvirgola+1, posvirgola+3);
		partedecimaleint= Integer.parseInt(partedecimalestring);
		String parteintera=valores.substring(0,posvirgola);
		if (posvirgola==-1)
		{
			partedecimale="00";
		}
		if(posvirgola==lunghezza-2)
		{
			partedecimale=valores.substring(lunghezza-1,lunghezza)+"0";
		}
		if(posvirgola<=lunghezza-3)
		{
			if(arrotondamentoint>=5)
			{
				partedecimaleint= partedecimaleint+1;
				partedecimale=""+partedecimaleint;
			}
			else
			{
				partedecimale=valores.substring(posvirgola+1, posvirgola+3);
			}
		}
		if(parteintera.length()<=3)
		{
			System.out.println(parteintera+","+partedecimale);	
		}
		if (parteintera.length()>3 && parteintera.length()<=6)
		{
			parteintera=Utile.reverse(parteintera);
			blocco1=parteintera.substring(0,3);
			blocco2=parteintera.substring(3,parteintera.length());
			blocco1=Utile.reverse(blocco1);
			blocco2=Utile.reverse(blocco2);

			System.out.println(blocco2+"."+blocco1+","+partedecimale);
		}
		if (parteintera.length()>3 && parteintera.length()<=9)
		{
			parteintera=Utile.reverse(parteintera);
			blocco1=parteintera.substring(0,3);
			blocco2=parteintera.substring(3,6);
			blocco3=parteintera.substring(6,parteintera.length());
			blocco1=Utile.reverse(blocco1);
			blocco2=Utile.reverse(blocco2);
			blocco3=Utile.reverse(blocco3);
		}

	} 
}
