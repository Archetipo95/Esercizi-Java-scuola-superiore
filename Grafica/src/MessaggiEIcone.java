
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Questo esempio dimostra come utilizzare le icone
 * nei bottoni e nelle label, come visualizzare 
 * finestre di messaggio e di opzione.
 * 
 * @author Mion & Santi - 4ai - 2013/2014
 *
 */
public class MessaggiEIcone implements ActionListener {
	JFrame win;
	JButton btnAuguri, btnAlbero, btnStella;
	ImageIcon iconAlbero, iconStella, iconAlberoDecorato;
	public MessaggiEIcone() {
		win = new JFrame();
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = win.getContentPane();
		c.setLayout(new GridLayout(2,2));
		
		btnAuguri = new JButton("Auguri");
		btnAuguri.setMnemonic('a');
		btnAuguri.addActionListener(this);
		c.add(btnAuguri);
		
		iconAlbero = new ImageIcon("imgs/albero.png");
		iconAlberoDecorato 
			= new ImageIcon("imgs/albero_decorato.png");
		btnAlbero = new JButton(iconAlbero);
		btnAlbero.addActionListener(this);
		c.add(btnAlbero);
		
		iconStella = new ImageIcon("imgs/stella.png");
		btnStella = new JButton("Stella", iconStella);
		btnStella.setMnemonic('s');
		btnStella.addActionListener(this);
		c.add(btnStella);
		
		JLabel lab1 = new JLabel("berretto di Babbo Natale");
		lab1.setIcon(new ImageIcon("imgs/berretto.png"));
		c.add(lab1);
		
		win.pack();
		win.setVisible(true);
		// vedere la directory corrente
		java.io.File f = new java.io.File(".");
		System.out.println(f.getAbsolutePath());
	}


	@Override
	public void actionPerformed(ActionEvent evt) {
		//System.out.println(evt.getActionCommand());
		if(evt.getSource()==btnAuguri)
		{
			JOptionPane.showMessageDialog(win, 
			"tanti auguri di Buon Natale e Buon anno nuovo",
			"Fra poco arrivano le Feste!",
			JOptionPane.PLAIN_MESSAGE);
		}
		if(evt.getSource()==btnAlbero)
		{
			int scelta 
			= JOptionPane.showOptionDialog(win, 
			"vuoi decorare l'albero?", 
			"Abete di Natale", 
			JOptionPane.YES_NO_OPTION, 
			JOptionPane.QUESTION_MESSAGE, 
			new ImageIcon("imgs/stella.png"), 
			null, null);
			if(scelta == 0)
			{
				btnAlbero.setIcon(this.iconAlberoDecorato);
			}
			else
			{
				btnAlbero.setIcon(this.iconAlbero);
			}
		}
		if(evt.getSource()==btnStella)
		{
			JOptionPane.showMessageDialog(win, 
					"La stella cometa guida i Re Magi",
					"La stella di natale",
					JOptionPane.OK_OPTION, 
					new ImageIcon("imgs/stella.png"));
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new MessaggiEIcone();
	}
	
}
