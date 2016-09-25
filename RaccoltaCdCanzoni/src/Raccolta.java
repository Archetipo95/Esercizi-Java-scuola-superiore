/**
 * @author Fipponi, Masevski 4ai
 * @version 17/09/2013
 */
public class Raccolta {

	private CD raccolta[];
	int n;

	public Raccolta() {
		raccolta=new CD[10];
		n=0;
	}

	public void Inserimento(){
		if(n<10){
			CD c= new CD();
			c.InserisciCD();
			raccolta[n]=c;
			n++;
		}
		else
			System.out.println("Errore");
	}

	public void Visualizza(){
		for(int i=0;i<10;i++){
			System.out.println(raccolta[i]);
		}
	}

}