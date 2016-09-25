/**
 * 
 * @author Fipponi Masevski 4ai
 * @version 18/09/2013
 *
 */

import java.util.Vector;
public class Raccolta {	
	Vector<CD> v;
	int cont=0;

	public Raccolta(){
		v=new Vector<CD>();
	}

	public Raccolta (int n){
		v=new Vector<CD>(n);
	}

	public void VisualizzaR() {
		for(int i=0; i<v.size();i++){
			v.get(i).VisualizzaCD();
			
		}
	}
	public void InserisciR(){
		CD a= new CD();
		a.InserisciCD();
		v.add(a);
	}
}