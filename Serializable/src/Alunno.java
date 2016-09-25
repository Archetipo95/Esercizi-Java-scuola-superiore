
public class Alunno {
	String cognome, nome;
	int annoNascita;
	
	/**
	 * Costruttore di Alunno "nullo". 
	 */
	public Alunno() {
		this.cognome = this.nome = null;
		this.annoNascita = 2000;	
	}

	/**
	 * @param cognome
	 * @param nome
	 * @param annoNascita
	 */
	public Alunno(String cognome, String nome, int annoNascita) {
		this.cognome = cognome;
		this.nome = nome;
		this.annoNascita = annoNascita;
	}
	/**
	 * @return the cognome
	 */
	public String getCognome() {
		return cognome;
	}
	/**
	 * @param cognome the cognome to set
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the annoNascita
	 */
	public int getAnnoNascita() {
		return annoNascita;
	}
	/**
	 * @param annoNascita the annoNascita to set
	 */
	public void setAnnoNascita(int annoNascita) {
		this.annoNascita = annoNascita;
	}

	@Override
	public String toString() {
		return "Alunno:" + cognome + " " + nome 
				+ " nato :" + annoNascita;
	}


}
