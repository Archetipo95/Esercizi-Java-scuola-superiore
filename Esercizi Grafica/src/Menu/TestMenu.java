package Menu;
import java.awt.*;

import javax.swing.*;
import java.awt.event.*;

public class TestMenu extends JFrame {
	// per Serializable
	private static final long serialVersionUID = 1L;
	private Container contentPane;
	JTextArea textArea;

	public static void main(String[] args) {
			TestMenu test = new TestMenu();
	}

	/**
	 * Create the frame.
	 */
	public TestMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 250, 200);
		contentPane = this.getContentPane();
		textArea = new JTextArea();
		// pannello di scorrimento con barre laterali
		JScrollPane scroll = new JScrollPane(textArea);
		contentPane.add(scroll);
		creaMenu();
		setVisible(true);
	}
	private void creaMenu()
	{
		JMenuBar menuBar = new JMenuBar(); // crea barra menu
		setJMenuBar(menuBar); // attacca barra manu alla JFrame

		JMenu mnFile = new JMenu("File"); // crea  menu file
		menuBar.add(mnFile); // aggiunge alla barra menu

		// crea Item menu file->Apri
		JMenuItem mntmApri = new JMenuItem("Apri");
		mnFile.add(mntmApri); // aggiunge al menu File
		mntmApri.addActionListener(new ActionListener() { // aggiunge listener
			public void actionPerformed(ActionEvent arg0) {
				doFileOpen();
			}
		});

		// crea Item menu file->Salva
		JMenuItem mntmSalva = new JMenuItem("Salva");
		mnFile.add(mntmSalva); // aggiunge al menu File
		mntmSalva.addActionListener(new ActionListener() { // aggiunge listener
			public void actionPerformed(ActionEvent arg0) {
				doFileSave();
			}
		});

		// aggiunge separatore
		JSeparator separator1 = new JSeparator();
		mnFile.add(separator1);

		// crea Item menu file->Esci
		JMenu mnProva = new JMenu("Prova");
		mnFile.add(mnProva);
		JMenuItem mntmProva1 = new JMenuItem("Prova1");
		mnProva.add(mntmProva1);
		JMenuItem mntmProva2 = new JMenuItem("Prova2");
		mnProva.add(mntmProva2);

		// aggiunge separatore
		JSeparator separator = new JSeparator();
		mnFile.add(separator);

		// crea Item menu file->Esci
		JMenuItem mntmExit = new JMenuItem("Esci");
		mnFile.add(mntmExit);
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				doFileExit();
			}
		});


		JMenu mnHelp = new JMenu("Help"); // crea  menu help
		menuBar.add(mnHelp);
		// crea Item menu help->Informazioni
		JMenuItem mntmInformazioni = new JMenuItem("Informazioni");
		mntmInformazioni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Informazioni su ... bla bla bla ecc...");
			}
		});
		mnHelp.add(mntmInformazioni);
	}

	protected void doFileOpen()
	{
		JOptionPane.showMessageDialog(this, "File Apri da implementare");
	}
	protected void doFileSave()
	{
		JOptionPane.showMessageDialog(this, "File Salva da implementare");
	}
	protected void doFileExit()
	{
		JOptionPane.showMessageDialog(this, "Ciao");
		System.exit(0);
	}
}