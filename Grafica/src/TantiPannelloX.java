



import javax.swing.*;
import java.awt.*;
public class TantiPannelloX {

    public static void main(String args[])
    {
        JFrame f = new JFrame("PannelloX");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = f.getContentPane();
        c.setLayout(new GridLayout(7,9));
        for(int i=0; i<7*9; ++i)
        {
        	PannelloX px = new PannelloX();
        	//px.setBorder(BorderFactory.createLineBorder(Color.green));
        	px.setBorder(BorderFactory.createTitledBorder("Pannello "+i));
        	c.add( px );
        }
        f.pack();
        f.setVisible(true);
    }


}
