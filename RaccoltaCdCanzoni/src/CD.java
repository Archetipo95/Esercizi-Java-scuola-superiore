/**
 * @author Fipponi, Masevski 4ai
 * @version 17/09/2013
 */
import java.util.Scanner;
public class CD extends Canzone{
	private int ncanzoni;
	private Double prezzo;
	private String titoloCD;
	private String informazioni[];
	//private Canzone vettcd[];                 
	/**
	 * Costruttore default
	 */
	public CD()
	{
		
		ncanzoni=0;
		prezzo=0.00;
		titoloCD=null;
		informazioni=null;
	}
	/**
	 * @param titoloCD
	 * @param prezzo
	 * @param ncanzone
	 * @param informazioni
	 */
	public CD(String titolo, String autore, double durata,String titoloCD, double prezzo, int ncanzoni,String []informazioni)
	{
		super(titolo, autore, durata);
		setNcanzoni(ncanzoni);
		setPrezzo(prezzo);
		setTitoloCD(titoloCD);
		this.informazioni=informazioni;
	}
	/**
	 * Tutti set e get
	 */
	public int getNcanzoni() {
		return ncanzoni;
	}
	public void setNcanzoni(int ncanzoni) {
		if(this.ncanzoni>0)
			this.ncanzoni=ncanzoni;
		else
			this.ncanzoni=0;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		if(this.prezzo>0)
			this.prezzo=prezzo;
		else
			this.prezzo=0.00;
	}
	public String gettitoloCD() {
		return titoloCD;
	}
	public void setTitoloCD(String titoloCD) {
		this.titoloCD = titoloCD;
	}
	/**
	 * Inserisci
	 */
	public  void InserisciCD(){
		Scanner t=new Scanner (System.in);
		do{
			System.out.print("Inserisci il numero di canzoni del CD: ");
			this.ncanzoni=t.nextInt();
		}while(this.ncanzoni<1);
		do{
			System.out.print("Inserisci il prezzo del CD: ");
			this.prezzo=t.nextDouble();
		}while(this.prezzo<0.1);
		t.nextLine();
		System.out.print("Inserisci il titolo del CD: ");
		this.titoloCD=t.nextLine();

		informazioni=new String[this.ncanzoni]; //Crea un vettori di n elementi, che esiste solo in questo metodo !!!

		int n=1;
		for(int i=0;i<=this.ncanzoni-1;i++){
			System.out.println("INSERISCI LE INFORMAZIONI DELLA CANZONE N° "+(n++));
			InserisciCanzone();
			informazioni[i]="\nAutore: "+getAutore()+"\nTitolo: "+getTitolo()+"\nDurata: "+getDurata();
		}
	}
	public void VisualizzaCD() {
		System.out.println("/////////////////////////////////////////////////////////////////////////////");
		System.out.println("TITOLO CD: "+titoloCD+"\nPREZZO CD: "+prezzo+" euro"+"\nNUMERO CANZONI: "+ncanzoni);
		int n=1;
		for(int i=0;i<=this.ncanzoni-1;i++){
			System.out.println("CANZONE N°"+(n++)+informazioni[i]);
		}
	}
}