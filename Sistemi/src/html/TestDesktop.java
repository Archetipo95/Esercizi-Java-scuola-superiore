package html;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class TestDesktop {
	public static void main( String args[]){

		String ind= "http://www.HDblog.it";
		URI uriInd;
		
		try {
			uriInd= new URI(ind); 
			Desktop.getDesktop().browse(uriInd);
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch(URISyntaxException e1){
			e1.printStackTrace();
		}	
	}	
}