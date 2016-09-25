public class Questionario extends Opzioni {
	private static String rispostadomanda;
	private static String rispostadata;
	
	public Questionario(String d, String o1, String o2, String o3, String rispd, String rispdata)
		{
			super(d,o1,o2,o3);
			rispostadomanda=rispd;
			rispostadata=rispdata;
		}
	public static int correttore()
		{
			if(rispostadomanda.equalsIgnoreCase(rispostadata))
				return 1;
			else
				return 0;
		}
}
