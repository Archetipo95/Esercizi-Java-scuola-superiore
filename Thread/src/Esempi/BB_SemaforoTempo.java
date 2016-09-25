package Esempi;

public class BB_SemaforoTempo extends Thread {

	long tempo;
	public BB_SemaforoTempo(String name, long t) {
		super(name);
		tempo = t;
	}

	public void run() {
		for(int volte=1; volte<=5; ++volte)
		{
			System.out.println(this.getName() 
					+ " " + volte + " Rosso - Verde");
			try {
				Thread.sleep(6*tempo);
			} catch (InterruptedException e) {}
			System.out.println(this.getName() 
					+ " " + volte + " Rosso - Arancio");
			try {
				Thread.sleep(tempo);
			} catch (InterruptedException e) {}
			System.out.println(this.getName() 
					+ " " + volte + " Verde - Rosso");
			try {
				Thread.sleep(6*tempo);
			} catch (InterruptedException e) {}
			System.out.println(this.getName() 
					+ " " + volte + " Arancio - Rosso");
			try {
				Thread.sleep(tempo);
			} catch (InterruptedException e) {}
		} // end for 1 .. 5 volte
	}
}