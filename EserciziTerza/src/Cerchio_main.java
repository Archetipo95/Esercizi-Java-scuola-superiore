import java.util.*;

/**
 * Utilizzo di un oggetto con metodi e attributi
 * @author 3Ia
 * @version 6/02/2013
 */
class Cerchio_main 
{
	public static void main(String[] args) 
	{
	  Scanner input= new Scanner(System.in);
	  
	  double r;
	  System.out.print("Inserisci il raggio del cerchio: ");
	  r=input.nextDouble();
	  
	  //costruisco l'oggetto cerchio
	  Cerchio c1=new Cerchio(); //c1 è una variabile di tipo cerchio (sarebbe l'oggetto)
	 
	  c1.raggio=r;
	  
	  System.out.println("L'area del cerchio è: "+c1.area());
	  System.out.println("La circonferenza è: "+c1.circonferenza());

	}

}
