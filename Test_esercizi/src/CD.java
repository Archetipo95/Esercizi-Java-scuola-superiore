/**
 * Si vogliono memorizzare le informazioni musicali di una canzone.
 * 
 * @author Fipponi, Masevski 4ai
 * @version 17/09/2013
 *
 */
import java.util.*;
public class CD{
	private int ncanzoni;
	private Double prezzo;
	private String titolo;
	private String[] informazioni;
	/**
	 * Costruttore default
	 */
	public CD()
	{
		ncanzoni=0;
		prezzo=0.0;
		titolo=null;
		informazioni=null;
	}
	/**
	 * @param titolo
	 * @param prezzo
	 * @param ncanzone
	 * @param informazioni
	 */
	public CD(String titolo, double prezzo, int ncanzoni)
	{
		setNcanzoni(ncanzoni);
		setPrezzo(prezzo);
		this.titolo=titolo;
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
			this.prezzo=0.0;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	/**
	 * Inserisci
	 */
	public  void Inserisci(){
		Scanner t=new Scanner (System.in);
		do{
			System.out.print("Inserisci il numrero di canzoni: ");
			this.ncanzoni=t.nextInt();
		}while(this.ncanzoni<1);
		do{
			System.out.print("Inserisci il prezzo: ");
			this.prezzo=t.nextDouble();
		}while(this.prezzo<0.1);
		t.nextLine();
		System.out.print("Inserisci il titolo: ");
		this.titolo=t.nextLine();
		
		informazioni=new String[this.ncanzoni]; //Crea un vettori di n elementi, che esiste solo in questo metodo !!!
		
		int n=1;
		String info;
		for(int i=0;i<=this.ncanzoni-1;i++){
			System.out.print("Inserisci le informazioni della canzone numero "+(n++)+" : ");
			info=t.nextLine();
			informazioni[i]=info;
		}
	}
	public void Visualizza() {
		System.out.println("/////////////////////////////////////////////////////////////////////////////");
		System.out.println("Titolo CD: "+titolo+"\nPrezzo: "+prezzo+" euro"+"\nNumero canzoni: "+ncanzoni);
		 int n=1;
		for(int i=0;i<=this.ncanzoni-1;i++){
			System.out.println("Canzone numero "+(n++)+" : "+informazioni[i]);
		}
	}
}