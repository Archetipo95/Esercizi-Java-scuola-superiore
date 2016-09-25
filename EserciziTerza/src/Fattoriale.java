import java.util.*;
public class Fattoriale {

	
	public static void main(String[] args) 
	{
		Scanner tastiera= new Scanner (System.in);
	    System.out.println("Inserisci n");
	   double fattoriale; 
	   int n=tastiera.nextInt();
	   fattoriale=Utile.fattoriale (n);
	   System.out.println(fattoriale); 
	}

}
