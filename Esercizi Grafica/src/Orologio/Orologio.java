package Orologio;
/**
 * Esercizio - 2014-02-08

Orologio
Creare una applicazione grafica che visualizzi un 
orologio analogico.
Oltre alle lancette delle ore, minuti e secondi 
deve essere visualizzata la scritta allineata alle 
lancette ruotata rispetto al centro dell'orologio.
Per leggere l'ora corrente si usa la classe 
GregorianCalendar come nell'esempio sotto riportato.

Calendar cal = new GregorianCalendar();
cal.get(Calendar.HOUR_OF_DAY);
cal.get(Calendar.MINUTE);
cal.get(Calendar.SECOND);

Orologio a cucu
Idem come sopra, ogni tot tempo (5 minuti) mostrare 
l'immagine di un cucu e far sentire un suono.
 */

import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.*;

public class Orologio extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;

	private static int lato = 600;								//lato frame

	private int centro= lato / 2;								//centro
	private int raggio;											//raggio
	private int anim, anim2, anim3, anim4;						//posizione per movimento

	private static String titolo = "Orologio alpha 0.6.9";		//titolo frame
	private static JFrame frame;								//frame

	private Timer timer;										//timer
	double time;												//tempo sistema

	DateFormat dateformat;
	Calendar cal;
	String s;

	public static void main(String[] args) {
		frame = new JFrame(titolo);
		frame.setSize(lato + 6, lato + 28);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		JPanel p = (JPanel)frame.getContentPane();
		p.setLayout(new BorderLayout());
		Orologio o = new Orologio();
		p.add(o);
	}

	public Orologio() {
		super();
		timer = new Timer(100, this);
		timer.start();
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
//		Graphics2D g2 =  (Graphics2D)g;

		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, lato, lato);

		g.setColor(Color.BLACK);
		g.fillOval(5, 5, lato - 10, lato - 10);

		g.setColor(Color.WHITE);
		g.fillOval(15, 15, lato - 30, lato - 30);

		//trattini
		for(int i = 0; i < 60; i++) {
			raggio = lato - 40;
			anim = centro + (int) ((Math.sin( i % 60.0 /60 * Math.PI * 2)* (raggio / 2)));
			anim2 = centro - (int) ((Math.cos( i % 60.0 /60 * Math.PI * 2)* (raggio / 2)));

			raggio = lato - 50;
			anim3 = centro + (int) ((Math.sin( i % 60.0 /60 * Math.PI * 2)* (raggio / 2)));
			anim4 = centro - (int) ((Math.cos( i % 60.0 /60 * Math.PI * 2)* (raggio / 2)));

			g.setColor(Color.BLACK);
			g.drawLine(anim, anim2, anim3, anim4);
		}

//				//pallini di vise
//				for(int i=0; i<12; i++){
//					g2.fillOval(centro-centro/40, centro/100, centro/20, centro/20);
//					g2.rotate(Math.PI*2*(30/360),centro,centro);
//				}

		//scritta titolo
		g.setColor(Color.BLACK);
		g.drawString(titolo, centro-50, centro+50);

		//ore con lancetta
		dateformat = new SimpleDateFormat("hh");
		cal = Calendar.getInstance();
		s = dateformat.format(cal.getTime());

		raggio = lato - 300;
		anim = centro + (int) ((Math.sin(Integer.parseInt(s) % 60.0 / 12 * Math.PI * 2) * (raggio /2)));
		anim2 = centro - (int) ((Math.cos(Integer.parseInt(s) % 60.0 / 12 * Math.PI * 2) * (raggio /2)));

		g.setColor(Color.BLACK);
		g.drawLine(centro, centro, anim, anim2);
		g.drawLine(centro+1, centro, anim+1, anim2);
		g.drawLine(centro, centro+1, anim, anim2+1);
		g.drawLine(centro-1, centro, anim-1, anim2);
		g.drawLine(centro, centro-1, anim, anim2-1);
		g.drawLine(centro+2, centro, anim+2, anim2);
		g.drawLine(centro, centro+2, anim, anim2+2);
		g.drawLine(centro-2, centro, anim-2, anim2);
		g.drawLine(centro, centro-2, anim, anim2-2);
		g.drawLine(centro+3, centro, anim+3, anim2);
		g.drawLine(centro, centro+3, anim, anim2+3);
		g.drawLine(centro-3, centro, anim-3, anim2);
		g.drawLine(centro, centro-3, anim, anim2-3);

		//numeretto ore
		if(Integer.parseInt(s)==00)
			s="12";
		g.drawString(s, anim-15, anim2);

		//minuti con lancetta
		dateformat = new SimpleDateFormat("mm");
		cal = Calendar.getInstance();
		s = dateformat.format(cal.getTime());

		raggio = lato - 80;
		anim = centro + (int) ((Math.sin(Integer.parseInt(s) % 60.0 / 60 * Math.PI * 2) * (raggio /2)));
		anim2 = centro - (int) ((Math.cos(Integer.parseInt(s) % 60.0 / 60 * Math.PI * 2) * (raggio /2)));
		g.setColor(Color.BLACK);
		g.drawLine(centro, centro, anim, anim2);
		g.drawLine(centro+1, centro, anim+1, anim2);
		g.drawLine(centro, centro+1, anim, anim2+1);
		g.drawLine(centro-1, centro, anim-1, anim2);
		g.drawLine(centro, centro-1, anim, anim2-1);

		//numeretto minuti
		if(Integer.parseInt(s)==00)
			s="60";
		g.drawString(s, anim-15, anim2);

		//secondi con lancetta

		dateformat = new SimpleDateFormat("ss");
		cal = Calendar.getInstance();
		s = dateformat.format(cal.getTime());

		raggio = lato - 80;
		anim = centro + (int) ((Math.sin(Integer.parseInt(s) % 60.0 / 60 * Math.PI * 2) * (raggio /2)));
		anim2 = centro - (int) ((Math.cos(Integer.parseInt(s) % 60.0 / 60 * Math.PI * 2) * (raggio /2)));

		g.setColor(Color.RED);
		g.drawLine(centro, centro, anim, anim2);
		g.drawLine(centro+1, centro, anim+1, anim2);
		g.drawLine(centro, centro+1, anim, anim2+1);
		g.drawLine(centro-1, centro, anim-1, anim2);
		g.drawLine(centro, centro-1, anim, anim2-1);

		//cerchio centro rosso
		g.setColor(Color.RED);
		g.fillOval(centro -5,  centro -5, 10, 10);
		
		//numeretto secondi
		//g2.rotate(Math.toRadians(0),anim, anim2);
		if(Integer.parseInt(s)==00)
			s="60";
		g.drawString(s, anim-15, anim2);
	}

	public void actionPerformed(ActionEvent arg0) {
		repaint();
	}
}