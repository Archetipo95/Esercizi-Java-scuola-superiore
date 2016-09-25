package Esempi;

public class AA_ProvaNani2 {

	public static void main(String[] args) {
		Thread conta1 = new AA_ContaINani2("Qwerty");
		Thread conta2 = new AA_ContaINani2("Bill");
		conta1.start();
		conta2.start();
	}

}
