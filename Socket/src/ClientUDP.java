import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.SocketException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.io.IOException;

/*
 * ClientUDP.java
 *
 *
 * Java Development Kit 1.5.0
 * 
 * Progetto di una applicazione client/server su trasporto UDP:
 *  - il client invia il messaggio "Il Servizio Echo"(ClientUDP.java)
 *  - il server restituisce lo stesso messaggio(ServerUDP.java)
 *
 * Indirizzo del client: IP e porta assegnati dal Sistema Operativo 
 * Indirizzo del server: IP assegnato dal Sistema Operativo e porta 3000
 *
* 
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
 * Un semplice client UDP.
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
 *
 */ 


public class ClientUDP
           
{
    public static void main (String args[])
    {
    try
        {
        //estremo della comunicazione client,
        //indirizzo del mittente (IP + porta) viene asseganto implicitamente
        DatagramSocket socket = new DatagramSocket();
       
        
        // ---------------- INVIO DEL MESSAGGIO ----------------
        //impostazione delle informazioni di stato del pacchetto UDP:
        // - il messaggio UDP come array di byte
        // - la dimensione dell array
        // - indirizzo del destinatario a livello Internet [qui 127.0.0.1]
        // - la porta del destinatario
        byte[]array1 = "Il Servizio Echo".getBytes();
        String messaggioInviato = new String (array1);
        int dimensione1 = array1.length;
        InetAddress addr = InetAddress.getLocalHost();
        int porta = 7777;
        System.out.println("INVIO DAL CLIENT ("+ addr + " - "+ porta + ") MESSAGGIO INVIATO: " + messaggioInviato);
        DatagramPacket messaggioUDP = new DatagramPacket (array1, dimensione1, addr, porta);
       
       //invio del pacchetto al server UDP
       //metodo non bloccante, trasporto non affidabile, veloce ma senza certezza di consegna
       socket.send(messaggioUDP);

       
       // ---------------- GESTIONE DELLA RISPOSTA ----------------
       //si crea un esemplare vuoto di DatagramPacket in cui
       //verrà inserito il messaggio UDP
       // - array di byte vuoto
       // - la dimensione dell array
       //array e dimensione dello stesso array sono uguali al precedente pacchetto UDP inviato
       byte[]array2 = new byte[array1.length];
       int dimensione2 = array2.length;
       DatagramPacket rispostaUDP = new DatagramPacket(array2,dimensione2);
       
       //ricezione della risposta, bloccante con time-out di 5 secondi
       socket.setSoTimeout(5000);
       socket.receive(rispostaUDP);
       
       //i dati della risposta UDP sono una stinga
       byte[]temp = rispostaUDP.getData();
       String messaggioArrivato = new String (temp);
       System.out.println("RICEZIONE DAL SERVER (" + rispostaUDP.getAddress() + " - " + rispostaUDP.getPort() + " - MESSAGGIO ARRIVATO: " + messaggioArrivato);
       
       //rilascio della risorsa, estremo della comunicazione client
       socket.close();
       
       }catch(UnknownHostException uhe)
                                        {
                                        System.err.println("Host sconosciuto: " + uhe.getMessage());
                                        }
       catch(SocketException se)
                                {
                                System.err.println("Connessione non riuscita: " + se.getMessage());
                                }
       catch(IOException ioe)
                            {
                            System.err.println("Ricezione o invio pacchetto non riuscita: " + ioe.getMessage());
                            }
    }

}
