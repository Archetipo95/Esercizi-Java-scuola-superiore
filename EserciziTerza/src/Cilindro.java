/**
 * Costruiamo la classe Cilindro a partire (derivando o estendendo) la classe CerchioNuovo.
 * Il cilindro, in più, ha un'altezza.
 * Deve avere i metodi set/get opportuni, i metodi per il calcolo del volume 
 * della superficie laterale, della superficie totale.
 * Ridefinire il metodo toString().
 * @author Fipponi-Masevski
 * @version 06/04/2013
 *
 */
public class Cilindro extends CerchioNuovo 
{	
	/**
	 * Il cilindro è un cerchio traslato in altezza parallelamente alla base.
	 */
	private double altezza;

	/**
	 * Costruttore di default.
	 * Definiamo altezza=1
	 * Il raggio è inizializzato dal costruttore di CerchioNuovo.
	 */
	public Cilindro()
	{
		super(2.0); //chiama il costruttore di CerchioNuovo
		altezza=1.0;
	}
	/**
	 * Costruttore con parametri raggio e altezza.
	 * Raggio viene passato al costruttore di CerchioNuovo, altezza viene impostata con il metodo set opportuno.
	 * @param r
	 * @param h
	 */

	public Cilindro(double r, double h)
	{
		super(r); //chiama il costruttore di CerchioNuovo
		setAltezza(h);
	}
	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		if(altezza>0)
			this.altezza = altezza;
		else 
			this.altezza=0;
	}

	/**
	 * 
	 * @return volume
	 */
	public double volume()
	{
		double v;
		//v= getRaggio()*getRaggio()*Math.PI*altezza;
		// calcola il volume richiamando l'area del cerchio
		v= area()*altezza;
		return v;
	}

	/**
	 * Calcola area laterale del cilindro
	 * @return area laterale calcolata
	 */
	public double areaLat()
	{
		double al;
		al=circonferenza()*altezza;
		return al;
	}

	/**
	 * Calcola area totale del cilindro
	 * @return area totale calcolata
	 */
	public double areaTot()
	{
		double at;
		at= area()*2+areaLat();
		return at;
	}
	public String toString()
	{
		String s;
		s= "raggio= "+ getRaggio() + "; altezza= " + altezza + "; volume= " + this.volume() + 
				"; area laterale=" + this.areaLat() + "; area totale=" +areaTot();
		return s;
	}
}
