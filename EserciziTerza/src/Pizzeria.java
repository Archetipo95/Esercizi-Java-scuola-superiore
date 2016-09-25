/*
Classe 3AI
25/05/2013
Fipponi, Masevski
*/

import java.io.*;
import java.util.*;
public class Pizzeria {

	public static void main(String[] args) throws IOException {
		String nomefile, linea;
		int i, numeroingredienti, conta, n, k;
		String nomepizza, prezzo, ingredienti;
		nomefile= "Pizzeria.txt";
		FileInputStream fin= new FileInputStream(nomefile);
		Scanner in= new Scanner(fin);
		conta=0;
		k=-1;
		while(in.hasNextLine())
			{
				linea=in.nextLine();
				conta=conta+1;
			}
		Menu[] Pizza=new Menu [conta];
		FileInputStream fin2= new FileInputStream(nomefile);
		Scanner in2= new Scanner(fin2);
		while(in2.hasNextLine())
			{
				linea= in2.nextLine();
				n=Utile.numeroelementi(linea, '#');
				String [] vett= new String [n];
				vett=Utile.Separatore(linea, '#');
				ingredienti=" ";
				for(i=2; i<n; i++)
					{
						if(i==n-1)
							{
								ingredienti= ingredienti+vett[i];
							}
						if(i<n-1)
							{
								ingredienti= ingredienti+vett[i]+',';
							}	
					}
				k=k+1;
				Pizza[k]= new Menu(vett[0],vett[1],ingredienti,n-2);
				System.out.println(Pizza[k]);
			}
		
	}

}
