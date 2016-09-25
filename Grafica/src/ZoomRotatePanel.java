
import java.awt.*;

import javax.swing.*;


/**
 * Pannello per dimostrare l'uso della scalatura x, y e rotazione alpha in paintComponent();
 * 
 * @author Mion- Santi
 * @version 1 feb 2014
 *
 */
public class ZoomRotatePanel extends JPanel {
	double scaleX=1.0;
	double scaleY=1.0;
	double alpha=0;


	public ZoomRotatePanel() {
		super();
		setPreferredSize(new Dimension(400,400));
	}


	@Override
	protected void paintComponent(Graphics arg0) {
		super.paintComponent(arg0);
		Graphics2D g2 = (Graphics2D)arg0;
		g2.scale(scaleX, scaleY);
//		g2.rotate(Math.toRadians(alpha));
		g2.rotate(Math.toRadians(alpha), 10, 10);
		g2.drawLine(0, 0, 10,10);
		String str = "sx=" + scaleX + " sy=" + scaleY + " a=" + alpha;
		g2.drawString(str, 10, 30);
	}


	public double getScaleX() {
		return scaleX;
	}


	public void setScaleX(double scale) {
		if(scale>=1)
		{
			this.scaleX = scale;
			repaint();
		}
	}
	public double getScaleY() {
		return scaleX;
	}


	public void setScaleY(double scale) {
		if(scale>=1)
		{
			this.scaleY = scale;
			repaint();
		}
	}

	public void setScaleXY(double sx, double sy) {
		if(sx>=1)
		{
			this.scaleX = sx;
		}
		if(sy>=1)
		{
			this.scaleY = sy;
		}
		if(sx>=1 || sy>=1)
		{
			repaint();
		}
	}


	public double getAlpha() {
		return alpha;
	}


	public void setAlpha(double alpha) {
		this.alpha = alpha;
		repaint();
	}
	
	

}
