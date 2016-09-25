/**
 * @author Fipponi-Masevski
 * @version 17/04/2013
 */
public class CerchioNuovo_cono extends CerchioNuovo
{
	private double altezza;

	public CerchioNuovo_cono()
	{super();
	altezza=2.0;
	}
	public CerchioNuovo_cono(double r, double h)
	{	
		super(r);
		setAltezza(h);
	}

	public double getAltezza() {
		return altezza;
	}
	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	public double volume()
	{
		double v;
		v=(super.area()*altezza)/3;
		return v;
	}
	public double apotema()
	{	
		double a;
		a=Math.sqrt(altezza*altezza+getRaggio()*getRaggio());
		return a;
	}
	public double superficielat()
	{
		double sl;
		sl=2*Math.PI*getRaggio()*apotema();
		return sl;
	}
	public String toString()
	{
		String s;
		s= "raggio= "+ getRaggio() + "; altezza= " + getAltezza() + "; volume= " + volume() + 
				"; apotema=" + apotema() + "; superficie laterale=" +superficielat();
		return s;
	}
}
