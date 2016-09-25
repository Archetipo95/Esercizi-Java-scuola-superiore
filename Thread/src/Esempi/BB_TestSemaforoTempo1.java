package Esempi;

public class BB_TestSemaforoTempo1 {

	public static void main(String[] args) {
		BB_SemaforoTempo sem = 
				new BB_SemaforoTempo("Castello", 500);
		sem.start();
	}
}