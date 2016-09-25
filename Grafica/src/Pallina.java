
import javax.swing.*;
import java.awt.*;
public class Pallina extends JPanel {
	private static final long serialVersionUID = 1L;
    Pallina()
    {
        setPreferredSize(new Dimension(230, 250));
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);//sfondo ... 
       
        
        
    }
   // Ogni volta che il pannello viene ridimensionato si richiama il paintComponent

    public static void main(String args[])
    {
        JFrame f = new JFrame("Pallina");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = f.getContentPane();
        Pallina pann = new Pallina();
        c.add( pann );
        f.pack();
        f.setVisible(true);
    }


}
