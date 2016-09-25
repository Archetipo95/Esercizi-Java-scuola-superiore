/*
 * Fippni Davide, Masevski Martin
 * 3^AI
 * 17/11/2012
 */
import java.util.*;
public class Controllo_data {
	public static void main(String[] args) {
	Scanner tastiera= new Scanner(System.in);
	int errore;
	System.out.println("Inserisci la data");
	String data= "";
	String numeri= "0123456789";
	data= tastiera.nextLine();
	errore=0;
	if (data.length()!=10)
	{
		errore=1;
	}
	if (errore==0)
	{ 
		if(data.charAt(2)!='/' || data.charAt(5)!='/')
		{
			errore=2;
		}
	}	
	if(errore==0)
	{    
		if(numeri.indexOf( data.charAt(0) )<0  && numeri.indexOf( data.charAt(1) )<0 && numeri.indexOf( data.charAt(3) )<0 && numeri.indexOf( data.charAt(4) )<0 && numeri.indexOf( data.charAt(6) )<0 && numeri.indexOf( data.charAt(7) )<0 && numeri.indexOf( data.charAt(8) )<0 && numeri.indexOf( data.charAt(9) )<0)
		{	
	        errore=3;
		}
	if(errore==0)
	{	
		String gg= data.substring(0,2);
		String mm= data.substring(3,5);
		String aaaa= data.substring(6,10);
		int giorno,mese,anno;
		giorno= Integer.parseInt(gg);
		mese= Integer.parseInt(mm);
		anno= Integer.parseInt(aaaa);
	   if(mese<0 || mese>12)
	   {
		   errore=4;
	   }
	   if(mese==1 || mese==3 || mese==5 || mese==7 || mese==8 || mese==10 || mese==12)   
	   {
		 if(giorno<0 || giorno>31)
		 {
			errore=5; 
	     }
	   }
	   if(mese==4 || mese==6 || mese==9 || mese==11)   
	   {
		   if(giorno<0 || giorno>30)
		 {
			errore=6; 
	     }
	   }
	   if(mese==2)
	   {
		  int resto=0;
		  resto=anno%4;
		  if (resto==0)
		  {
			 if(giorno<1 || giorno>29)
				 {
					errore=7; 
			     } 
		  }
		  else
		  {
			  if(giorno<1 || giorno>28)
				 {
					errore=8; 
			     }  
		  }
	   }
	}
	}
	if (errore==0)
	{
		System.out.println("data corretta");
	}
	else
	{
		System.out.println("errore"+errore);
	}
	}
}
	
	


