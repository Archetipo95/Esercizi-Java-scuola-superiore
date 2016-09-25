/**
 * Costruzione di una classe con metodi e attributi
 * @author 3Ia
 * @version 6/02/2013
 */
public class Cerchio
{
	public double Cerchio;
	protected double raggio;
		public Cerchio()
		{}
		
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
	}


