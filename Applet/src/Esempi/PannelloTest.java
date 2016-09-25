package Esempi;

import java.awt.*;
import javax.swing.*;

public class PannelloTest extends JApplet {

	private static final long serialVersionUID = 1L;


	public void destroy() {
		super.destroy();
		System.out.println("destroy");
	}

	public void init() {
		super.init();
		System.out.println("init");
		
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(1,1));
		
		c.add(new Pannello());
	}

	public void start() {
		super.start();
		System.out.println("start");
	}

	public void stop() {
		super.stop();
		System.out.println("stop");
	}
}