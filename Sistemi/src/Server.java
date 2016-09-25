/**
 * @author Masevski , Fipponi
 * @version 25/01/14
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Server implements ActionListener{
	private Vector<Host> elenco;
	private Stack<Host> stackAttesa = new Stack<Host>();
	private ReentrantLock lock = new ReentrantLock();
	private Condition condizione = lock.newCondition();

	public Server() {
		elenco = new Vector<Host>();
	}

	public Server(Vector<Host> elenco) {
		this.elenco = elenco;
		for(int i = 0; i<elenco.size(); i++){
			elenco.elementAt(i).start();
		}
	}

	public void aggiungi(Host oggetto) {
		elenco.add(oggetto);
		for(int i = 0; i< elenco.size(); i++){
			if(elenco.elementAt(i).equals(oggetto))
				elenco.elementAt(i).start();
		}
		
	}

	public String getIPelemento(int indice) {
		return elenco.elementAt(indice).getIp();
	}

	public Vector<Host> getElenco() {
		return elenco;
	}

	public String toString() {
		return "Server [elenco=" + elenco + "]";
	}

	public synchronized void switcher(Host h) throws InterruptedException{
		try{
			lock.lock();
		
		if(h.isInInvio() == true){
			stackAttesa.push(h);
		}
		else{
			if(!(stackAttesa.isEmpty())){
				String messaggio = h.invia();
				Host ricevi = stackAttesa.pop();
				ricevi.ricevi(messaggio);
			}
			else{
				condizione.await();
			}
		}
		} finally {
			lock.unlock();
		}

	}

	public void actionPerformed(ActionEvent e) {
		Host host = new Host();
		for(int i = 0; i< elenco.size(); i++){
			if(e.getSource()==elenco.elementAt(i).getTimer()){
				host = elenco.elementAt(i);
			}
		}
		try {
			switcher(host);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}
}