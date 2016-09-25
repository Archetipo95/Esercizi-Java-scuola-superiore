
public class Biglietto extends Partita {
	protected String posizione;
	protected int numeroposto;
	protected double prezzo;

	public Biglietto(String np, String data, String pos, String npost, String pr)
	{
		super(np, data);
		posizione=pos;
		numeroposto= Integer.parseInt(npost);
		prezzo=Double.parseDouble(pr);
	}

	public String getPosizione() {
		return posizione;
	}

	public int getNumeroposto() {
		return numeroposto;
	}

	public double getPrezzo() {
		return prezzo;
	}
	public String getNomepartita() {
		return super.nomepartita;
	}
	public String getdata() {
		return super.data;
	}
	public String toString()
	{
		String s;
		s="La posizione è: "+posizione+" Il numero del posto è: "+numeroposto+"La partita è: "+super.nomepartita
				+"\n"+" Data: "+data;
		return s;
	}	
}
