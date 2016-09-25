/**
 * Masevski Fipponi
 * @author 4ai
 *
 */
//Interfaccia Contatto denominazione, codice fatturazione

public abstract class Persona {

	protected String cognome;
	protected String nome;
	
	public Persona () {
		cognome = null;
		nome = null;
	}
	
	public Persona (String cognome, String nome) {
		this.cognome = cognome;
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}