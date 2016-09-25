import java.util.Scanner;


public class Es_stringa1 
{public static void main (String[] args) 
{   Scanner tastiera=new Scanner (System.in);
	int n,resto;
	System.out.println("Inserisci numero: ");
	n= tastiera.nextInt();
	String parola="";
	while (n!=0)
	{ resto=n%2;
	n=n/2;
	parola=parola+resto;
	}
int lunghezza= parola.length();
for(int i=lunghezza-1; i>=0; i= i-1)
	System.out.print(parola.charAt(i));
}
}








