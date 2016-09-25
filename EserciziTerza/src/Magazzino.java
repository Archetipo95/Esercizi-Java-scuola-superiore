
/*
 * Esercizio
Si vuole implementare un "Magazzino" di articoli per la vendita.

Articolo
Ogni articolo ha: Descrizione, Codice, Quantità (attuale), Quantità minima.
Descrizione, Codice, Quantità non possono essere modificate direttamente dopo la costruzione dell'oggetto. Si possono solo "leggere".
Con un metodo si aggiunge un numero di articoli a quantità (numero solo positivo).
Con un altro metodo si toglie un numero di articoli a quantità (numero solo positivo). Quantità non può diventare negativa!
Metodi per impostare / leggere la quantità minima (che non può essere negativa!).
Un metodo che ritorna un valore boolean deve controllare se l'articolo è sotto scorta ovvero se la quantità attuale è inferiore alla quantità minima.
ATTENZIONE: NELL'OGGETTO NON SI DEVONO LEGGERE DATI DA TASTIERA O SCRIVERE SU "System.out". La lettura scrittura sulla console si fa solo nel programma principale.

Magazzino
Predisporre un programma con un menu che mantiene una lista di almeno 5 articoli. Questi devono essere precaricati all'avvio del programma, non vanno inseriti da tastiera!!!
Il menu deve dare le seguenti opzioni:
1 - Visualizza stato magazzino=stampa di tutti gli articoli.
2 - Visualizza solo articoli sotto scorta.
3 - Carica un articolo a magazzino. L'articolo deve esistere già, aggiunge solo a quantità. La scelta dell'articolo da aggiungere si fa per posizione in lista.
4 - Toglie una certa quantità da un articolo. La scelta dell'articolo da togliere si fa per posizione in lista.
5 - Modifica la scorta minima per un articolo.

Opzioni aggiuntive:
3*4* - carica/toglie gli articoli in base al codice.
6 - Aggiunge un nuovo articolo non presente a magazzino.
7 - Toglie un articolo esistente purché la quantità sia 0.
 */
public class Magazzino {
	private String descrizione;
	private String codice;
	private int quantità;
	private int quantitàmin;
	public Magazzino (String descr, String cod, int qnt, int qntmin)
	{
		descrizione=descr;;
		codice=cod;
		quantità=qnt;
		setQuantitàmin(qntmin);
	}

	public void aggiungi(int n)
	{
		if (n>0)
		{
			quantità= quantità+n;
		}
	}

	public void togli(int n)
	{
		if (n>0 && n<=quantità)
		{
			quantità=quantità-n;
		}
	}

	public int getQuantitàmin() 
	{
		return quantitàmin;
	}

	public int getQuantità() 
	{
		return quantità;
	}

	public void setQuantitàmin(int quantitàmin) 
	{
		if(quantitàmin>0)
			this.quantitàmin = quantitàmin;
	}
	public boolean controllo(){
		boolean controllo=quantità<quantitàmin;
		return controllo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public String getCodice() {
		return codice;
	}
}

