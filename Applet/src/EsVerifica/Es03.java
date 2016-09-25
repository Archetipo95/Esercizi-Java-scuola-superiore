/**
 * 
 */
package EsVerifica;

import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.*;

public class Es03 extends JApplet implements ActionListener {

	private static final long serialVersionUID = 1L;
	Timer timer;
	JLabel label;
	String ore, min, sec;
	String anno, mese, giorno;
	DateFormat dateformat;
	Calendar cal;

	public void init() {
		super.init();
		timer = new Timer(1000, this);
		label = new JLabel();
		getContentPane().setBackground(Color.WHITE);
		getContentPane().add(label);
		label.setLayout(new FlowLayout());
	}

	public void start() {
		super.start();
		timer.start();
	}

	public void actionPerformed(ActionEvent arg0) {
//		Container c = getContentPane();
		cal = Calendar.getInstance();
		
		dateformat = new SimpleDateFormat("hh");
		ore = dateformat.format(cal.getTime());
		
		dateformat = new SimpleDateFormat("mm");
		min = dateformat.format(cal.getTime());
		
		dateformat = new SimpleDateFormat("ss");
		sec = dateformat.format(cal.getTime());
		
		dateformat = new SimpleDateFormat("yyyy");
		anno = dateformat.format(cal.getTime());
		
		dateformat = new SimpleDateFormat("MM");
		mese = dateformat.format(cal.getTime());
		
		dateformat = new SimpleDateFormat("dd");
		giorno = dateformat.format(cal.getTime());
		
		label.setText("Ora: "+ore+":"+min+":"+sec+"; Data: "+giorno+"/"+mese+"/"+anno);
	}	
}