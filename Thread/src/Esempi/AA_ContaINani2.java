package Esempi;

public class AA_ContaINani2 extends Thread {

	public AA_ContaINani2(String nome) {
		super(nome);
	}

	public void run() {
		for(int i=1; i<=7; ++i)
		{
			System.out.println(this.getName() 
					+ " nano n." + i);
		}
	}
}
