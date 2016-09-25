/**
 * Precisiamo l'uso dei metodi set/get come definito nelle consuetudini JavaBeans.
 * 
 * @author 3Ia
 * @version 27/02/2013 - 
 */
public class CerchioNuovo {
	/**
	 * Attributo 
	 * Il raggio deve essere >=0.
	 */
	private double raggio;
	public CerchioNuovo()
	{
		raggio= 1.0;
	}
	
	public CerchioNuovo(double r)
	{
		setRaggio(r);
		
	}
	
	/*
	public double getRaggio()
	{
		return raggio;
	}
	
	public void setRaggio(double r)
	{
		if(r>=0)
			raggio=r;
		else
			raggio=0.0;
	}
	*/
	
	public double getRaggio() 
	{
		return raggio;
	}


	public void setRaggio(double raggio) 
	{
		if(raggio>=0)
			this.raggio = raggio;
		else
			this.raggio=0;
	}


	/**
	 * Calcolo del valore della circonferenza.
	 * @return la circonferenza calcolata
	 */
	public double circonferenza()
	{
		double crf;
		crf=2*raggio*Math.PI;
		return crf;
	}
	
	/**
	 * Calcolo del valore dell'area
	 * @return l'area calcolata
	 */
	public double area()
	{
		double a;
		a=raggio*raggio*Math.PI;
		return a;
	}

/**
 * Metodo standard per convertire un oggetto della classe CerchioNuovo in String.
 * NOTA: Ogni volta che serve una conversione da CerchioNuovo a String, questo metodo viene
 * invocato implicitatamente. 
 */

public String toString()
	{
		String s;
		s= "raggio= "+ this.raggio + "; circonferenza= " + this.circonferenza() + "; area= " + this.area();
		return s;
	}

/*Tutte le scritte (annotazioni) con la @ sono utilizzate da altri programmi
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}
*/

}