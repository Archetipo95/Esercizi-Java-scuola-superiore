public class Verifica_prodotto {
	protected String nome; 
	protected double altezza; 
	protected double larghezza;
	protected double profondità; 
	protected double kg;

	public Verifica_prodotto ()
	{
	}
	public Verifica_prodotto (String n, double h, double l, double p, double k)
	{
		nome=n;
		altezza=h;
		larghezza=l;
		profondità=p;
		kg=k;
	}
	protected double volume()
	{
		double v;
		v= altezza*larghezza*profondità;
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
	protected void setprofondità(double profondità)
	{
		this.profondità=profondità;
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
