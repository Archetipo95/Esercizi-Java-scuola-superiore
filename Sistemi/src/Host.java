/**
 * @author Masevski , Fipponi
 * @version 25/01/14
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.*;

public class Host extends Thread implements ActionListener {
	private String ip, sub, ricevuto;
	private Timer timer;
	private Server server;
	private boolean inInvio;

	public Host(String ip, String sub, Server server, boolean inInvio) {
		super();
		this.server = server;
		this.ip = ip;
		this.sub = sub;
		this.inInvio = inInvio;
		ricevuto = null;
		timer = new Timer((int) Math.random() * 1000, server);
		timer.addActionListener(this);
		timer.addActionListener(server);
	}

	public void run() {
		while (true) {
			timer.start();
		}
	}

	public boolean isInInvio() {
		return inInvio;
	}

	public String invia() {
		return ("" + (Math.random() * 1000));
	}

	public String getIp() {
		return ip;
	}

	public String getSub() {
		return sub;
	}

	public String getRicevuto() {
		return ricevuto;
	}

	public String toString() {
		return "Oggetto [ip=" + ip + ", sub=" + sub + "]";
	}

	public void ricevi(String messaggio) {
		ricevuto = messaggio;
	}

	public void actionPerformed(ActionEvent arg0) {
		inInvio = !inInvio;
		timer.setDelay((int) Math.random() * 1000);
	}

	public Timer getTimer() {
		return timer;
	}

	public Host() {
		super();
	}
}