import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * RequestHTTP.java
 *
 *
 * Java Development Kit 1.5.0
 *
 *
 *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Un semplice client HTTP.
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *
 */


public class RequestHTTP 

{
	public static void main(String args[]) {
		try {
			// il server a cui connetersi
			URL url = new URL("https://www.google.com/finance?client=ob&q=NASDAQ:GOOG");
			//connessione con il server e invio della Request HTTP
			URLConnection temp = url.openConnection();
			HttpURLConnection conn = (HttpURLConnection)temp;
			// lettura della Response HTTP
			BufferedReader reader = 
					new BufferedReader(
							new InputStreamReader(conn.getInputStream()));
			String s;
			while((s = reader.readLine()) != null)
				System.out.println(s);
			// informazioni di servizio della Response HTTP
			System.out.println(System.getProperty("line.separator") + "---------------");
			System.out.println("Codice e messaggio della response: "
					+ conn.getResponseCode() + " " + conn.getResponseMessage());
			System.out.println("Tipo di contenuto della response: " + conn.getContentType());
			//rilascio delle risorse
			reader.close();
			conn.disconnect();
		}catch(MalformedURLException mue) 
		{
			System.out.println("URL non corretto: " + mue.getMessage());
		}
		catch(IOException ioe) 
		{
			System.out.println("Errore nella richiesta o nella risposta HTTP: " + ioe.getMessage());
		}
	}

}