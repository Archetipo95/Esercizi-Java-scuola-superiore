/*
Classe 3AI
17/04/2013
Fipponi, Masevski
*/
public class Registro_anagrafica extends Registro_persona {
	protected String indirizzo, CAP, città, provincia, cellulare, email;
	public Registro_anagrafica(String ind, String cap, String cit, String prov, String cell, String em, String cognome, String nome, String sesso, String datadinascita)
	{
		super(cognome, nome, sesso, datadinascita);
		indirizzo=ind;
		CAP=cap;
		città=cit;
		provincia=prov;
		cellulare=cell;
		email=em;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public String getCAP() {
		return CAP;
	}
	public String getCittà() {
		return città;
	}
	public String getProvincia() {
		return provincia;
	}
	public String getCellulare() {
		return cellulare;
	}
	public String getEmail() {
		return email;
	}




}
