import java.util.*;
public class Magazzino_main {
	public static void main(String args[]){
		Scanner t=new Scanner (System.in);
		int scelta,i,tornaalmenu,modifica,q,qmin,j;
		String desc,cod,cercacod;
		Magazzino articolo[]= new Magazzino[100];
		articolo[0]= new Magazzino("Lamborghini","111",20,10);
		articolo[1]= new Magazzino("Noccioline","BBBB",20,10);
		articolo[2]= new Magazzino("Biscotti","CCCC",0,25);
		articolo[3]= new Magazzino("Formaggio","DDDD",20,10);
		articolo[4]= new Magazzino("Patatine","EEEE",4,10);
		//MENU
		do{
			System.out.println("MENU\n1-Visualizza stato magazzino\n2-Visualizza solo articoli sotto scorta\n3-Aggiungere quantità\n4-Togliere quantità\n5-Modifica scorta minima\n6-Aggiungere articolo\n7-Eliminare articolo");
			System.out.print("Scegli opzione: ");
			scelta=t.nextInt();
			t.nextLine();

			//METTERE A VIDEO TUTTO
			if (scelta==1)
			{
				do{
					System.out.println("MAGAZZINO");
					for (i=0;i <articolo.length-1;i++)
					{
						if (articolo[i]!=null)
						{
							System.out.println(articolo[i].getDescrizione()+"\t"+articolo[i].getCodice()+"\t"+articolo[i].getQuantità()+"\t"+articolo[i].getQuantitàmin());
						}
					}
					
					System.out.println("Premi 0 per tornate al MENU");
					tornaalmenu=t.nextInt();
				} while (tornaalmenu!=0);
			}
			//METTERE A VIDEO SOLO SOTTOSCORTA
			if(scelta==2)
			{
				do{
					System.out.println("ARTICOLI IN SOTTOSCORTA");
					for(i=0;i<articolo.length-1;i++)
					{
						if (articolo[i]!=null)
						{
							if(articolo[i].controllo()==true)
							{
								System.out.println(articolo[i].getDescrizione()+"\t"+articolo[i].getCodice()+"\t"+articolo[i].getQuantità()+"\t"+articolo[i].getQuantitàmin());
							}
						}
					}
					
					System.out.println("Premi 0 per tornate al MENU");
					tornaalmenu=t.nextInt();
				} while (tornaalmenu!=0);
			}
			//AGGIUNGERE QUANTITA ARTICOLO
			if(scelta==3)
			{
				do{
					System.out.println("AGGIUNGI QUANTITA");
					System.out.print("Cerca codice dell'articolo che vuoi aggiungere: ");
					cercacod=t.nextLine();
					for(i=0;i<articolo.length-1;i++)
					{
						if (articolo[i]!=null)
						{
							if(articolo[i].getCodice().equals(cercacod))
							{
								System.out.print("Aggiungi quantità articolo "+(i+1)+": ");
								q=t.nextInt();
								articolo[i].aggiungi(q);
							}
						}
					}
					
					System.out.println("Premi 0 per tornate al MENU");
					tornaalmenu=t.nextInt();
				} while (tornaalmenu!=0);
			}
			//TOGLIERE QUANTITA ARTICOLO
			if(scelta==4)
			{
				do{
					System.out.println("TOGLI QUANTITA");
					System.out.print("Cerca codice dell'articolo che vuoi togliere: ");
					cercacod=t.nextLine();
					for(i=0;i<articolo.length-1;i++)
					{
						if (articolo[i]!=null)
						{
							if(articolo[i].getCodice().equals(cercacod))
							{
								System.out.print("Togli quantità articolo "+(i+1)+": ");
								q=t.nextInt();
								articolo[i].togli(q);
							}
						}
					}

					System.out.println("Premi 0 per tornate al MENU");
					tornaalmenu=t.nextInt();
				} while (tornaalmenu!=0);
			}
			//SETTARE SOTTOSCORTA
			if(scelta==5)
			{
				do{
					System.out.println("SETTARE SOTTO SCORTA");
					for(i=0;i<articolo.length-1;i++)
					{
						if (articolo[i]!=null)
						{
							System.out.println((i+1)+")"+articolo[i].getDescrizione()+"\t"+articolo[i].getCodice()+"\t"+articolo[i].getQuantità()+"\t"+articolo[i].getQuantitàmin());
						}
					}
					System.out.print("Scegli articolo a cui vuoi modificare quantità minima:");
					modifica=t.nextInt();
					System.out.print("Modifica quantità minima all'articolo "+(modifica)+": ");
					qmin=t.nextInt();
					articolo[modifica-1].setQuantitàmin(qmin);

					System.out.println("Premi 0 per tornate al MENU");
					tornaalmenu=t.nextInt();
				} while (tornaalmenu!=0);
			}
			//AGGIUNGERE ARTICOLO
			if(scelta==6)
			{
				do{
					System.out.println("AGGIUNGI ARTICOLO");
					for(i=0;i<articolo.length-1;i++)
					{
						if (articolo[i]==null)
						{
							System.out.print("Descrizione:");
							desc=t.nextLine();
							System.out.print("Codice:");
							cod=t.nextLine();
							System.out.print("Quantità:");
							q=t.nextInt();
							System.out.print("Quantità minima:");
							qmin=t.nextInt();
							articolo[i]= new Magazzino(desc,cod,q,qmin);
							break;
						}
					}

					System.out.println("Premi 0 per tornate al MENU");
					tornaalmenu=t.nextInt();
				} while (tornaalmenu!=0);
			}
			//TOGLIERE
			if(scelta==7)
			{
				do{
					System.out.println("ELIMINA ARTICOLO");
					System.out.println("Puoi eliminare solo articoli con quantità 0");
					for(i=0;i<articolo.length-1;i++)
					{
						if (articolo[i]!=null)
						{
							if(articolo[i].getQuantità()==0)
							{

								j=1;
								System.out.println(j+")"+articolo[i].getDescrizione()+"\t"+articolo[i].getCodice()+"\t"+articolo[i].getQuantità()+"\t"+articolo[i].getQuantitàmin());
								System.out.print("Scegli articolo che vuoi rimuovere:");
								modifica=t.nextInt();
								articolo[i]= null;
								j=j++;						
							}
						}
					}
					
					System.out.println("Premi 0 per tornate al MENU");
					tornaalmenu=t.nextInt();
				} while (tornaalmenu!=0);
			}
		}while(scelta<8 && scelta>0);
	}
}