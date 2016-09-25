package TimerTask;
import java.util.Timer;
public class Eseguibile 
{
	private MyTimer t;
	private Timer timer;
	public Eseguibile() 
	{
		t=new MyTimer();
		timer=new Timer();
		timer.schedule(t, 1000, 1000);
		System.out.println("Timer partito");
	}
	public static void main(String args[])
	{
		new Eseguibile();		
	}
}