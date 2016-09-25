/**
 *Scrittura di un file .txt
 * @author Fipponi-Masevski
 * @version 04/05/2013
 */
import java.io.*;

public class Es_scrittura {
	public static void main(String[] args) throws IOException 
	{
		String file= "Prova2.txt";
		FileWriter fw= new FileWriter(file);
		PrintWriter pw= new PrintWriter(fw);
		pw.println("Mi piace");
		pw.println("la");
		pw.println("casa di");
		pw.println("pippo");
		pw.close();


	}

}
