package Esempi;

public class BA_SemaforoTempoFisso extends Thread {

	public BA_SemaforoTempoFisso(String name) {
		super(name);
		}

	public void run() {
		for(int volte=1; volte<=5; ++volte)
		{
			System.out.println(this.getName() + " " + volte + " Rosso - Verde");
			try {
				this.sleep(3000);
			} catch (InterruptedException e) {}
			
			System.out.println(this.getName() + " " + volte + " Rosso - Arancio");
			try {
				this.sleep(500);
			} catch (InterruptedException e) {}
			
			System.out.println(this.getName() 
					+ " " + volte + " Verde - Rosso");
			try {
				this.sleep(3000);
			} catch (InterruptedException e) {}
			
			System.out.println(this.getName() 
					+ " " + volte + " Arancio - Rosso");
			try {
				this.sleep(500);
			} catch (InterruptedException e) {}
		} 
	}
}