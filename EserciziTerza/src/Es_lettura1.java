/**
 *Lettura a linee di un file .txt
 * @author Fipponi-Masevski
 * @version 04/05/2013
 */
import java.io.*;
import java.util.*;

public class Es_lettura1 {
	public static void main(String[] args) throws IOException 
	{
		String file= "Prova1.txt";
		String linea;
		FileInputStream fin= new FileInputStream(file);
		Scanner t= new Scanner(fin);
		while(t.hasNextLine())
		{
			linea=t.nextLine();
			System.out.println(linea);
		}

	}

}
