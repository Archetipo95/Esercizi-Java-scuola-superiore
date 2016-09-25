
import java.awt.*;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


/**
 * Test per dimostrare l'uso della scalatura x, y e rotazione alpha in pannello;
 * 
 * @author Mion- Santi
 * @version 1 feb 2014
 *
 */
public class ZoomRotatePanelTest  implements ChangeListener {
	ZoomRotatePanel q;
	JSlider sX;
	JSlider sY;
	JSlider sA;
	public ZoomRotatePanelTest()
	{
		JFrame f = new JFrame();
		JPanel p = (JPanel)f.getContentPane();
		p.setLayout(new BorderLayout());
		q = new ZoomRotatePanel();
		q.setBackground(Color.white);
		p.add(q, BorderLayout.CENTER);
		
		JPanel pp = new JPanel(); 
		pp.setLayout(new GridLayout(3,1));
		
		sX = new JSlider(SwingConstants.HORIZONTAL, 0, 20, 1);
		sX.addChangeListener(this);
		sX.setPaintTicks(true);
		sX.setMinorTickSpacing(1);
		sX.setMajorTickSpacing(10);
		sX.setPaintLabels(true);
		pp.add(sX);
		
		sY = new JSlider(SwingConstants.HORIZONTAL, 0, 20, 1);
		sY.addChangeListener(this);
		sY.setPaintTicks(true);
		sY.setMinorTickSpacing(1);
		sY.setMajorTickSpacing(10);
		sY.setPaintLabels(true);
		pp.add(sY);

		sA = new JSlider(SwingConstants.HORIZONTAL, -90, 90, 0);
		sA.addChangeListener(this);
		sA.setPaintTicks(true);
		sA.setMinorTickSpacing(5);
		sA.setMajorTickSpacing(10);
		sA.setPaintLabels(true);
		pp.add(sA);

		p.add(pp, BorderLayout.SOUTH);
		
		f.setSize(1200, 600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new ZoomRotatePanelTest();
	}

	@Override
	public void stateChanged(ChangeEvent sli) {
		if(sli.getSource()==sX)
			q.setScaleX(sX.getValue());
		else if(sli.getSource()==sY)
			q.setScaleY(sY.getValue());
		if(sli.getSource()==sA)
			q.setAlpha(sA.getValue());
		
	}

}
