/**
 * 
 * @author a4 Fipponi Masevski
 *
 */
public class Buffer_circolare {
	
	static volatile int[] buffer;
	static volatile int testa = 0;
	static volatile int coda = 0;
	static volatile int dimbuffer;
	static volatile int occupate = 0;
	
	public Buffer_circolare(int dimbuffer){
		buffer = new int [dimbuffer];
		this.dimbuffer = dimbuffer;
	}
}
