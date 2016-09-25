import java.util.*;
public class Trapezio_main 
{
	public static void main(String[] args) 
	{
		Scanner tast= new Scanner(System.in);
		double B,b,a;
		System.out.println("Base maggiore: ");
		B= tast.nextDouble();
		System.out.println("Base minore: ");
		b=tast.nextDouble();
		System.out.println("Altezza: ");
		a= tast.nextDouble();
		Trapezio t=new Trapezio (B,b,a);
		System.out.println("L'area è: "+t.get_area());
	}

}
