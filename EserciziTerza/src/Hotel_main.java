import java.util.*;
public class Hotel_main {
	public static void main(String args[]) {
		Scanner t= new Scanner(System.in);
		String nome, cognome, datadinascita, datainizio, datafine;
		int camera;
		boolean data;
		Hotel_camera cam[]= new Hotel_camera[4];
		cam[0]=new Hotel_camera("12",1,3,45.3);
		cam[1]=new Hotel_camera("13",2,1,12.5);
		cam[2]=new Hotel_camera("14",1,2,30.20);
		cam[3]=new Hotel_camera("15",3,1,12.5);
		Hotel_anagrafica an[]= new Hotel_anagrafica[5];
		Hotel_prenotazioni pr[]=new Hotel_prenotazioni[5];
		for (int i=0;i<5;i++)
		{
			System.out.print("Inserisci il nome: ");
			nome=t.nextLine();
			System.out.print("Inserisci il cognome: ");
			cognome=t.nextLine();
			do
			{
				System.out.print("Inserisci la data di nascita: ");
				datadinascita=t.nextLine();
				data=Hotel_utile.Utile(datadinascita);
			}while (data==false);
			an[i]=new Hotel_anagrafica(nome,cognome,datadinascita);
			System.out.print("Inserisci la camera: ");
			camera=t.nextInt();
			t.nextLine();
			System.out.print("Inserisci la data d'inizio: ");
			datainizio=t.nextLine();
			System.out.print("Inserisci la data di fine: ");
			datafine=t.nextLine();
			pr[i]= new Hotel_prenotazioni(datainizio, datafine, camera, i);
			System.out.println(pr[i]);
		}
	}

}
