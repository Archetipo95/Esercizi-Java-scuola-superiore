/**
 * Masevski Fipponi
 * @author 4ai
 *
 */
//Classe Privato deriva da persona e aggiunge codice fiscale implementa Contatto

public class Privato extends Persona implements Contatto {

	private String codicefiscale;
	
	public Privato(String cognome, String nome, String codicefiscale) {
		super(cognome, nome);
		this.codicefiscale=codicefiscale;
	}
	
	public String getDenominazione() {
		String denominazione= cognome + nome;
		return denominazione;
	}

	public String getCodice() {
		
		return codicefiscale;
	}

	public void setCodicefiscale(String codicefiscale) {
		this.codicefiscale = codicefiscale;
	}

	@Override
	public String toString() {
		return "-PRIVATO" + "\nCodice: " + getCodice() + "\nDenominazione: " + getDenominazione();
	}

	
}