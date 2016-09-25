/**
 * 
 * @author a4 Fipponi Masevski
 *
 */
public class Unione_produttore_consumatore extends Thread {

		Buffer_circolare bc;
		static String nome;
		static int dato, dato1, fine=15;
		Produttore_buffer_circolare pbc= new Produttore_buffer_circolare(bc);
		Consumatore_buffer_circolare cbc= new Consumatore_buffer_circolare(bc);
		
		Unione_produttore_consumatore(Buffer_circolare bc){
			this.bc = bc;
		}
		
		public void run(){
			do{
				dato = (int)(Math.random()*100);
				pbc.produttore(dato);
				System.out.println("Il "+Thread.currentThread()+" ha prodotto "+dato);
				dato1=cbc.consumatore();
				System.out.println(dato1);
			}
			while(dato!=fine);
		}
}
