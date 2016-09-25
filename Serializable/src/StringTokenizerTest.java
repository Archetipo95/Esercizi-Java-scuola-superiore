
import java.util.StringTokenizer;


public class StringTokenizerTest {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String frase="Pippo va al mercato, Topolino\t torna, "
				+ "Paperino si\n sveglia, "
				+ "Paperone conta i dollari";
		System.out.println(frase);

		// Separiamo i pezzi con la virgola
		StringTokenizer daVirgole = new StringTokenizer(frase, ",");
		
		
		int contaSubFrasi = 0;
		while(daVirgole.hasMoreTokens())
		{
			String subFrase = daVirgole.nextToken();
			++contaSubFrasi;
			System.out.println("SubFrase daVirgole n. " 
					+ contaSubFrasi 
					+ " = (" + subFrase +")");
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		StringTokenizer daSpazi = new StringTokenizer(frase, " ");
		contaSubFrasi = 0;
		while(daSpazi.hasMoreTokens())
		{
			String subFrase = daSpazi.nextToken();
			++contaSubFrasi;
			System.out.println("SubFrase daSpazi n. " + contaSubFrasi + " = (" + subFrase +")");
		}
		
		StringTokenizer daSpaziEVirgole = new StringTokenizer(frase, " ,");
		contaSubFrasi = 0;
		while(daSpaziEVirgole.hasMoreTokens())
		{
			String subFrase = daSpaziEVirgole.nextToken();
			++contaSubFrasi;
			System.out.println("SubFrase daSpazi n. " + contaSubFrasi + " = (" + subFrase +")");
		}
		//System.exit(0);

		String alunno="Cognome;Nome;5;6;7";
		System.out.println(alunno);
		StringTokenizer daPuntievirgola = new StringTokenizer(alunno, ";");
		contaSubFrasi = 0;
		while(daPuntievirgola.hasMoreTokens())
		{
			String subFrase = daPuntievirgola.nextToken();
			++contaSubFrasi;
			System.out.println("SubFrase daPuntievirgola n. " 
			    + contaSubFrasi + " = (" + subFrase +")");
		}
	}

}
