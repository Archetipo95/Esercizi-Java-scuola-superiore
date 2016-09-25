package Esempi;

public class AA_ProvaNani2bis {

	public static void main(String[] args) {
		String persone[] = {"Pippo", "Francesco", "Marco", "Evangelista", "Meus"};
		for(int p=0; p<persone.length; ++p)
		{
			Thread conta = new AA_ContaINani2(persone[p]);
			conta.start();
		}
			
	}

}
