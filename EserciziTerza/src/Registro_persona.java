/*
Classe 3AI
17/04/2013
Fipponi, Masevski
*/
public class Registro_persona {
	protected String cognome;
	protected String nome;
	protected String datanascita;
	protected String sesso;

	public Registro_persona(String cognome, String nome, String datanascita, String sesso)
	{
		this.cognome=cognome;
		this.nome=nome;
		this.datanascita=datanascita;
		this.sesso=sesso;
	}

	public String getCognome() {
		return cognome;
	}

	public String getNome() {
		return nome;
	}

	public String getDatanascita() {
		return datanascita;
	}

	public String getSesso() {
		return sesso;
	}

}
