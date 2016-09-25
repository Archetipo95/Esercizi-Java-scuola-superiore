/**
 * 
 * @author a4 Fipponi Masevski
 *
 */
public class Programma_eseguibile {
	public static void main(String args[]){
		
		Buffer_circolare b = new Buffer_circolare(10);
		Unione_produttore_consumatore t1 = new Unione_produttore_consumatore(b);
		Unione_produttore_consumatore t2 = new Unione_produttore_consumatore(b);
		Unione_produttore_consumatore t3 = new Unione_produttore_consumatore(b);
		Unione_produttore_consumatore t4 = new Unione_produttore_consumatore(b);
		Unione_produttore_consumatore t5 = new Unione_produttore_consumatore(b);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
