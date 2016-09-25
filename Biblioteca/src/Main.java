/**
 * masevski-fipponi 3/11/13
 */
import java.io.*;
import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		Scanner t= new Scanner(System.in);
		Biblioteca euganeo = new Biblioteca(200);
		Biblioteca sottoDieciEuro = new Biblioteca();
		Biblioteca elenco = new Biblioteca();
		int scelta, tornaalmenu;
		String nomefile="Biblioteca.txt";
		String linea;
		do 
		{
			System.out.println(""
					+ "1-Aggiungi (Euganeo)\n"
					+ "2-Visualizza (Euganeo)\n"
					+ "3-Visualizza per autore Paolo Rossi (Euganeo)\n"
					+ "4-Aggiorna prezzo (Con codice == 1)\n"
					+ "5-Elimina (Con codice == 2)\n"
					+ "6-Scrivi su file (Non visualizza nnt)\n"
					+ "7-Leggi da file (Non visualizza nnt)\n"
					+ "8-Sotto dieci euro (Prima punto 7)\n"
					+ "9-Visualizza ordinato (Prima punto 7)\n"
					+ "10-Esci");
			System.out.print("Scegli opzione: ");
			scelta=t.nextInt();
			t.nextLine();
			if(scelta==1)
			{
				String continua=null;
				do{
					euganeo.Inserisci();
					System.out.print("Vuoi continuare?(Y/N) ");
					continua=t.nextLine();
				}while(continua.equalsIgnoreCase("y"));
			}

			if(scelta==2){
				euganeo.Visualizza();
				do
				{
					System.out.println("Premi 0 per tornate al MENU");
					tornaalmenu=t.nextInt();
				} while (tornaalmenu!=0);
			}
			if(scelta==3){
				euganeo.VediAutore("Paolo Rossi");
				do
				{
					System.out.println("Premi 0 per tornate al MENU");
					tornaalmenu=t.nextInt();
				} while (tornaalmenu!=0);
			}
			if(scelta==4){
				euganeo.Aggiorna("1",25);
				do
				{
					System.out.println("Premi 0 per tornate al MENU");
					tornaalmenu=t.nextInt();
				} while (tornaalmenu!=0);
			}
			if(scelta==5){
				euganeo.Elimina("2");
				do
				{
					System.out.println("Premi 0 per tornate al MENU");
					tornaalmenu=t.nextInt();
				} while (tornaalmenu!=0);
			}
			if(scelta==6){
				FileWriter fw= new FileWriter(nomefile);
				PrintWriter pw= new PrintWriter(fw);

				pw.println(euganeo.toString());
				pw.close();
				do
				{
					System.out.println("Premi 0 per tornate al MENU");
					tornaalmenu=t.nextInt();
				} while (tornaalmenu!=0);
			}

			if(scelta==7){
				FileInputStream fin = new FileInputStream(nomefile);
				Scanner in = new Scanner(fin);

				while(in.hasNextLine()){
					linea=in.nextLine();
					StringTokenizer prova = new StringTokenizer (linea,"#");
					while(prova.hasMoreTokens()){
						String codice = prova.nextToken();
						String titolo = prova.nextToken();
						String autore = prova.nextToken();
						Double prezzo = Double.parseDouble(prova.nextToken());
						sottoDieciEuro.Minoredi(codice, titolo, autore, prezzo, 10.0);
						elenco.Inserisci2(codice, titolo, autore, prezzo);
					}
				}
				do
				{
					System.out.println("Premi 0 per tornate al MENU");
					tornaalmenu=t.nextInt();
				} while (tornaalmenu!=0);
			}
			if(scelta==8){
				sottoDieciEuro.Visualizza();
				do
				{
					System.out.println("Premi 0 per tornate al MENU");
					tornaalmenu=t.nextInt();
				} while (tornaalmenu!=0);
			}
			if(scelta==9){
				elenco.Ordinamento();
				elenco.Visualizza();
				do
				{
					System.out.println("Premi 0 per tornate al MENU");
					tornaalmenu=t.nextInt();
				} while (tornaalmenu!=0);
			}
		}while(scelta < 10 && scelta > 0);
	}
}