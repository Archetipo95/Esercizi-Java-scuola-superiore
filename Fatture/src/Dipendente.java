/**
 * Masevski Fipponi
 * @author 4ai
 *
 */
//Classe Dipendente deriva da persona e aggiunge stipendio

public class Dipendente extends Persona {

	private double stipendio;
	
	public Dipendente(String cognome, String nome, double stipendio) {
		super(cognome, nome);
		this.stipendio=stipendio;
	}

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}
}