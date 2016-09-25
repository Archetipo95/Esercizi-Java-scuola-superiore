package elenco_files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Esempio per visualizzare l'elenco dei file di una cartella.
 * @author Mion - Santi
 * @version 2014-03-01 
 */
public class EsempioElencoFilesProc {

	/**
	 * Mostra tipo (FILE/DIR) e nome di un file o cartella passata. 
	 * Continua su tutte le sotto cartelle.
	 * @param fi il file o cartella
	 */
	private static void mostraFile(File fi)
	{

		try {
			if(!fi.isDirectory())
			{
				System.out.println("FILE " + fi.getCanonicalPath());
			}
			else
			{
				System.out.println("DIR  " + fi.getCanonicalPath());
				File[] elenco = fi.listFiles();
				for(File sub : elenco)
				{
					 // richiama ricorsivamente su tutti i file della cartella
					 mostraFile(sub);
				}
			}
		} catch (IOException e) {
			// e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Inserisci percorso file (vuoto=cartella corrente)");
		String dirName = t.nextLine();
		if(dirName.isEmpty())
			dirName = ".";
		File dir = new File(dirName);
		mostraFile(dir);
	}

}
