public class Verifica_listino extends Verifica_articolo {
	private double prezzo;
	private double aliquotaiva;
	private String datainizio;
	private String datafine;

	public Verifica_listino(double pr, String di, String df, double iva, String n, double h, double l, double p, double k, int giac)
	{
		super(giac, n, h, l, p, k);
		prezzo=pr;
		datainizio=di;
		datafine=df;
		aliquotaiva=iva;
	}
	public int giornidivalidità()
	{	
		String aai, mmi, ggi, aaf, mmf, ggf;
		int tot, ai, mi, gi, af, mf , gf;
		ggi= datainizio.substring(0,2);
		mmi= datainizio.substring(3,5);
		aai= datainizio.substring(6,10);
		ggf= datafine.substring(0,2);
		mmf= datafine.substring(3,5);
		aaf= datafine.substring(6,10);
		gi= Integer.parseInt(ggi);
		mi= Integer.parseInt(mmi);
		ai= Integer.parseInt(aai);
		gf= Integer.parseInt(ggf);
		mf= Integer.parseInt(mmf);
		af= Integer.parseInt(aaf);
		tot=(ai*365+mi*30+gi)-(af*365+mf*30+gf);
		return tot;
	}
	public double calcoloiva()
	{
		double iva;
		iva=prezzo*aliquotaiva/100;
		return iva;
	}
	public void setPrezzo(double prezzo) 
	{
		this.prezzo = prezzo;
	}
	public void setAliquotaiva(double aliquotaiva) 
	{
		this.aliquotaiva = aliquotaiva;
	}
	public void setDatainizio(String datainizio) 
	{
		this.datainizio = datainizio;
	}
	public void setDatafine(String datafine) 
	{
		this.datafine = datafine;
	}
	public void setgiacenza(int giacenza)
	{
		super.giacenza=giacenza;
	}
	public void setnome(String nome)
	{
		super.nome=nome;
	}
	public void setaltezza(double altezza)
	{
		super.altezza=altezza;
	}
	public void setprofondità(double profondità)
	{
		super.profondità=profondità;
	}
	public void setlarghezza(double larghezza)
	{
		super.larghezza=larghezza;
	}
	public void setkg(double kg)
	{
		super.kg=kg;
	}
	public double getvolume()
	{
		return super.volume();
	}
	public double getvolumetotale()
	{
		return super.volumetotale();
	}
	public double getprezzo()
	{
		return prezzo;
	}
	public double getpesototale()
	{
		return super.pesototale();
	}
}