/**
 *Lettura a linee di un file .txt archivio
 * @author Fipponi-Masevski
 * @version 08/05/2013
 */

import java.io.*;
import java.util.*;

public class Archivio {
	public static void main(String[] args) throws IOException 
	{
		String file= "Archivio1.txt";
		String linea;
		int i,conta;
		FileInputStream fin= new FileInputStream(file);
		Scanner t= new Scanner(fin);
		while(t.hasNextLine())
		{
			linea=t.nextLine();
			conta=0;
			for(i=0;i<linea.length(); i++)
			{
				if(linea.charAt(i)=='#')
				{
					conta=conta+1;
				}
			}
			String[] v= new String [conta+1];
			v=Utile.Separatore(linea,'#');
			for(i=0;i<v.length;i++)
			{
				System.out.print(v[i]);
			}
			System.out.println();
		}


	}

}