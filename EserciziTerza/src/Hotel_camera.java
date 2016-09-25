
public class Hotel_camera {
	//private String numero;    FINIRE NEL MAIN
	//private int piano;
	private int tipo;
	double prezzo;
	 	public Hotel_camera (String num, int pian, int tip, double prez)
	 		{
	 			//numero=num;
	 			//piano=pian;
	 			tipo=tip;
	 			prezzo=prez;
	 		}
		public String getTipo() {
		String TIPO="";
			if (tipo==1)
			{
				TIPO= "Singola";

			}
		if (tipo==2)
			{
				TIPO= "Doppia";
			}
		if (tipo==3)
			{
				TIPO= "Matrimoniale";
			}
		return TIPO;
		}
		
		public void setPrezzo(double prezzo) {
			this.prezzo = prezzo;
		}
}


