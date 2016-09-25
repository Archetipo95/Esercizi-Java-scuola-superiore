package TimerTask;
import java.util.TimerTask;
public class MyTimer extends TimerTask
{
	private static int conta;
	public void run() 
	{
		conta++;
		if(conta==5)
		{
			this.cancel();
		}
		System.out.println("Messaggio numero "+conta);
		return;
	}
}