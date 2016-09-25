package Esempi;

public class BB_TestSemaforoTempo2 {

	public static void main(String[] args) {
		BB_SemaforoTempo sem1 = new BB_SemaforoTempo("Castello", 1000);
		sem1.start();
		BB_SemaforoTempo sem2 = new BB_SemaforoTempo("Ferrovia", 500);
		sem2.start();
	}
}