public class Verifica_prodotto {
	protected String nome; 
	protected double altezza; 
	protected double larghezza;
	protected double profondit�; 
	protected double kg;

	public Verifica_prodotto ()
	{
	}
	public Verifica_prodotto (String n, double h, double l, double p, double k)
	{
		nome=n;
		altezza=h;
		larghezza=l;
		profondit�=p;
		kg=k;
	}
	protected double volume()
	{
		double v;
		v= altezza*larghezza*profondit�;
		return v;
	}
	protected void setnome(String nome)
	{
		this.nome=nome;
	}
	protected void setaltezza(double altezza)
	{
		this.altezza=altezza;
	}
	protected void setprofondit�(double profondit�)
	{
		this.profondit�=profondit�;
	}
	protected void setlarghezza(double larghezza)
	{
		this.larghezza=larghezza;
	}
	protected void setkg(double kg)
	{
		this.kg=kg;
	}
}
