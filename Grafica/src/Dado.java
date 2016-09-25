import javax.swing.*;

import java.awt.*;
public class Dado extends JPanel {
	private static final long serialVersionUID = 1L;
	protected int faccia=1;
	protected int modulo=10;
	
    Dado()
    {
        setPreferredSize(new Dimension(7*modulo+1, 7*modulo+1));
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x, y;
        g.drawRoundRect(1, 1, 7*modulo-1, 7*modulo-1, modulo/2, modulo/2);        
        x=1; y=1; 
        if(faccia==4 || faccia==5 || faccia==6) g.fillOval(x*modulo, y*modulo, modulo, modulo);
        x=1; y=3; 
        if(faccia==6) g.fillOval(x*modulo, y*modulo, modulo, modulo);
        x=1; y=5; 
        if(faccia!=1) g.fillOval(x*modulo, y*modulo, modulo, modulo);
        
        x=3; y=3;
        if(faccia==1 || faccia==3 || faccia==5) g.fillOval(x*modulo, y*modulo, modulo, modulo);

        x=5; y=1; 
        if(faccia!=1) g.fillOval(x*modulo, y*modulo, modulo, modulo);
        x=5; y=3; 
        if(faccia==6) g.fillOval(x*modulo, y*modulo, modulo, modulo);
        x=5; y=5; 
        if(faccia==4 || faccia==5 || faccia==6) g.fillOval(x*modulo, y*modulo, modulo, modulo);
    }

	public int getFaccia() {
		return faccia;
	}


	public void setFaccia(int faccia) {
		if(faccia>=1 && faccia<=6)
			this.faccia = faccia;
	}

    public static void main(String args[])
    {
        JFrame f = new JFrame("Dado");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = f.getContentPane();
        c.setLayout(new FlowLayout());
        for(int i=1; i<=6; ++i)
        {
            Dado pann = new Dado();
            pann.setFaccia(i);
            c.add( pann );
        }
        f.pack();
        f.setVisible(true);
    }
}