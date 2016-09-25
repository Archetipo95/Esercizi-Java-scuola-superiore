import java.util.*;
public class Vestito {
	private String marca,modello,taglia;
	private int quantita;
	private Double prezzo;

	public Vestito(){
		setMarca(null);
		setModello(null);
		setTaglia(null);
		setQuantita(0);
		setPrezzo(0.0);

	}

	public Vestito(String marca, String modello, String taglia, int quantita, double prezzo){
		setMarca(marca);
		setModello(modello);
		setTaglia(taglia);
		setQuantita(quantita);
		setPrezzo(prezzo);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {	
		this.modello = modello;
	}

	public String getTaglia() {
		return taglia;
	}

	public void setTaglia(String taglia) {
		if(taglia!="s" || taglia!="m" || taglia!="l" || taglia!="S" || taglia!="M" || taglia!="L")
			this.taglia=null;
		else
			this.taglia = taglia;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		if(quantita<0)
			this.quantita=0;
		else
			this.quantita = quantita;
	}

	public Double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Double prezzo) {
		if(prezzo<0.1)
			this.prezzo=0.0;
		else
			this.prezzo = prezzo;
	}
	Scanner t= new Scanner (System.in);
	public void Inserisci(){
		System.out.println("Inserisci marca: ");
		this.marca=t.nextLine();
		System.out.println("Inserisci modello: ");
		this.modello=t.nextLine();
		do{System.out.println("Inserisci taglia: ");
		this.taglia=t.nextLine();
		}while(taglia!="S" || taglia!="M" || taglia!="L" || taglia!="s" || taglia!="m" || taglia!="l");
		do{System.out.println("Inserisci quantità: ");
		this.quantita=t.nextInt();
		}while(quantita<0);
		do{System.out.println("Inserisci prezzo unitario: ");
		this.prezzo=t.nextDouble();
		}while(prezzo<0.0);
	}

	@Override
	public String toString() {
		return "Vestito [marca=" + marca + ", modello=" + modello + ", taglia="
				+ taglia + ", quantita=" + quantita + ", prezzo=" + prezzo
				+ "]";
	}
	
	public void Visualizza(){
		System.out.println("Marca: " + getMarca() +"\nModello: " + getModello() + "\nTaglia: " + getTaglia() + "\nQuantità: " + getQuantita() + "\nPrezzo: " + getPrezzo());
	}
	
	public void Sconto(Double sconto){
		this.prezzo=(prezzo/100)*sconto;
	}

	public void Vende(int vende){
		this.quantita=quantita-vende;
	}
	
	public boolean sottoScorta(int scorta){
		boolean controllo;
		if(this.quantita<scorta)
			controllo=true;
		else
			controllo=false;
		return controllo;
	}
}
