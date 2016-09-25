class Pizza {
	protected String nomepizza;
	protected double prezzo;
	
	protected Pizza (String nomepizza, String prezzo)
		{
			this.nomepizza=nomepizza;
			this.prezzo= Double.parseDouble(prezzo);
		}

}
