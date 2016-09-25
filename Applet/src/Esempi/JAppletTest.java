package Esempi;

import java.awt.Container;

import java.awt.FlowLayout;

import javax.swing.*;

public class JAppletTest extends JApplet {

	
	private static final long serialVersionUID = 1L;

	public void destroy() {
		super.destroy();
		System.out.println("destroy");
	}

	public void init() {
		super.init();
		System.out.println("init");
		
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		String nome = this.getParameter("nome");
		String cognome = this.getParameter("cognome");
		
		if(nome==null)
			nome = "Nessun nome definito";
		if(cognome==null)
			cognome = "Nessun cognome definito";
		c.add(new JLabel(nome));
		c.add(new JLabel(cognome));
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