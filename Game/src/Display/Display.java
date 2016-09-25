package Display;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Display extends Canvas implements Runnable{

	public boolean Running = false;
	private Thread thread;
	
	public static void main(String[] args){
		Display display = new Display();
		
		JFrame frame = new JFrame();
		frame.add(display);
		frame.pack();
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		display.start();
		
	}
	
	public Display(){
		Dimension size = new Dimension(800, 600);
		setPreferredSize(size);
		setMaximumSize(size);
		setMinimumSize(size);
	}
	
	private void start(){
		if(Running)
			return;
		Running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public void run() {
		while(Running){
			try{
				Thread.sleep(16);
			}catch(Exception e){}
		}
	}

}
