import java.util.*;
public class Verifica_main {
	public static void main(String[] args) {
		Scanner t= new Scanner(System.in);
		int d;
		System.out.println("Scrivi la dimensione del vettore");
		d=t.nextInt();
		Verifica_listino list[]= new Verifica_listino[d];
		list[0]=new Verifica_listino(20,"14/05/1989","25/10/2050",5,"Pannocchie",12,2,7,1,1);
		list[1]=new Verifica_listino(12,"30/07/1994","25/10/2050",5,"Banane",3,4,9,8,2);
		list[2]=new Verifica_listino(35,"18/01/1958","25/10/2050",5,"Procioni",9,5,2,16,3);
		list[3]=new Verifica_listino(17,"12/12/2001","25/10/2050",5,"Badili",8,3,9,7,4);
		list[4]=new Verifica_listino(85,"23/09/1932","25/10/2050",5,"Vongole",4,6,3,17,5);
		for(int i=5; i<d; i++)
			{
				list[i]=new Verifica_listino(0,"","",0,"",0,0,0,0,0);
			}
		
		
		Verifica_listino scambio= new Verifica_listino(0,"","",0,"",0,0,0,0,0);
		for(int j=0; j<list.length; j++)
			{
				for(int i=j+1; i<list.length; i++)
					{
						if(list[i].getprezzo()>list[j].getprezzo())
							{
								scambio=list[j];
								list[j]=list[i];
								list[i]=scambio;
							}
					}
			}
		

	}

}
