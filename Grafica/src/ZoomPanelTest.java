
import java.awt.*;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


/**
 * Test per dimostrare l'uso della scalatura xy in pannello;
 * 
 * @author Mion- Santi
 * @version 1 feb 2014
 *
 */
public class ZoomPanelTest  implements ChangeListener {
	ZoomPanel q;
	JSlider s;
	public ZoomPanelTest()
	{
		JFrame f = new JFrame();
		JPanel p = (JPanel)f.getContentPane();
		p.setLayout(new BorderLayout());
		q = new ZoomPanel();
		q.setBackground(Color.white);
		p.add(q, BorderLayout.CENTER);
		
		s = new JSlider(SwingConstants.HORIZONTAL, 1, 20, 1);
		p.add(s, BorderLayout.SOUTH);
		s.addChangeListener(this);
		
		f.setSize(1200, 600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new ZoomPanelTest();
	}

	@Override
	public void stateChanged(ChangeEvent arg0) {
		q.setScale(s.getValue());
		
	}

}
