
public class Hotel_prenotazioni {
	private String datainizio;
	private String datafine;
	private int codcamera;
	private int codanagraf;
	
	public Hotel_prenotazioni(String di, String df, int camera, int anag)
	{
		codcamera=camera;
		codanagraf=anag;
		boolean x=Hotel_utile.Utile(di);
			if(x==true)
			{
				datainizio=di;
			}
			else
			{
				System.out.println("Errore, data errata");
			}
		 x=Hotel_utile.Utile(df);		
			if(x==true)
			{
				datafine=df;
			}
		else
			{
				System.out.println("Errore, data errata");
			}
	}
	
	@Override
	public String toString() 
	{
		return "Prenotazioni [datainizio=" + datainizio + ", datafine="
				+ datafine + ", codcamera=" + codcamera + ", codanagraf="
				+ codanagraf + "]";
	}
}
