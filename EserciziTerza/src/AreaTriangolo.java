import java.util.*;
public class AreaTriangolo {

	public static void main(String[] args) {
		Scanner tastiera=new Scanner (System.in);
		double area, base, altezza;
		System.out.println("Inserisci l'altezza");
		altezza= tastiera.nextInt();
		System.out.println("Inserisci la base");
		base= tastiera.nextInt();
		area= Utile.areatriangolo(base,  altezza);
		System.out.println("L'area è: "+area);

	}

}
