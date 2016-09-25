/**
 * @author Masevski , Fipponi
 * @version 25/01/14
 */

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		Server server = new Server();
		int scelta;

		do {
			System.out
			.println("Cosa vuoi fare ? \n1-Aggiungi elemento"
					+ "\n2-Visualizza messaggio"
					+ " \n3-Esci");
			scelta = t.nextInt();
			t.nextLine();

			// Aggiungi elemento
			if (scelta == 1) {
				inserimento(server);
			}
			
			// Visualizza messaggi
			if (scelta == 2) {
				for (int i = 0; i < server.getElenco().size(); i++) {
					 visualizzaMessaggio(server.getElenco().elementAt(i));
				}
			}

		} while (scelta != 3);
	}

	public static void inserimento(Server server) {
		Host n;
		Scanner t = new Scanner(System.in);
		String ip, sub;
		int ip1, ip2, ip3, ip4, sub1, sub2, sub3, sub4;
		boolean controllo = false;
		do {
			do {
				try {
					System.out.println("inserisci ip come quattro interi");
					ip1 = t.nextInt();
					ip2 = t.nextInt();
					ip3 = t.nextInt();
					ip4 = t.nextInt();
				} catch (InputMismatchException ime) {
					System.out
					.println("Hai inserito qualcosa di sbagliato, ripeti");
					ip1 = ip2 = ip3 = ip4 = -1;
					t.next();
				}
			} while (controllo(ip1, ip2, ip3, ip4) != true);

			ip = ip1 + "." + ip2 + "." + ip3 + "." + ip4;

			do {
				try {
					System.out
					.println("inserisci subnet mask come quattro interi");
					sub1 = t.nextInt();
					sub2 = t.nextInt();
					sub3 = t.nextInt();
					sub4 = t.nextInt();
				} catch (InputMismatchException ime) {
					System.out
					.println("Hai inserito qualcosa di sbagliato, ripeti");
					sub1 = sub2 = sub3 = sub4 = -1;
					t.next();
				}
			} while (controllo(sub1, sub2, sub3, sub4) != true);

			sub = sub1 + "." + sub2 + "." + sub3 + "." + sub4;
			controllo = true;
			for (int i = 0; i < server.getElenco().size(); i++) {
				if (server.getElenco().elementAt(i).getIp().compareTo(ip) == 0
						&& server.getElenco().elementAt(i).getSub()
						.compareTo(sub) == 0) {
					System.out
					.println("errore: indirizzo ip già esistente sulla rete selezionata");
					controllo = true;
					break;
				}
			}
		} while (controllo == false);
		n = new Host(ip, sub, server, true);
		server.aggiungi(n);
	}

	/*
	public static void inviaMessaggio(Server server) {
		int sceltaip, sceltaip2;
		sceltaip = sceltaip2 = -1;
		boolean ok = false;
		Scanner t = new Scanner(System.in);
		System.out.println("Quale oggetto deve inviare il messaggio?");
		// Visualizza tutti gli ip
		for (int i = 0; i < server.getElenco().size(); i++) {
			System.out.println(i + ") ip: " + server.getIPelemento(i));
		}
		// scegli IP
		do {
			try {
				sceltaip = t.nextInt();
				ok = true;
			} catch (InputMismatchException ime) {
				System.out.println("è avvenuto un errore, reinserisci");
				t.next();
			}
		} while (ok != true);

		System.out.println("Verso quale oggetto?");
		// visualizza gli ip rimanenti
		for (int i = 0; i < server.getElenco().size(); i++) {
			if (i != sceltaip - 1)
				System.out.println(i + ") ip: " + server.getIPelemento(i));
		}
		// scegli IP destinatario
		ok = false;
		do {
			try {
				sceltaip2 = t.nextInt();
				ok = true;
			} catch (InputMismatchException ime) {
				System.out.println("è avvenuto un errore, reinserisci");
				t.next();
			}
		} while (ok != true);
		// richiesta di risposta
	}
	*/

	public static void visualizzaMessaggio(Host oggetto) {
		System.out.println(oggetto.getRicevuto());
	}

	public static boolean controllo(int s1) {
		if (s1 >= 0 && s1 <= 255)
			return true;
		return false;
	}

	public static boolean controllo(int s1, int s2, int s3, int s4) {
		return controllo(s1) && controllo(s2) && controllo(s3) && controllo(s4);
	}
}