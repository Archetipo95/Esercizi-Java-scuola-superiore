
public class Hotel_anagrafica
	{
	private String Nome;
	private String Cognome;
	private String Datadinascita;
	
	public Hotel_anagrafica(String n, String c, String d)
		{
		Nome=n;
		Cognome=c;
		boolean x=Hotel_utile.Utile(d);
			if (x==true)
			{
				Datadinascita=d;
			}
			else 
			{
				System.out.println("Errore, data errata");
			}
		}

	public String getNome() {
		return Nome;
	}

	public String getCognome() {
		return Cognome;
	}

	public String getDatadinascita() {
		return Datadinascita;
	}
}
