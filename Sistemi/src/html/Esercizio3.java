/**
 * Fipponi Masevski
 * 01/03/14 4ai
 * 
 *  Trova tutti i link delle immagini di un sito web
 */
package html;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;
import java.util.Vector;

public class Esercizio3 {
	public static void main(String[] args) throws IOException {

		Scanner t= new Scanner(System.in);				//Scanner t
		File file= new File("Prova2.txt");				//File dove scarico il sito
		FileWriter fw= new FileWriter(file);			//fw
		PrintWriter pw= new PrintWriter(fw);			//pw

		URL indirizzoURL;
		BufferedReader in;	

		Vector<URL> vect = new Vector<URL>();
		
		URL link;
		String indirizzo, taglia, taglia2;
		int a = 0, b = 0;

		String inputLine;

//		System.out.println("Su quale pagina cercare i link ? (www.sito.dominio)");
//		indirizzo = t.nextLine();
		indirizzo = "en.oppo.com";
		indirizzoURL = new URL("http://"+indirizzo);
		in = new BufferedReader(new InputStreamReader(indirizzoURL.openStream()));

		while ((inputLine = in.readLine()) != null) {
			a = inputLine.indexOf("img src=" + '"');

			while((a!=-1)) {
//				a = inputLine.indexOf("href=" + '"' + "http:");
				a = inputLine.indexOf("img src=" + '"');
				if(a!=-1) {
					taglia=inputLine.substring(a+9,inputLine.length());
					b = taglia.indexOf('"');
					link = new URL(indirizzoURL + inputLine.substring(a+9,a+b+9));
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
		
		for(int i=0; i<vect.size(); i++) {
		openWebpage(vect.get(i));
		}
	}
	public static void openWebpage(URI uri) {
	    Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
	    if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
	        try {
	            desktop.browse(uri);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}

	public static void openWebpage(URL url) {
	    try {
	        openWebpage(url.toURI());
	    } catch (URISyntaxException e) {
	        e.printStackTrace();
	    }
	}
}