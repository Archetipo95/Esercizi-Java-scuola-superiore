package Pallina;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Gravita extends JPanel implements ActionListener{

    int DIAMETER = 40;
    float yPos;
    float yVel = 3;

    float acceleration = 0f;
    float gravity = 0.1f;


    Timer tm = new Timer(5,this);
    
    public static void main(String args[]) {

		JFrame f = new JFrame("Prove Grafica");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = f.getContentPane();
		Gravita pan = new Gravita();
		c.add(pan);
		f.pack();
		f.setVisible(true);
	}
    
    public Gravita(){
    	setPreferredSize(new Dimension(200, 500));
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        //Setting the characteristics for the ball
        g.setColor(Color.red);
        g.fillOval(0, (int)yPos, DIAMETER, DIAMETER);
        tm.start();
        repaint();
    }

    public void actionPerformed(ActionEvent e) {

        //If it decides to go out of the screen, change direction.
        if(yPos>430){
        	acceleration = (float) (acceleration * -0.85);
        }

        //This basically is the "engine". It moves the ball.
        yPos = yPos + acceleration;
        acceleration = acceleration + gravity;

    }
}