package PlayerDraw;

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class PlayerDraw extends JPanel
implements MouseListener, MouseMotionListener {
	
	private static final long serialVersionUID = 1L;
	Vector <Point> punti= new Vector<Point>();				//Vector di tipo Point per memorizzare i punti
	JButton bottone, bottone2, bottone3;					//bottone play e clear
	int x,y;												//posizioni x e y dei punti
	int dimensione=20;										//dimensione punti disegnati
	
	
	public PlayerDraw() {
		super();
		addMouseListener(this);
		addMouseMotionListener(this);
	
		bottone= new JButton("PLAY");
//		bottone.addActionListener(this);

				
		bottone2= new JButton("CLEAR");
//		bottone2.addActionListener(this);

		
		bottone3= new JButton("ELIMINA");
//		bottone3.addActionListener(this);
	} 
	
	public void play(){
		int num = punti.size();
		for(int i=0; i<num; i++){
			Graphics g = this.getGraphics();
			Point p = punti.get(i);
			x = (int)(p.getX());
			y = (int)(p.getY());
			g.fillOval(x-dimensione/2, y-dimensione/2, dimensione, dimensione);
			
//			if(i<num-2){							//per evitare punti distaccati
//			Point p2 = punti.get(i+1);				//parte dai 2 punti successivi
//			int x2 = (int)(p2.getX());				//per evitare di collecare linee
//			int y2 = (int)(p2.getY());				//volutamente staccate
//			Point p3 = punti.get(i+1);
//			int x3 = (int)(p3.getX());
//			int y3 = (int)(p3.getY());
//			g.drawLine(x2-dimensione/2, y2-dimensione/2, x3, y3);
//			}
		}
	}
	
	public void clear(){
		Graphics g = this.getGraphics();
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
	}
	
	public void mouseClicked(MouseEvent arg0) {
	}

	public void mouseEntered(MouseEvent arg0) {
	}

	public void mouseExited(MouseEvent arg0) {
	}

	public void mousePressed(MouseEvent arg0) {
	}

	public void mouseReleased(MouseEvent arg0) {
	}

	public void mouseDragged(MouseEvent arg0) {
		Graphics g = this.getGraphics();
		Point p = arg0.getPoint();
		x = (int)(p.getX());
		y = (int)(p.getY());
		punti.add(p);
		g.setColor(Color.BLACK);
		g.fillOval(x-dimensione/2, y-dimensione/2, dimensione, dimensione);
	}

	public void mouseMoved(MouseEvent arg0) {
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bottone){					//bottone play
			clear();
			play();
		}
		if(e.getSource()==bottone2){				//bottone clear
			clear();
		}
		if(e.getSource()==bottone3){				//bottone elimina
			punti.clear();
			clear();
		}
	}
}