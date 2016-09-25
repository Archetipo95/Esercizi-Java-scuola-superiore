/*
 Si produca un oggetto CartaDaGioco per simulare una serie da 40 carte.
Si ricorda che ogni carta è rappresentata da un valore numerico da 1 a 10 e un seme denari, coppe, bastoni, spade (oppure cuori, quadri, fiori, picche).
Si fornisca l'oggetto di opportuni set/get con controllo dei valori e dei semi possibili.

Si produca un programma main, in un'altra classe, che: 
1 - crei un vettore di quaranta carte e assegni correttamente gli oggetti;
(ci devono essere tutte la carte non duplicate)
visualizzi le carte in ordine;

2 - mescoli le carte usando opportunamente Math.random();

3 - crei altri due vettori e distribuisca casualmente le carte tra questi (numero da scegliere arbitrariamente...);

4 - visualizzi e calcoli la somma dei valori di tutte le carte.
 */
public class Carte {
	private String seme;
	private int numero;
	public Carte()
	{}
	public Carte(int n,String s){
		setNumero(n);
		setSeme(s);
	}
	
	public String getSeme() {
		return seme;
	}
	public void setSeme(String seme) {
		if(seme=="cuori" || seme=="quadri" || seme=="picche" || seme=="fiori")
			this.seme = seme;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		if(numero>=1 && numero<=10)
			this.numero = numero;
	}
	public String toString()
	{
	String s;
	s= this.getNumero()+" di "+this.seme;
	return s;
}

}
