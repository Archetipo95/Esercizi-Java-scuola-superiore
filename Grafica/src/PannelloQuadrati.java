


import javax.swing.*;
import java.awt.*;
public class PannelloQuadrati extends JPanel {
	private static final long serialVersionUID = 1L;
	protected int nRows;
    protected int nCols;
    protected int wid;
    PannelloQuadrati(int nr, int nc, int wd)
    {
        nRows = nr;
        nCols = nc;
        wid   = wd;
        setPreferredSize(new Dimension(nCols*wid+1, nRows*wid+1));
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int wid4 = wid/4;
        if(wid4<1)wid4=1;
        int wid2 = wid4*2;
        g.setColor(Color.red);
        for(int r= 0; r<=nRows; ++r)
        {
            g.drawLine(0, r*wid, nCols*wid, r*wid);
        }
        for(int c= 0; c<=nCols; ++c)
        {
            g.drawLine(c*wid, 0, c*wid, nRows*wid);
        }
    }

    public static void main(String args[])
    {
        JFrame f = new JFrame("PannelloQuadrati");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = f.getContentPane();
        PannelloQuadrati pann = new PannelloQuadrati(5,5,50);
        c.add( pann );
        f.pack();
        f.setVisible(true);
    }


}
