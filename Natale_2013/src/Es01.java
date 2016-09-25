/**
 * 
 * @author Martin Masevski 4ai
 * 
 * Creare una finestra con titolo e dimensioni inserite dall'imput.
 *
 */

import javax.swing.*;
import java.util.*;

public class Es01 {
	String titolo;
	int x,y;
	Scanner t= new Scanner (System.in);

	public Es01(){

		System.out.print("Inserire il titolo della finestra: ");
		titolo= t.nextLine();
		JFrame finestra = new JFrame(titolo);

		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		System.out.print("Inserire altezza finestra: ");
		y= t.nextInt();
		System.out.print("Inserire lunghezza finestra: ");
		x= t.nextInt();
		finestra.setSize(x, y);

		finestra.setVisible(true);

	}

	public static void main(String[] args) {
		new Es01();
	}
}
