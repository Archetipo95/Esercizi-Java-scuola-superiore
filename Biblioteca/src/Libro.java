/**
 * masevski-fipponi 3/11/13
 */
import java.util.*;
public class Libro {
	private String codice;
	private String titolo;
	private String autore;
	private double prezzo;
	private Scanner ta= new Scanner(System.in);
	
	public Libro(){
		
		codice="";
		titolo="";
		autore="";
		prezzo=0.0;
	}
	
	public Libro(String c, String t, String a, double p)
	{
		ta=new Scanner(System.in);
		codice=c;
		titolo=t;
		autore=a;
		setPrezzo(p);
	}
	
	
	public void setPrezzo(double p){
		if(p<=0)
			{	
				System.out.println("Prezzo errato");
				p=0;
			}
		else 
			{
				prezzo=p;
			}
	}
	
	public void Inserisci(){
	
	System.out.print("Scrivi il codice del libro: ");
	codice= ta.nextLine();
	System.out.print("Scrivi il titolo del libro: ");
	titolo= ta.nextLine();
	System.out.print("Scrivi l'autore: ");
	autore= ta.nextLine();
	System.out.print("Scrivi il prezzo: ");
	prezzo= ta.nextDouble();
	ta.nextLine();
	}
	
	public void Visualizza(){
		System.out.println("Codice: "+codice+" Titolo: "+titolo+" Autore: "+autore+" Prezzo: "+prezzo);
	}
	
	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getCodice() {
		return codice;
	}
	
	
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Scanner getTa() {
		return ta;
	}

	public void setTa(Scanner ta) {
		this.ta = ta;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String toString() {
		return "Codice=" + codice + ", titolo=" + titolo + ", autore="
				+ autore + ", prezzo=" + prezzo;
	}
	
}