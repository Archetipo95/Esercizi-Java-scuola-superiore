
public class Partita {
	protected String nomepartita;
	protected int giorno;
	protected int mese;
	protected int anno;
	protected String data;
	
	protected Partita(String np, String data)
	{
		nomepartita=np;
		giorno=Integer.parseInt(data.substring(0,2));
		mese=Integer.parseInt(data.substring(3,5));
		anno=Integer.parseInt(data.substring(6,10));
	}
	
}
