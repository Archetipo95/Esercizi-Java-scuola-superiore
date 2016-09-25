import javax.swing.*;
import java.awt.*;
public class FinestraSwingText8 {

	public static void main(String[] args) {
		JFrame win= new JFrame();
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= win.getContentPane();
		c.setLayout(new GridLayout(4,2));
		c.setLayout(new FlowLayout());
		for(int i=1; i<=8; i++)
			c.add(new JTextField("Testo n." + i + " "));
		win.pack();
		win.setVisible(true);

	}

}
