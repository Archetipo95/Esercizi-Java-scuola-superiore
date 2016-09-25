/**
 * Si vogliono memorizzare le informazioni musicali di una canzone.
 * 
 * @author Fipponi, Masevski 4ai
 * @version 17/09/2013
 *
 */
import java.util.*;
public class Canzone {
	private String autore, titolo;
	private Double durata;
	/**
	 * Costruttore di default	
	 */
	public Canzone(){
		titolo=null;
		autore=null;
		durata=0.0;
	}
	/**
	 * Costruttore con tutti i campi	
	 * @param tit
	 * @param aut
	 * @param dur
	 */
	public Canzone (String titolo, String autore, double durata){
		this.titolo=titolo;
		this.autore=autore;
		setDurata(durata);
	}
	/**
	 * @return autore
	 */
	public String getAutore() {
		return autore;
	}
	/** 
	 * @param autore
	 */
	public void setAutore(String autore) {
		this.autore = autore;
	}
	/**
	 * @return titolo
	 */
	public String getTitolo() {
		return titolo;
	}
	/**
	 * @param titolo
	 */
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	/** 
	 * @return durata
	 */
	public Double getDurata() {
		return durata;
	}
	/** 
	 * @param durata
	 */
	public void setDurata(Double durata) {
		if(this.durata > 0)
			this.durata = durata;
		else
			this.durata = 0.0;
	}

	/**
	 * Inserimento
	 */
	public  void Inserimento(){
		Scanner t=new Scanner (System.in);
		System.out.print("Inserisci il titolo: ");
		this.titolo=t.nextLine();
		System.out.print("Inserisci l'autore: ");
		this.autore=t.nextLine();
		do{
		System.out.print("Inserisci la durata: ");
		this.durata=t.nextDouble();
		}while(this.durata<0.1);
	}
	/**
	 * toString
	 */
	@Override
	public String toString() {
		return "Canzone [autore=" + autore + ", titolo=" + titolo + ", durata="
				+ durata + "]";
	}
	/**
	 * Visualizza
	 */
	public void Visualizza() {
		System.out.println("Autore: "+autore+"\nTitolo: "+titolo+"\nDurata: "+durata);
	}

}