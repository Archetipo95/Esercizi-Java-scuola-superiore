package Esempi;


import java.awt.*;

import javax.swing.JFrame;

public class CA_SemaforoPannelloMain {
    public static void main(String args[])
    {
        JFrame f = new JFrame("Semaforo/i");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = f.getContentPane();
        c.setLayout(new FlowLayout());
        
        for(int i=0; i<50; ++i){
        	int tempo = 100+(int)(Math.random()*3000);
        	c.add( new CA_SemaforoPannelloTempo("Sem."+i 
        			+ " t="+tempo ,tempo ) );
        
        }
        f.pack();
        f.setVisible(true);
    }
}

/*
c.add( new CA_SemaforoPannelloTempo("Ferrovia", 500) );
        c.add( new CA_SemaforoPannelloTempo("Famila", 821) );
        c.add( new CA_SemaforoPannelloTempo("Extense", 2000) );

*/
