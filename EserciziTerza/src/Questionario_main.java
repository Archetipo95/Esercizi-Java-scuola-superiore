import java.util.*;
import java.io.*;
public class Questionario_main {
	public static void main(String[] args) throws IOException {

		String nomefile="Domande.txt";
		String nomefile1="Risposte.txt";
		String linea,scelta,giusta;
		int conta=0,i=0,j=0,n=0;
		double punteggio;

		Scanner input = new Scanner(System.in);

		FileInputStream fin= new FileInputStream(nomefile);
		Scanner in=new Scanner(fin);
		FileInputStream fin2= new FileInputStream(nomefile1);
		Scanner in2= new Scanner(fin2);

		while(in.hasNextLine())
		{
			linea=in.nextLine();
			n++;
		}
		Questionario que[]= new Questionario[n];

		FileInputStream fin3= new FileInputStream(nomefile);
		Scanner in3= new Scanner(fin3);

		String vett[]= new String[4];
		String mat[][] = new String[n][3];

		while(in3.hasNextLine())
		{
			linea=in3.nextLine();
			vett=Utile.Separatore(linea, '#');

			System.out.println(vett[0] + "\nA): " + vett[1] + "\nB): "  + vett[2] + "\nC): " + vett[3]);
			System.out.print("La tua risposta è: ");
			scelta = input.nextLine();
			giusta = in2.nextLine();

			que[i]= new Questionario(vett[0],vett[1],vett[2],vett[3],giusta,scelta);
			conta = conta + Questionario.correttore();

			if(Questionario.correttore()==0)
			{
				mat[j][0] = vett[0];
				mat[j][1] = scelta;
				mat[j][2] = giusta;
				j++;
			}
			i++;
		}
		punteggio = conta*100/n;
		System.out.print("Il punteggio è: " + punteggio + "% ");
		if(punteggio>= 66)
		{
			System.out.println("Sei sufficiente!");
			System.out.println();
		}
		else
		{
			System.out.println("Non sei sufficiente!");
		}

		if(punteggio!=100)
		{
			System.out.println("Risposte sbagliate: ");
			n=j-1;
			j=0;
			for(i=0; i<=n; i++)
			{
				System.out.println(mat[j][0] + "\nRisposta data: " + mat[j][1] + "\nRisposta giuta: " + mat[j][2]);
				j++;
			}
		}
	}
}