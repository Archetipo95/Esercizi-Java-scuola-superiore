/**
 * Masevski Fipponi 14/01/14
 * 4ai
 */
import javax.swing.*;
import java.awt.*;
public class Es_bandiera extends JPanel {
	private static final long serialVersionUID = 1L;
    Es_bandiera()
    {
        setPreferredSize(new Dimension(100, 100));
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);//sfondo ... 
       // g.drawRect(100,0, 100, this.getHeight());
        
       // g.drawRect(200, this.getHeight(), 200, 0);
        
        g.setColor(Color.green);
        g.fillRect(0,0, this.getWidth()/3, this.getHeight());
        
        g.setColor(Color.white);
        g.fillRect(this.getWidth()/3,0, this.getWidth()/3, this.getHeight());
        
        g.setColor(Color.red);
        g.fillRect(this.getWidth()-(this.getWidth()/3),0, this.getWidth(), this.getHeight());
    }
    public static void main(String args[])
    {
        JFrame f = new JFrame("Bandiera Italiana");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = f.getContentPane();
        Es_bandiera pann = new Es_bandiera();
        c.add( pann );
        f.pack();
        f.setVisible(true);
    }


}

