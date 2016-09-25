/**
 * Fipponi Masevski
 * 08/02/14 4ai
 * 
 * Crea file html date delle informazioni in input
 */
package html;
import java.io.*;
import java.util.*;
import java.awt.*;
import java.net.URI;
import java.net.URISyntaxException;
public class Esercizio1 {
	public static void main (String args[]) throws IOException{

		Scanner t= new Scanner(System.in);
		File f= new File("Prova.html");
		FileWriter fw= new FileWriter(f);
		PrintWriter pw= new PrintWriter(fw);

		System.out.println("Inserisci il titolo della pagina: ");
		String titolo= t.nextLine();
		System.out.println("Inserisci nome: ");
		String nome= t.nextLine();
		System.out.println("Inserisci il cognome: ");
		String cognome= t.nextLine();
		System.out.println("Inserisci la professione: ");
		String prof= t.nextLine();

		pw.println("<!DOCTYPE html><html><head><title>"+titolo+"</title>");
		pw.println("</head> <body>"+ "NOME: "+ nome +"<br>"+ "COGNOME: "+ cognome +"<br>"+ "PROFESSIONE: "+ prof + "</body> </html>");
		pw.close();

		String ind= "file:///home/a4/Scrivania/workspace/Sistemi/Prova.html";
		URI uriInd;

		try {
			uriInd= new URI(ind); 
			Desktop.getDesktop().browse(uriInd);
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch(URISyntaxException e1){
			e1.printStackTrace();
		}
	}
}