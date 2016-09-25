/**
 * 
 * @author a4 Fipponi Masevski
 *
 */
public class Produttore_buffer_circolare {

	Buffer_circolare b;

	Produttore_buffer_circolare(Buffer_circolare b){
		this.b = b;
	}
	public synchronized void produttore(int dato){
		while(b.occupate==(b.dimbuffer-1)){
			try{
				wait();
			}
			catch(InterruptedException e){
				;
			}
		}
		b.buffer[b.coda] = dato;
		try{
			Thread.sleep(500);
		}
		catch(InterruptedException e){
			;
		}
		b.coda = (b.coda + 1)% b.dimbuffer;
		b.occupate = Math.abs(b.coda - b.testa);
		notifyAll();

	}
}
