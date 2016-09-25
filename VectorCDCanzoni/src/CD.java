/** 
 * @author Fipponi Masevski 12/10/13
 */
import java.util.*;
public class CD {

	private int ncanzoni;
	private double prezzo;
	private String titoloCD;
	private   Vector <Canzone> v= new Vector<Canzone>();
	
	public CD(){	
		ncanzoni=0;
		prezzo=0.00;
		titoloCD=null;
	}
	
	public CD(int ncanzoni, double prezzo, String titoloCD){
		setNcanzoni(ncanzoni);
		setPrezzo(prezzo);
		setTitoloCD(titoloCD);
	}

	public int getNcanzoni() {
		return ncanzoni;
	}

	public void setNcanzoni(int ncanzoni) {
		if(this.ncanzoni>0)
			this.ncanzoni=ncanzoni;
		else
			this.ncanzoni=0;
	}

	public Double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Double prezzo) {
		if(this.prezzo>0)
			this.prezzo=prezzo;
		else
			this.prezzo=0.00;
	}

	public String getTitoloCD() {
		return titoloCD;
	}

	public void setTitoloCD(String titoloCD) {
		this.titoloCD = titoloCD;
	}
	
	public  void InserisciCD(){
		Scanner t=new Scanner (System.in);
		while(this.ncanzoni<1){
			System.out.print("Inserisci il numero di canzoni del CD: ");
			this.ncanzoni=t.nextInt();
		}
		while(this.prezzo<0.1){
			System.out.print("Inserisci il prezzo del CD: ");
			this.prezzo=t.nextDouble();
		}
		t.nextLine();
		System.out.print("Inserisci il titolo del CD: ");
		this.titoloCD=t.nextLine();
		int n=1;
		for(int i=0;i<=this.ncanzoni-1;i++){
			Canzone c= new Canzone();
			System.out.println("INSERISCI LE INFORMAZIONI DELLA CANZONE N° "+(n++));
			c.InserisciCanzone();
			v.add(c);
			
		}
	}

	public void VisualizzaCD() {
		System.out.println("Numero canzoni=" + ncanzoni + ", prezzo=" + prezzo
				+ ", titoloCD=" + titoloCD);
		for (int i=0;i < v.size(); i++){
			v.get(i).VisualizzaCanzone();
		}
	}
	
}