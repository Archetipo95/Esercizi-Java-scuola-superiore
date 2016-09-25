import java.util.*;
public class VestitoMain {
	public static void main(String[] args) {
		
		Scanner t= new Scanner (System.in);
		
		Vestito vesti1=new Vestito();
		vesti1= new Vestito("Benetton","Primavera Uomo","M",40,25.0);
		Vestito vesti2= new Vestito("Nike","Sport1","L",25,46.0);
		vesti2.Sconto(5.0);
		vesti1.Vende(10);
		
		Vestito vest[]= new Vestito[300];
		for(int i=0;i<300;i++){
			vest[i].Inserisci();
		}
		
		for(int i=0;i<300;i++){
			if(vest[i].getPrezzo()>100.0)
				System.out.println(vest[i]);
		}
		
		for(int i=0;i<300;i++){
			if(vest[i].sottoScorta(10)==true)
				System.out.println(vest[i]);
		}
		
		for(int i=0;i<300;i++){
			vest[i].Sconto(30.0);
		}	
	}
}