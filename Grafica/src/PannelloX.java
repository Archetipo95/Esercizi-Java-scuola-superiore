


import javax.swing.*;
import java.awt.*;
public class PannelloX extends JPanel {
	private static final long serialVersionUID = 1L;
    PannelloX()
    {
        setPreferredSize(new Dimension(230, 250));
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);//sfondo ... 
        g.drawLine(0, 0, this.getWidth(), this.getHeight());
        g.drawLine(0, this.getHeight(), this.getWidth(), 0);
    }
   // Ogni volta che il pannello viene ridimensionato si richiama il paintComponent

    public static void main(String args[])
    {
        JFrame f = new JFrame("PannelloX");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = f.getContentPane();
        PannelloX pann = new PannelloX();
        c.add( pann );
        f.pack();
        f.setVisible(true);
    }


}
