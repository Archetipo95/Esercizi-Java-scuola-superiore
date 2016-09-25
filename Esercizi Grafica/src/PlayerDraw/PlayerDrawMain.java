package PlayerDraw;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PlayerDrawMain extends PlayerDraw  implements ActionListener {
	JFrame win;								//frame
	String titolo = "PlayerDraw";			//titolo frame
	PlayerDraw pd = new PlayerDraw();		//oggetto player
	JToolBar toolBar = new JToolBar();
	
	
	PlayerDrawMain(){
		win = new JFrame(titolo);
		win.getContentPane().add(toolBar, BorderLayout.SOUTH);
		toolBar.setFloatable(false);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setResizable(false);
		win.setSize(500, 500);
		win.setLocationRelativeTo(null);
		win.setVisible(true);
		bottone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clear();
				play();
			}
		});
		
		bottone2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clear();
			}
		});
		bottone3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				punti.clear();
				clear();
			}
		});
		
		toolBar.add(bottone);
		toolBar.add(bottone2);
		toolBar.add(bottone3);
		Container c = win.getContentPane();
		c.add(new PlayerDraw());
	}
	
	public static void main(String[] args)  {
		new PlayerDrawMain();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

	}
}