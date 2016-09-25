/**
 * Masevski Fipponi
 * @author 4ai
 *
 */
//Classe Fattura ha contatto, numero, (data), importo

public class Fattura {

	private Contatto contatto;
	private String data;
	private int numero;
	private double importo;

	public Fattura(String data, int numero, double importo) {
		//contatto=new Contatto();
		this.data=data;
		this.numero=numero;
		this.importo=importo;
	}
}