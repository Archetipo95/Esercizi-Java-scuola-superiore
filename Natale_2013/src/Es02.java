/**
 * 
 * @author Martin Masevski 4ai
 * 
 * Creare un certo numero(inserito da input) di finestre con dimensioni casuali
 *
 */

import javax.swing.*;
import java.util.*;

public class Es02 {
	String titolo;
	int nfinestre,x,y;
	Scanner t= new Scanner (System.in);

	public Es02(){

		System.out.print("Inserire numero finestre da creare: ");
		nfinestre= t.nextInt();
		for(int i=0; i<nfinestre; i++){
			titolo= "Finestra numero "+ i;
			JFrame finestra = new JFrame(titolo);

			finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			
			y= (int) Math.floor((Math.random()*450+1));
			x= (int) Math.floor((Math.random()*450+1));
			finestra.setSize(x, y);

			finestra.setVisible(true);
		}
	}

	public static void main(String[] args) {
		new Es02();
	}
}
