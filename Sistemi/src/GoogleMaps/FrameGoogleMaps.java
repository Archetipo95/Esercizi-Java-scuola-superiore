package GoogleMaps;
import java.awt.Container;
import java.awt.Window.Type;
import java.net.*;

import javax.swing.JFrame;
public class FrameGoogleMaps {
	
	public FrameGoogleMaps(String link, String zoom, String tipoTerreno) {	
	try {
			URL url = new URL("http://maps.googleapis.com/maps/api/staticmap?center=" + link + "&zoom=" + zoom + "&size=600x600&maptype=" + tipoTerreno + "&sensor=false");
			JFrame win = new JFrame("Mappa");
			win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container c = win.getContentPane();
			c.add(new PannelloImmagini(url));
			win.setType(Type.UTILITY);
			win.setResizable(false);
			win.pack();
			win.setLocationRelativeTo(null);
			win.setVisible(true);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}