/*Fipponi  Masevski
 *20/03/2013
 *3AI
 */
import java.util.Scanner;
public class Dietologia_main 
{
	public static void main(String[] args) 
	{
		Scanner t=new Scanner(System.in);
		Dietologia Mela=new Dietologia("Mela",11,0.1,0.2);
		Dietologia Pane=new Dietologia("Pane",68,0,8);
		Dietologia Patatine=new Dietologia("Patatine",58.5,29.6,5.4);
		Dietologia Mozzarella=new Dietologia("Mozzarella",0,16.1,19.1);
		Dietologia Parmigiano=new Dietologia("Parmigiano",0.06,25.8,36.6);
		Dietologia Mortadella=new Dietologia("Mortadella",1.5,28.1,14.7);
		int scelta=0;
		double ConsumoEnGiorn=0;
		System.out.println(      "contenutidi zuccheri, grassi e proteine per 100 grammi di prodotto o cibo:"
				+"\n"+Mela
				+"\n"+Pane
				+"\n"+Patatine
				+"\n"+Mozzarella
				+"\n"+Parmigiano
				+"\n"+Mortadella);
		System.out.println("inserisci il quantitativo consumato (in grammi per ogni prodotto o cibo:");
		System.out.print("Mela: ");
		Mela.quantita=t.nextInt();
		System.out.print("\n"+"Pane bianco: ");
		Pane.quantita=t.nextInt();
		System.out.print("Patatine fritte in busta: ");
		Patatine.quantita=t.nextInt();
		System.out.print("\n"+"Mozzarella: ");
		Mozzarella.quantita=t.nextInt();
		System.out.print("Parmigiano: ");
		Parmigiano.quantita=t.nextInt();
		System.out.print("\n"+"Mortadella: ");
		Mortadella.quantita=t.nextInt();
		while(scelta<4)
		{
			ConsumoEnGiorn=Mela.ConsumoGiornalieroCibo(0)+Pane.ConsumoGiornalieroCibo(0)+Patatine.ConsumoGiornalieroCibo(0)+Mozzarella.ConsumoGiornalieroCibo(0)+Parmigiano.ConsumoGiornalieroCibo(0)+Mortadella.ConsumoGiornalieroCibo(0);	
			System.out.println(      "menù:"
					+"\n"+"1) aumenta quantita giornaliera consumata di un cibo o prodotto"
					+"\n"+"2) diminuisci quantità giornaliera consumata di un cibo o prodotto"
					+"\n"+"3) modifica quantità giornaliera consumata di un cibo o prodotto"
					+"\n"+"4) esci"
					+"\n"+"calorie assunte giornalmente: "+ConsumoEnGiorn);
			scelta=t.nextInt();
			if (scelta==1)
			{
				System.out.println("Inserire il numero corrispondente al prodotto o cibo: " 
						+"\n"+"di cui modificare la quantità giornaliera consumata:"
						+"\n"+"1)"+Mela
						+"\n"+"2)"+Pane
						+"\n"+"3)"+Patatine
						+"\n"+"4)"+Mozzarella
						+"\n"+"5)"+Parmigiano
						+"\n"+"6)"+Mortadella);
				scelta=t.nextInt();
				System.out.println("Inserisca di quanto aumentare (in grammi) la quantità consumata: ");
				if (scelta==1)
				{
					Mela.quantita=Mela.quantita+t.nextInt();
				}
				if (scelta==2)
				{
					Pane.quantita=Pane.quantita+t.nextInt();
				}
				if (scelta==3)
				{
					Patatine.quantita=Patatine.quantita+t.nextInt();
				}
				if (scelta==4)
				{
					Mozzarella.quantita=Mozzarella.quantita+t.nextInt();
				}
				if (scelta==5)
				{
					Parmigiano.quantita=Parmigiano.quantita+t.nextInt();
				}
				if (scelta==6)
				{
					Mortadella.quantita=Mortadella.quantita+t.nextInt();
				}
			}
			if (scelta==2)
			{
				System.out.print("Inserire il numero corrispondente al prodotto o cibo: " 
						+"\n"+"di cui modificare la quantità giornaliera consumata:"
						+"\n"+"1)"+Mela
						+"\n"+"2)"+Pane
						+"\n"+"3)"+Patatine
						+"\n"+"4)"+Mozzarella
						+"\n"+"5)"+Parmigiano
						+"\n"+"6)"+Mortadella);
				scelta=t.nextInt();
				System.out.print("Inserisca di quanto aumentare (in grammi) la quantità consumata: ");
				if (scelta==1)
				{
					Mela.quantita=Mela.quantita-t.nextInt();
				}
				if (scelta==2)
				{
					Pane.quantita=Pane.quantita-t.nextInt();
				}
				if (scelta==3)
				{
					Patatine.quantita=Patatine.quantita-t.nextInt();
				}
				if (scelta==4)
				{
					Mozzarella.quantita=Mozzarella.quantita-t.nextInt();
				}
				if (scelta==5)
				{
					Parmigiano.quantita=Parmigiano.quantita-t.nextInt();
				}
				if (scelta==6)
				{
					Mortadella.quantita=Mortadella.quantita-t.nextInt();
				}
			}
			if (scelta==3)
			{
				System.out.println(      "inserire il numero corrispondente al prodotto o cibo" 
						+"\n"+"di cui modificare la quantità giornaliera consumata:"
						+"\n"+"1)"+Mela
						+"\n"+"2)"+Pane
						+"\n"+"3)"+Patatine
						+"\n"+"4)"+Mozzarella
						+"\n"+"5)"+Parmigiano
						+"\n"+"6)"+Mortadella);
				scelta=t.nextInt();
				System.out.println("inserisca di quanto aumentare (in grammi) la quantità consumata");
				if (scelta==1)
				{
					Mela.quantita=t.nextInt();
				}
				if (scelta==2)
				{
					Pane.quantita=t.nextInt();
				}
				if (scelta==3)
				{
					Patatine.quantita=t.nextInt();
				}
				if (scelta==4)
				{
					Mozzarella.quantita=t.nextInt();
				}
				if (scelta==5)
				{
					Parmigiano.quantita=t.nextInt();
				}
				if (scelta==6)
				{
					Mortadella.quantita=t.nextInt();
				}
				
			}
		}
	}
}
