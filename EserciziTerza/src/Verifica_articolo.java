public class Verifica_articolo extends Verifica_prodotto {
	protected int giacenza;

	public Verifica_articolo(int giac, String n, double h, double l, double p, double k)
	{
		super(n, h, l, p, k);
		giacenza=giac;
	}
	protected double volumetotale()
	{
		double vt;
		vt=super.volume()*giacenza;
		return vt;
	}
	protected double pesototale()
	{
		double pt;
		pt= super.kg*giacenza;
		return pt;
	}
	protected void setgiacenza(int giacenza)
	{
		this.giacenza=giacenza;
	}
}
