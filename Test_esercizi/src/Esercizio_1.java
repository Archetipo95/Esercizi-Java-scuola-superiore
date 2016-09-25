import java.util.*;
public class Esercizio_1 {

	
	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		String num="";
		String prezzo;
		double importo;
		double n=0,p=0;
		boolean ok=false;
		while(!ok){
		try {
			System.out.print("Inserisci numero panini: ");
			num = keyb.nextLine();
			n=Integer.parseInt(num);
			ok=true;
		}
		catch(NumberFormatException ime)
		{
			System.out.println("Hai inserito un numero in formato errato!");
	
		}
		while(!ok){
		try{
			System.out.print("Inserisci prezzo panini: ");
			prezzo = keyb.nextLine();
			p=Double.parseDouble(prezzo);
			importo = n*p;
			System.out.println("Per comprare " + num + " panini ");
			System.out.println("spendi " + importo + " euro ");
			ok=false;
		}
		catch(NumberFormatException ime)
		{
			System.out.println("Hai inserito un numero in formato errato!");
		}
	}
 }
}
}
