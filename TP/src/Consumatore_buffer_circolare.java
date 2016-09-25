/**
 * 
 * @author a4 Fipponi Masevski
 *
 */
public class Consumatore_buffer_circolare
{

	Buffer_circolare b;
	int dato;

	Consumatore_buffer_circolare(Buffer_circolare b)
	{
		this.b = b;
	}

	public synchronized int consumatore()
	{
		while(b.occupate==0)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				;
			}	
		}
		dato = b.buffer[b.testa];
		b.testa = (b.testa+1)%b.dimbuffer;
		b.occupate = Math.abs(b.coda-b.testa);
		notifyAll();
		return dato;
	}
}
