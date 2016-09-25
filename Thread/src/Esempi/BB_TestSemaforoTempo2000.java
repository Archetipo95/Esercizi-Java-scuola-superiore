package Esempi;

public class BB_TestSemaforoTempo2000 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int n=0; n<5000; n++)
		{
			BB_SemaforoTempo sem1 = 
					new BB_SemaforoTempo("SEM"+n, 100+(int)(Math.random()*500));
			sem1.start();
		}
	}

}
