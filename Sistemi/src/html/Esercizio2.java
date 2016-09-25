/**
 * Fipponi Masevski
 * 08/02/14 4ai
 * 
 *  Trova tutti i link di una certa pagina web
 */
package html;
import java.util.*;
import java.net.*;
import java.io.*;

public class Esercizio2 {
	public static void main(String[] args) throws IOException {

		Scanner t= new Scanner(System.in);				//Scanner t
		File file= new File("Prova2.txt");				//File dove scarico il sito
		FileWriter fw= new FileWriter(file);			//fw
		PrintWriter pw= new PrintWriter(fw);			//pw

		URL indirizzoURL;
		BufferedReader in;	

		Vector<String> vect = new Vector<String>();

		String indirizzo, link, taglia, taglia2;
		int a = 0, b = 0;

		String inputLine;

		System.out.println("Su quale pagina cercare i link ? (www.sito.dominio)");
		indirizzo = t.nextLine();

		indirizzoURL = new URL("http://"+indirizzo);
		in = new BufferedReader(new InputStreamReader(indirizzoURL.openStream()));

		while ((inputLine = in.readLine()) != null) {
			a = inputLine.indexOf("href=" + '"' + "http:");

			while((a!=-1)) {
				a = inputLine.indexOf("href=" + '"' + "http:");

				if(a!=-1) {
					taglia=inputLine.substring(a+6,inputLine.length());
					b = taglia.indexOf('"');
					link=inputLine.substring(a+6,a+b+6);
					vect.add(link);
					System.out.println(link);
					taglia2=taglia.substring(b,taglia.length());
					inputLine= taglia2;
				}
			}
			pw.println(inputLine);
		}
		in.close();
		pw.close();
	}
}