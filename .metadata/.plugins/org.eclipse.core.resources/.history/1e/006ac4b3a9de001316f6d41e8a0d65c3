package GoogleMaps;
import java.net.*;
import javax.swing.*;
import java.awt.*;
public class PannelloImmagini extends JPanel {
	private static final long serialVersionUID = 1L;
	URL url;

	public PannelloImmagini(URL url) {
		this.url = url;
		setPreferredSize(new Dimension(600,600));
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(url != null){
			Image img = new ImageIcon(url).getImage();
			g.drawImage(img, 0, 0, null);
		}
	}
}