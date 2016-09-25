/*
 * Fipponi Davide, Masevski Martin
 * 3^AI
 * 05/12/2012
 */
import java.util.*;

public class Rubrica {

	public static void main(String[] args) {
		Scanner tastiera=new Scanner (System.in);
		int scelta,prossimoelemento=0,tornaalmenu,i=0,j=0,elementoscelto,cancella=0;
		String nome[]=new String [100];	
		String cognome[]=new String [100];
		String telefono[]=new String [100];
		String email[]=new String [100];
		String scambio="";
		String cognomecercato="";
		String iniziale="";
		do 
		{
			System.out.println("MENU\n1-Aggiungi nuovo contatto\n2-Ordina per nome\n3-Ordina per cognome\n4-Visualiza lista completa\n5-Modifica\n6-Cancella\n7-Ricerca per cognome\n8-Ricerca avanzata\n9-Ricerca alla google\n10-Esci");
			System.out.print("Scegli opzione: ");
			scelta=tastiera.nextInt();
			tastiera.nextLine();	
			if(scelta==1)
			{
				System.out.print("Nome: ");
				nome[prossimoelemento]=tastiera.nextLine();
				System.out.print("Cognome: ");
				cognome[prossimoelemento]=tastiera.nextLine();
				System.out.print("Telefono: ");
				telefono[prossimoelemento]=tastiera.nextLine();
				System.out.print("e-mail: ");
				email[prossimoelemento]=tastiera.nextLine();
				prossimoelemento=prossimoelemento+1;
				do
				{
					System.out.println("Premi 0 per tornate al MENU");
					tornaalmenu=tastiera.nextInt();
				} while (tornaalmenu!=0);
			}
			if (scelta==2)
			{
				for (i=0;i<prossimoelemento;i=i+1)
				{
					for (j=0;j<prossimoelemento;j=j+1)
					{
						if (nome[i].compareToIgnoreCase(nome[j])>0)
						{
							scambio=nome[i];
							nome[i]=nome[j];
							nome[j]=scambio;

							scambio=cognome[i];
							cognome[i]=cognome[j];
							cognome[j]=scambio;

							scambio=telefono[i];
							telefono[i]=telefono[j];
							telefono[j]=scambio;

							scambio=email[i];
							email[i]=email[j];
							email[j]=scambio;
						}
					}
				}
			}
			if (scelta==3)
			{
				for (i=0;i<prossimoelemento;i=i+1)
				{
					for (j=i+1;j<prossimoelemento;j=j+1)
					{
						if (cognome[i].compareToIgnoreCase(cognome[j])>0)
						{
							scambio=cognome[i];
							cognome[i]=cognome[j];
							cognome[j]=scambio;

							scambio=nome[i];
							nome[i]=nome[j];
							nome[j]=scambio;

							scambio=telefono[i];
							telefono[i]=telefono[j];
							telefono[j]=scambio;

							scambio=email[i];
							email[i]=email[j];
							email[j]=scambio;
						}
					}
				}
			}	
			if (scelta==4)
			{
				for(i=0;i<prossimoelemento;i++)
				{
					System.out.println((i+1)+"\t"+cognome[i]+"\t"+nome[i]+"\t"+telefono[i]+"\t"+email[i]);
				}
				do
				{
					System.out.println("Premi 0 per tornate al MENU");
					tornaalmenu=tastiera.nextInt();
				} while (tornaalmenu!=0);

			}
			if (scelta==5)
			{
				for(i=0;i<prossimoelemento;i++)
				{
					System.out.println((i+1)+"\t"+cognome[i]+"\t"+nome[i]+"\t"+telefono[i]+"\t"+email[i]);
				}
				do
				{
					System.out.print("Scrivi il numero del contatto che vuoi modificare: ");
					elementoscelto=tastiera.nextInt();
				}while (elementoscelto<0 || elementoscelto>prossimoelemento);

				tastiera.nextLine();
				System.out.print("Nome: ");
				nome[elementoscelto-1]=tastiera.nextLine();
				System.out.print("Cognome: ");
				cognome[elementoscelto-1]=tastiera.nextLine();
				System.out.print("Telefono: ");
				telefono[elementoscelto-1]=tastiera.nextLine();
				System.out.print("e-mail: ");
				email[elementoscelto-1]=tastiera.nextLine();					
				do
				{
					System.out.println("Premi 0 per tornate al MENU");
					tornaalmenu=tastiera.nextInt();
				} while (tornaalmenu!=0);

			}
			if (scelta==6)
			{
				for(i=0;i<prossimoelemento;i++)
				{
					System.out.println((i+1)+"\t"+cognome[i]+"\t"+nome[i]+"\t"+telefono[i]+"\t"+email[i]);
				}
				do
				{
					System.out.print("Scegliere il contatto da eliminare: ");
					elementoscelto=tastiera.nextInt();
				}while (elementoscelto<0 || elementoscelto>prossimoelemento);
				for(i=cancella;1<prossimoelemento;i++)
				{
					nome[i-1]=nome[i];
					cognome[i-1]=cognome[i];
					telefono[i-1]=telefono[i];
					email[i-1]=email[i];
				} 
				prossimoelemento=prossimoelemento-1;
				do
				{
					System.out.println("Premi 0 per tornate al MENU");
					tornaalmenu=tastiera.nextInt();
				} while (tornaalmenu!=0);
			}
			if(scelta==7)
			{
				System.out.print("Scrivi il cognome del contatto che cerchi: ");
				cognomecercato=tastiera.nextLine();
				for(i=0;i<prossimoelemento;i++)
				{
					if (cognome[i].equals(cognomecercato)==true)
					{
						System.out.println((i+1)+"\t"+cognome[i]+"\t"+nome[i]+"\t"+telefono[i]+"\t"+email[i]);
					}
				}
				do
				{
					System.out.println("Premi 0 per tornate al MENU");
					tornaalmenu=tastiera.nextInt();
				} while (tornaalmenu!=0);
			}
			if(scelta==8)  //RICERCA AVANZATA (NON VA)
			{
				System.out.println("Scrivi l'iniziale: ");
				iniziale=tastiera.nextLine();
				for(i=0;i<prossimoelemento;i++)
				{

					if(iniziale.compareToIgnoreCase(cognome[0])>0)
					{
						System.out.println((i+1)+"\t"+cognome[i]+"\t"+nome[i]+"\t"+telefono[i]+"\t"+email[i]);
					}
				}
				do
				{
					System.out.println("Premi 0 per tornate al MENU");
					tornaalmenu=tastiera.nextInt();
				} while (tornaalmenu!=0);
			}
			if(scelta==9)  //RICERCA GUGLE (NON VA)
			{

				do
				{
					System.out.println("Premi 0 per tornate al MENU");
					tornaalmenu=tastiera.nextInt();
				} while (tornaalmenu!=0);
			}
		} while (scelta < 10 && scelta > 0);
	}


}
