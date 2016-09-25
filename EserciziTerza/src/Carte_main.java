public class Carte_main 
{
	public static void main(String[] args) 
	{
		int i, vise,x=0,y=0,p1=0,p2=0;
		Carte  carte[]= new Carte[40];
		Carte  giocatore1[]= new Carte[20];
		Carte  giocatore2[]= new Carte[20];
		for(i=0;i<40;i++)
		{
			carte[i]=new Carte();
		}
		for( i=0; i<10; i++)
		{	
			carte[i]=new    Carte(i+1,"cuori");
			carte[i+10]=new Carte(i+1,"quadri");
			carte[i+20]=new Carte(i+1,"fiori");
			carte[i+30]=new Carte(i+1,"picche");
		}
		Carte  scambio= new Carte();
		for(i=0; i<40; i++)
		{	
			vise=(int)(Math.random()*40);
			scambio=carte[i];
			carte[i]=carte[vise];
			carte[vise]=scambio;
		}
		
		for( i=0;i<40;i++)
		{
			//System.out.print(carte[i].getNumero() + " di " + carte[i].getSeme()+"; ");
			
			String msg= ""+carte[i];
			System.out.println(msg);
			
		}
		for( i=0;i<40;i++)
		{
			if(i%2==0)
			{
				giocatore1[x]=carte[i];
				x++;
			}
			else
			{
				giocatore2[y]=carte[i];
				y++;
			}
		}
		for(i=0;i<20;i++)
		{
			p1=p1+giocatore1[i].getNumero();			
			p2=p2+giocatore2[i].getNumero();
		}
		System.out.println();
		System.out.println("****PUNTI****");
		System.out.println("Giocatore 1: "+p1);
		System.out.println("Giocatore 2: "+p2);
		if(p1>p2)
		{
			System.out.println("Vince giocatore 1");
		}
		if(p2==p1)
		{
			System.out.println("Sono pari");
		}
		if(p1<p2)
		{
			System.out.println("Vince giocatore 2");
		}
	}
}
