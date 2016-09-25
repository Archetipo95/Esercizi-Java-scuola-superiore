import java.applet.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;

public class CiaoApplet extends Applet  {
	private int x,y;
	ImageIcon img = new ImageIcon("Immagine.png");
	
	public void init(){
		addMouseListener(new CiaoApplet.AscoltatoreMouse());
	}
	
	public void update(Graphics g){
		paint(g);
	}
	
	public void paint(Graphics g){
		//g.drawImage(img.getImage(),x,y,null);
		g.drawString("LOL", x, y);
	}
	
	class AscoltatoreMouse extends MouseAdapter{
		public void mousePressed(MouseEvent e){
			x= e.getX();
			y= e.getY();
			repaint();
		}
		

	}
	
}	
