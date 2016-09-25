/*
Classe 3AI
17/04/2013
Fipponi, Masevski
*/
public class Registro_utente extends Registro_anagrafica {
	protected String username, password;
	public Registro_utente(String use, String pass, String ind, String cap, String cit, String prov, String cell, String em, String cognome, String nome, String sesso, String datadinascita)
	{
		super(ind, cap, cit, prov, cell, em, cognome, nome, sesso, datadinascita);
		username=use;
		password=pass;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}

}
