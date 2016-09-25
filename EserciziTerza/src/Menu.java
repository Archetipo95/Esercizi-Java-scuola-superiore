class Menu extends Pizza {
	private String ingredienti;
	private int numeroingredienti;
	
	public Menu(String nomepizza, String prezzo, String ingredienti, int numeroingredienti)
		{
			super(nomepizza, prezzo);
			this.ingredienti=ingredienti;
			this.numeroingredienti=numeroingredienti;
		}

	public String getnomepizza() {
		return super.nomepizza;
	}
	
	public double getprezzo() {
		return super.prezzo;
	}
	
	public String getIngredienti() {
		return this.ingredienti;
	}

	public int getNumeroingredienti() {
		return this.numeroingredienti;
	}
	public String toString()
	{
		String s;
		s=super.nomepizza+" prezzo: "+super.prezzo+" £  "+" N° ingredienti: "+numeroingredienti
				+"\n"+" Ingredienti: "+ingredienti;
		return s;
	}	
}
