/*
Classe 3AI
17/04/2013
Fipponi, Masevski
 */
import java.util.*;
public class Registro_main {
	public static void main(String[] args) {
		Scanner t= new Scanner(System.in);
		int n,i;	
		String user, pass, indirizzo, cap, città, prov, cell, email, cognome, nome, sesso, datadinascita;
		System.out.print("Quante anagrafiche vuoi inserire? ");
		n=t.nextInt();
		t.nextLine();
		Registro_profilo prof[]= new Registro_profilo[n];
		for (i=0; i<n; i++)
		{
			System.out.print("Inserisci l'username: ");
			user=t.nextLine();
			
			System.out.print("Inserisci la password: ");
			pass=t.nextLine();
			
			System.out.print("Inserisci l'email: ");
			email=t.nextLine();
			
			if(Registro_profilo.controllomail(email)==true){
				do{System.out.println("HAI SBAGLIATO");
				System.out.print("Inserisci l'email: ");
				email=t.nextLine();
				}while(Registro_profilo.controllomail(email)==true);
			}
			
			System.out.print("Inserisci il cognome: ");
			cognome=t.nextLine();
			
			System.out.print("Inserisci il nome: ");
			nome=t.nextLine();
			
			System.out.print("Inserisci il sesso (M o F): ");
			sesso=t.nextLine();
			
			if(Registro_profilo.controllosesso(sesso)==true){
				do{System.out.println("HAI SBAGLIATO");
				System.out.print("Inserisci il sesso (M o F): ");
				sesso=t.nextLine();
				}while(Registro_profilo.controllosesso(sesso)==true);
			}
			
			System.out.print("Inserisci il numero di cellulare: ");
			cell=t.nextLine();
			
			if(Registro_profilo.controllocell(cell)==true){
				do{System.out.println("HAI SBAGLIATO");
				System.out.print("Inserisci il numero di cellulare: ");
				cell=t.nextLine();
				}while(Registro_profilo.controllocell(cell)==true);
			}
			
			System.out.print("Inserisci la data di nascita: ");
			datadinascita=t.nextLine();
			if(Registro_profilo.controllodata(datadinascita)==true){
				do{System.out.println("HAI SBAGLIATO");
				System.out.print("Inserisci la data di nascita: ");
				datadinascita=t.nextLine();
				}while(Registro_profilo.controllodata(datadinascita)==true);
			}
			
			System.out.print("Inserisci la città: ");
			città=t.nextLine();
			
			System.out.print("Inserisci la provincia: ");
			prov=t.nextLine();
			
			System.out.print("Inserisci l'indirizzo: ");
			indirizzo=t.nextLine();
			
			System.out.print("Inserisci il CAP: ");
			cap=t.nextLine();
			
			if(Registro_profilo.controllocap(cap)==true){
				do{System.out.println("HAI SBAGLIATO");
				System.out.print("Inserisci il CAP: ");
				cap=t.nextLine();
				}while(Registro_profilo.controllocap(cap)==true);
			}
			
			prof[0]=new Registro_profilo(true, true, true, true, user, pass, indirizzo, cap, città, prov, cell, email, cognome, nome, sesso, datadinascita);
		}
		prof[i].toString();
	}
}


