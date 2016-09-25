package Esempi;



import java.awt.*;

import javax.swing.JFrame;

public class DA_CampanaPannelloMain {
    public static void main(String args[])
    {
        JFrame f = new JFrame("Campana/e");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = f.getContentPane();
        c.setLayout(new FlowLayout());
        //c.setBackground(Color.white);
        for(int i=0; i<10; ++i)
        	c.add( new DA_CampanaPannelloTempo("imgs/campanaCioccolato.png", 
        				50+(int)(Math.random()*300)) );
        
        f.pack();
        
        f.setVisible(true);
    }
}
/*
c.add( new SemaforoPannelloTempo("Ferrovia", 500) );
c.add( new SemaforoPannelloTempo("Famila", 821) );
c.add( new SemaforoPannelloTempo("Extense", 2000) );
*/
