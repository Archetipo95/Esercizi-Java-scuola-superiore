/**
 * @author Riccardo Ambrosi - Guariento Matteo
 * 
Produrre un programma che permetta di memorizzare il tracciato del mouse.
Oltre alle coordinate si deve salvare il tempo in cui i punti vengono tracciati.
Quando si rilascia il mouse il tracciato si considera terminato.
Schiacciando un pulsante "Play" si deve ridisegnare il tracciato alla corretta velocità usata in fase di registrazione.

Opzioni:
- Menu file->salva, file->apri.
- Cursore per visualizzare parzialmente o tornare indietro.
- Possibilità di accelerare/rallentare.
- Possibilità di modificare spessore della linea, colore.
- Altre opzioni a piacere.
 */

package PlayerDraw;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;


public class MouseTracciato extends JPanel implements ActionListener, MouseListener, MouseMotionListener{

	JButton canc, play;
	Vector <Point> punti;
	Timer timer;
	int delay=100;

	public MouseTracciato() {
		super();

		addMouseListener(this);
		addMouseMotionListener(this);

		canc=new JButton("Cancella");
		canc.addActionListener(this);
		add(canc);

		play=new JButton("Play");
		play.addActionListener(this);
		add(play);
		timer=new Timer(delay, this);


		punti=new Vector();
	}



	@Override
	public void mouseClicked(MouseEvent arg0) {
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		Graphics g = this.getGraphics();
		Point p = arg0.getPoint();
		int x = (int)(p.getX());
		int y = (int)(p.getY());
		g.fillOval(x-1, y-1, 6, 6);

		punti.add(p);
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {

	}
	@Override
	public void mouseDragged(MouseEvent arg0) {
		Graphics g = this.getGraphics();
		Point p = arg0.getPoint();
		int x = (int)(p.getX());
		int y = (int)(p.getY());
		g.fillOval(x-1, y-1, 6, 6);

		punti.add(p);
	}



	@Override
	public void mouseMoved(MouseEvent arg0) {

	}

	public static void main (String [] args) {
		JFrame win;
		Container pannello;

		win=new JFrame("Mouse Tracciato");
		pannello= win.getContentPane();

		win.setSize(800, 800);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setLocationRelativeTo(null);
		win.setResizable(false);

		pannello.add(new MouseTracciato());

		win.setVisible(true);
	}



	@Override
	public void actionPerformed(ActionEvent arg0) {
		Graphics g = this.getGraphics();

		if(arg0.getSource()==timer){
			Graphics2D g2=(Graphics2D)g;
			for(int i=0; i<=punti.size(); i++) {
				//g.fillOval((int)(punti.elementAt(0+i).getX()), (int)(punti.elementAt(1+i).getY()), 6, 6);			
				g2.setStroke(new BasicStroke(6));
				g2.drawLine((int)(punti.elementAt(0+i).getX()), (int)(punti.elementAt(1+i).getY()), (int)(punti.elementAt(0+i+1).getX()), (int)(punti.elementAt(1+i+1).getY()));

				try {
					Thread.sleep(15);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				timer.stop();
			}

		}
		if(arg0.getSource()==canc){
			punti.clear();
			repaint();
		}
		if(arg0.getSource()==play){
			repaint();
			timer.start();
		}

	}
}

