/*
Classe 3AI
17/04/2013
Fipponi, Masevski
 */
public class Registro_profilo extends Registro_utente {
	protected boolean visualizzaestampa, inserimento, modifica, cancella;
	public Registro_profilo(boolean vis, boolean ins, boolean mod, boolean canc, String use, String pass, String ind, String cap, String cit, String prov, String cell, String em, String cognome, String nome, String sesso, String datadinascita)
	{
		super(use, pass, ind, cap, cit, prov, cell, em, cognome, nome, sesso, datadinascita);
		visualizzaestampa=vis;
		inserimento=ins;
		modifica=mod;
		cancella=canc;
	}
	public boolean getVisualizzaestampa() {
		return visualizzaestampa;
	}
	public boolean getInserimento() {
		return inserimento;
	}
	public boolean getModifica() {
		return modifica;
	}
	public boolean getCancella() {
		return cancella;
	}
	public static boolean controllomail(String email) {

		String capovolta= "";
		boolean led;
		int lunghezza = email.length();
		for(int i=lunghezza-1; i>=0; i= i-1)
		{ 
			capovolta=capovolta + email.charAt(i);
		}
		int posAt = capovolta.indexOf("@");
		int posPunto = capovolta.indexOf(".");
		if (posPunto<posAt && posAt>0 && posPunto>0)
		{
			led=false;
		}
		else
		{
			led=true;
		}
		return led;
	}
	public static boolean controllodata(String data)
	{	
		boolean x;
		String numeri= "0123456789";
		int errore=0;
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
			x=false;
		}
		else
		{
			x=true;
		}	  	
		return x;
	}
	public static boolean controllocell(String cell)
	{	
		boolean x;
		String numeri= "0123456789";
		int errore=0;
		//SE VUOI IMPOSTARE ANCHE LA LUNGHEZZA DEL N DI CELL
		if (cell.length()!=10)
		{
			errore=1;
		}
		if (errore==0)
		{    
			if(numeri.indexOf( cell.charAt(0) )<0  && numeri.indexOf( cell.charAt(1) )<0 && numeri.indexOf( cell.charAt(3) )<0 && numeri.indexOf( cell.charAt(4) )<0 && numeri.indexOf( cell.charAt(6) )<0 && numeri.indexOf( cell.charAt(7) )<0 && numeri.indexOf( cell.charAt(8) )<0 && numeri.indexOf( cell.charAt(9) )<0)
			{	
				errore=2;
			}
		} if (errore==0)
		{
			x=false;
		}
		else
		{
			x=true;
		}	  	
		return x;
	}
	public static boolean controllocap(String cap)
	{	
		boolean x;
		String numeri= "0123456789";
		int errore=0;
		//SE VUOI IMPOSTARE ANCHE LA LUNGHEZZA DEL N DI CAP
		if (cap.length()!=5)
		{
			errore=1;
		}
		if (errore==0)
		{    
			if(numeri.indexOf( cap.charAt(0) )<0  && numeri.indexOf( cap.charAt(1) )<0 && numeri.indexOf( cap.charAt(3) )<0 && numeri.indexOf( cap.charAt(4) )<0 && numeri.indexOf( cap.charAt(6) )<0 && numeri.indexOf( cap.charAt(7) )<0 && numeri.indexOf( cap.charAt(8) )<0 && numeri.indexOf( cap.charAt(9) )<0)
			{	
				errore=2;
			}
		} if (errore==0)
		{
			x=false;
		}
		else
		{
			x=true;
		}	  	
		return x;
	}
	public static boolean controllosesso(String sesso)
	{	
		boolean x;
		int errore=0;    
			if(sesso.charAt(0)==('m') || sesso.charAt(0)==('f') || sesso.charAt(0)==('M') || sesso.charAt(0)==('F'))
			{	
				errore=0;
			}
			else
			errore=1;
			
			if (errore==0)
		{
			x=false;
		}
		else
		{
			x=true;
		}	  	
		return x;
	}
	@Override
	public String toString() {
		return "username=" + username + ", password="
				+ password + ", indirizzo=" + indirizzo + ", CAP=" + CAP
				+ ", città=" + città + ", provincia=" + provincia
				+ ", cellulare=" + cellulare + ", email=" + email
				+ ", cognome=" + cognome + ", nome=" + nome + ", datanascita="
				+ datanascita + ", sesso=" + sesso;
	}
	
	

	
}
	

