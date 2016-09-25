/**
 * masevski-fipponi 3/11/13
 */
import java.util.*;
public class Biblioteca {
	Vector <Libro> l;

	public Biblioteca(){
		l= new Vector <Libro>();
	}

	public Biblioteca(int n){
		l= new Vector <Libro>(n);
	}

	public void Inserisci(){
		Libro li= new Libro();
		li.Inserisci();
		l.add(li);
	}

	public void Visualizza(){
		for(int i=0; i<l.size(); i++){
			l.elementAt(i).Visualizza();
		}
	}

	public void Aggiorna(String cod, double p){
		for(int i=0; i<l.size(); i++){
			if(l.elementAt(i).getCodice().equalsIgnoreCase(cod)){
				l.elementAt(i).setPrezzo(p);
			}
		}	
	}

	public void Elimina(String cod){
		for(int i=0; i<l.size(); i++){
			if(l.elementAt(i).getCodice().equalsIgnoreCase(cod)){
				l.remove(i);
			}
		}	
	}

	public void VediAutore(String aut){
		for(int i=0; i<l.size(); i++){
			if(l.elementAt(i).getAutore().equalsIgnoreCase(aut)){
				l.elementAt(i).Visualizza();
			}
		}	
	}

	public void Minoredi(String c, String t, String a, Double p1, Double p2){
		if(p1 <= p2)
		{				
			Libro li= new Libro(c, t, a, p1);
			l.add(li);
		}
	}

	public void Inserisci2(String c, String t, String a, Double p1){
		Libro li = new Libro(c, t, a, p1);
		l.add(li);
	}

	public void Ordinamento(){
		int k=0;					//Tutti i numeri a sinistra di k sono ordinati a destra no 
		int n=l.size();				//n è la lunghezza del vector
		while (k!=n-1){				//fino a quando ci sono oggetti in vector
			int j= getSmallest(k);	//j è l'oggetto più piccolo che esiste nel vector
			exchange(k, j);			//fa lo scambio
			k++;					//passa al prossimo oggetto
		}
	}

	public int getSmallest(int k) {                                       
		if (l==null || l.size()==k)
			return -1;														//se non esistono ogeeti più piccoli ritorna -1
		int i;																
		int small = k;
		i = k+1;															//i è l'oggetto che sta dopo K
		while (i != l.size()) {												//fino a che ci sono oggetti
			String current = (String) l.elementAt(i).getTitolo();			
			String smallest = (String) l.elementAt(small).getTitolo();		//compara stringa di i e k(small)
			if (current.compareTo(smallest)<0)								
				small = i;													//salva il più piccolo in small
			i++;															//passa al prossimo oggetto
		}
		return small;														//mi restituisce l'oggetto più piccolo che ha memorizzato
	}

	public void exchange(int k, int j) {									//esegue uno scambio 
		Libro obk = l.elementAt(k);											//salva k su obk
		l.setElementAt(l.elementAt(j),k);									//scrive al posto di k l'oggetto più piccolo (j)
		l.setElementAt(obk,j);												//su j ci mette obk (vecchio k)
	}

	public String toString(){
		String s = "";
		for(int i=0;i<l.size();i++){
			s= s + l.elementAt(i).getCodice() + "#" + l.elementAt(i).getTitolo() + "#" + l.elementAt(i).getAutore() + "#" + l.elementAt(i).getPrezzo() + "\n";
		}
		return s;
	}
}