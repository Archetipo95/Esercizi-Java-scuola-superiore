package Esempi;

import java.awt.*;
import javax.swing.JPanel;

public class Stringhe extends JPanel {

	// vogliamo che il pannello scriva
	// le stringhe passate nel costruttore
	// ridefinisco paintComponent della classe JComponent

	private static final long serialVersionUID = 1L;
	private String cognome;
	private String nome;


	public Stringhe(String cognome, String nome) {
		this.cognome = cognome;
		this.nome = nome;
		setPreferredSize(new Dimension(200,200));
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString(cognome, 0, 20);
		g.drawString(nome, 0, 40);
	}
}