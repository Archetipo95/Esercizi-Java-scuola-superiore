

import java.awt.*;

import javax.swing.*;

/**
 * Pannello per dimostrare l'uso della scalatura xy 
 * in paintComponent();
 * 
 * @author Mion- Santi
 * @version 1 feb 2014
 *
 */
public class ZoomPanel extends JPanel {
	double scale=1.0;


	public ZoomPanel() {
		super();
		setPreferredSize(new Dimension(400,400));
	}


	@Override
	protected void paintComponent(Graphics arg0) {
		super.paintComponent(arg0);
		Graphics2D g2 = (Graphics2D)arg0;
		g2.scale(scale, scale);
		g2.drawLine(0, 0, 10,10);
		String str = "" + scale;
		g2.drawString(str, 10, 30);
	}
	public double getScale() {
		return scale;
	}
	public void setScale(double scale) {
		if(scale>=1){
			this.scale = scale;
			repaint();
		}
	}


}
