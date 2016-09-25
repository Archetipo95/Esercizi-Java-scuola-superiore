/**
 * Masevski Fipponi
 * @author 4ai
 *
 */
//Classe Azienda ragione sociale, partita iva implementa Contatto

public class Azienda implements Contatto {

	private String sociale;
	private String iva;
	
	public Azienda(){
		sociale= null;
		iva= null;
	}
	
	public Azienda(String sociale, String iva) {
		this.sociale=sociale;
		this.iva=iva;
	}
	
	public String getDenominazione() {
		
		return sociale;
	}

	public String getCodice() {
		
		return iva;
	}

	public void setSociale(String sociale) {
		this.sociale = sociale;
	}
	
	public void setIva(String iva) {
		this.iva = iva;
	}

	@Override
	public String toString() {
		return "-AZIENDA" + "\nCodice: " + getCodice() + "\nDenominazione: " + getDenominazione();
	}
}