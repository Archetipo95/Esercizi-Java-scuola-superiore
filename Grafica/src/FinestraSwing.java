import javax.swing.*;
import java.awt.*;
public class FinestraSwing {
	public static void main (String[] args){
		JFrame win = new JFrame();
//		win.setSize(550, 450);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//prende il pannello contenitore del frame
		Container c= win.getContentPane();
		//aggiugi una etichetta
		c.add(new JLabel("Ciao mondo!"));
		//aggiungi un bottone
		c.add(new JButton("Non premere"));
		win.pack();//ridimensiona finestra sul contenuto
		win.setVisible(true);
		
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
		}
		for(int i =0; i<300; i++){
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
			win.setSize(550+i, 450+i);
		}
	}
}