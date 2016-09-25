package elenco_files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Esempio per visualizzare l'elenco dei file di una cartella.
 * @author Mion - Santi
 * @version 2014-03-01 
 */
public class EsempioElencoFiles {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Inserisci percorso file (vuoto=cartella corrente)");
		String dirName = t.nextLine();
		if(dirName.isEmpty())
			dirName = ".";
		File dir = new File(dirName);
		File[] elenco = dir.listFiles();
		System.out.println("Elenco files della cartella: " 
				+ dir.getAbsolutePath());
		for(File fi : elenco)
		{
			try {
				if(fi.isDirectory())
					System.out.print("DIR  ");
				else
					System.out.print("FILE ");
				System.out.print(fi.getCanonicalPath());
				System.out.println();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
