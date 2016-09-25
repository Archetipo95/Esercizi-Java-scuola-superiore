
public class ContoCorrente {

	private String titolare, numero;
	private double saldo;
	
	public ContoCorrente (String tit,String num,double sald) {

		titolare=tit;
		numero=num;
		saldo=sald;

	}

	public void Prelievo (double prelievo){
		if(prelievo<saldo){
			if(prelievo>=0){
			saldo=saldo-prelievo;
			}
		}
		else{
			System.out.println("Non puoi prelevare!");
		}
	}
	
 	public void Versamento (double versamento){
 		if(versamento>=0){
 		saldo=saldo+versamento;
 		}
 	}
	
	public void VerificaSaldo(){
		System.out.println("Il titolare del conto è: "+titolare);
		System.out.println("Il numero del conto è: "+numero);
		System.out.println("Il saldo del conto è: "+saldo);
	}
	public String toString()
	{
		String s;
		s= "Il titolare del conto è: "+ titolare+
		" Il numero del conto è: "+numero +
		" Il saldo del conto è: "+saldo;
		return s;
	}
}
