
/*
 * Esercizio
Si vuole implementare un "Magazzino" di articoli per la vendita.

Articolo
Ogni articolo ha: Descrizione, Codice, Quantit� (attuale), Quantit� minima.
Descrizione, Codice, Quantit� non possono essere modificate direttamente dopo la costruzione dell'oggetto. Si possono solo "leggere".
Con un metodo si aggiunge un numero di articoli a quantit� (numero solo positivo).
Con un altro metodo si toglie un numero di articoli a quantit� (numero solo positivo). Quantit� non pu� diventare negativa!
Metodi per impostare / leggere la quantit� minima (che non pu� essere negativa!).
Un metodo che ritorna un valore boolean deve controllare se l'articolo � sotto scorta ovvero se la quantit� attuale � inferiore alla quantit� minima.
ATTENZIONE: NELL'OGGETTO NON SI DEVONO LEGGERE DATI DA TASTIERA O SCRIVERE SU "System.out". La lettura scrittura sulla console si fa solo nel programma principale.

Magazzino
Predisporre un programma con un menu che mantiene una lista di almeno 5 articoli. Questi devono essere precaricati all'avvio del programma, non vanno inseriti da tastiera!!!
Il menu deve dare le seguenti opzioni:
1 - Visualizza stato magazzino=stampa di tutti gli articoli.
2 - Visualizza solo articoli sotto scorta.
3 - Carica un articolo a magazzino. L'articolo deve esistere gi�, aggiunge solo a quantit�. La scelta dell'articolo da aggiungere si fa per posizione in lista.
4 - Toglie una certa quantit� da un articolo. La scelta dell'articolo da togliere si fa per posizione in lista.
5 - Modifica la scorta minima per un articolo.

Opzioni aggiuntive:
3*4* - carica/toglie gli articoli in base al codice.
6 - Aggiunge un nuovo articolo non presente a magazzino.
7 - Toglie un articolo esistente purch� la quantit� sia 0.
 */
public class Magazzino {
	private String descrizione;
	private String codice;
	private int quantit�;
	private int quantit�min;
	public Magazzino (String descr, String cod, int qnt, int qntmin)
	{
		descrizione=descr;;
		codice=cod;
		quantit�=qnt;
		setQuantit�min(qntmin);
	}

	public void aggiungi(int n)
	{
		if (n>0)
		{
			quantit�= quantit�+n;
		}
	}

	public void togli(int n)
	{
		if (n>0 && n<=quantit�)
		{
			quantit�=quantit�-n;
		}
	}

	public int getQuantit�min() 
	{
		return quantit�min;
	}

	public int getQuantit�() 
	{
		return quantit�;
	}

	public void setQuantit�min(int quantit�min) 
	{
		if(quantit�min>0)
			this.quantit�min = quantit�min;
	}
	public boolean controllo(){
		boolean controllo=quantit�<quantit�min;
		return controllo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public String getCodice() {
		return codice;
	}
}

