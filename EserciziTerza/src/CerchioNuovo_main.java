/**
 * Dimostrazione dell'uso dei vettori di oggetti.
 * @author 3Ia
 * @version 27/02/2013
 */
public class CerchioNuovo_main {

	public static void main(String[] args) {
	// dichiariamo un vettore di 10 CerchioNuovo
		CerchioNuovo cer[]= new CerchioNuovo[10];
	
	// Il vettore è vuoto!	
	// Per inserire gli oggetti si devono creare uno alla volta e inserire nelle posizioni
	// Esempio: 
	cer[0]=new CerchioNuovo(); // cerchio di raggio 1
	cer[0].setRaggio(5); // modifichiamo raggio a 5
	
	cer[1]=new CerchioNuovo(); // cerchio di raggio 1
	
	cer[2]=new CerchioNuovo(7); //cerchio di raggio 7
	
	// sette cerchi casuali
	for(int i=3; i<cer.length; ++i)
		{
			cer[i]= new CerchioNuovo(10*Math.random());
		}
	// stampa tutto
		for(int i=0; i<cer.length; ++i)
			{
				System.out.println("Cerchio "+i);
				System.out.println("raggio= "+cer[i].getRaggio());
				System.out.println("circonf= "+cer[i].circonferenza());
				System.out.println("area= "+cer[i].area());
			}
	}

}
