/** 
 * @author Fipponi Masevski 12/10/13
 */
import java.util.*;
public class Canzone {

	private String autore, titolo;
	private Double durata;
	
	public Canzone(){
		titolo=null;
		autore=null;
		durata=0.00;
	}
	
	public Canzone (String titolo, String autore, double durata){
		this.titolo=titolo;
		this.autore=autore;
		setDurata(durata);
	}
	
	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Double getDurata() {
		return durata;
	}

	public void setDurata(Double durata) {
		if(this.durata > 0)
			this.durata =durata;
		else
			this.durata = 0.00;
	}

	public  void InserisciCanzone(){
		Scanner t=new Scanner (System.in);
		System.out.print("Inserisci il titolo della canzone: ");
		this.titolo=t.nextLine();
		System.out.print("Inserisci l'autore della canzone: ");
		this.autore=t.nextLine();
		do{
			System.out.print("Inserisci la durata della canzone: ");
			this.durata=t.nextDouble();
		}while(this.durata<0.1);
	}
	int n=0;
	public void VisualizzaCanzone() {
		System.out.println("Canzone numero "+ ++n);
		System.out.println("Autore: "+autore+"\nTitolo: "+titolo+"\nDurata: "+durata);
	}

}