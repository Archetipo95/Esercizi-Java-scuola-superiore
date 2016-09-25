/*
Classe 3AI
17 ottobre 2012
Fipponi, Masevski
*/

import java.util.*;
public class Gaus3 {

	
	public static void main(String[] args) {
	Scanner tastiera=new Scanner (System.in);
	int n,i;
	double risultato1,risultato2;
	i=0;
	risultato1=0;
	do {
		System.out.println("Inserisci il numero: ");
	n=tastiera.nextInt();
	} while (n<0);
	
	while (i<n){
		i=i+1;
		risultato1=risultato1+i;
	}
	risultato2=(n+1)*n/2;
	if (risultato1==risultato2)
	{System.out.println("Verificato per n: "+n);
	}
	else {System.out.println("Non verificato per n:"+n);
	}
	}
}