import java.util.Scanner;

class Rettangolo_main
{
	public static void main(String[] args) 
	{
	  Scanner input= new Scanner(System.in);
	  
	  double base,altezza;
	  System.out.print("Inserisci la base del rettangolo: ");
	  base=input.nextDouble();
	  System.out.print("Inserisci l'altezza del rettangolo: ");
	  altezza=input.nextDouble();
	  
	  Rettangolo ret=new Rettangolo(); 
	  ret.altezza=altezza;
	  ret.base=base;
	  
	  System.out.println("L'area del rettangolo è: "+ret.area());
	  System.out.println("Il perimetro è: "+ret.perimetro());

	}

}
