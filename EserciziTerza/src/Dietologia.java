/*
DIETOLOGIA 
-----------
Le proprietà nutrizionali di un alimento dipendono principalmente da tre fattori: Glucidi, Lipidi, Proditi ovvero Carboidrati o Zuccheri, Grassi, Proteine.
Altri fattori, qui non considerati, sono i minerali, le vitamine, le fibre, la quantità di acqua.
Il contenuto è normalmente espresso in grammi (numero decimale) ogni cento grammi di alimento (cibi sfusi come le mele) oppure in grammi per porzione (cibi confezionati come ad esempio i crackers).
L'apporto energetico si calcola come prodotto tra la quantità di un certo fattore e l'energia specifica propria di quel fattore.
L'energia si esprime in Kcal (kilo calorie) oppure in kJ (kilo Joule).

Esempi:
* Mela - 100 grammi di prodotto commestibile sono mediamente contenuti: 11 grammi di zuccheri, 0,1 grammi di grassi, 0,2 grammi di proteine.
* Pane bianco - Le proprietà nutrizionali contenute in 100 gr di pane con farina 00:  Carboidrati 68 g, Grassi 0 g, Proteine 8 g.
* Patatine fritte in busta - Carboidrati 58,5 g, Grassi 29,6 g, Proteine 5,4 g.
* Mozzarella - Carboidrati 0, Lipidi 16.1, Protidi 19,9.
* Parmigiano - Carboidrati 0.06, Lipidi 25.8, Protidi 36.6.
* Mortadella - Carboidrati 1,5 g, Grassi 28,1 g, Proteine 14,7 g.

Valutazione dell'apporto energetico
* Carboidrati
I carboidrati forniscono al nostro corpo in media 4 Kcal per grammo.
* Lipidi
I grassi forniscono al nostro corpo in media 9 Kcal per grammo.
* Proteine
Le proteine forniscono al nostro corpo in media 4 Kcal per grammo.

Una caloria equivale a 4,186 joule quindi per convertire le Kilocalorie in kilojoule basta moltiplicarle per 4,186

- Valori presi dal sito (http://www.my-personaltrainer.it/calorie-macronutrienti.html)

APPORTO GIORNALIERO
-------------------
Dato l'elenco dei cibi e la loro quantità è possibile sapere quanti grammi dei vari fattori considerati un individuo ha assunto durante il giorno e quante Calorie (o kJ) in totale.

FABBISOGNO GIORNALIERO
----------------------
Il fabbisogno giornaliero dipende da vari fattori. Una indicazione di massima è data dalla seguente tabella:
1600 calorie per donne sedentarie;
2200 calorie per uomini sedentari e per donne in gravidanza o in allattamento;
2800 calorie per uomini sportivi, donne molto sportive e per gli adolescenti
Il fabbisogno giornaliero necessita di 15% proteine, 30% grassi e 55% carboidrati.

CONSEGNA
--------
Si deve implementare un programma che contenga un elenco di cibi. L'elenco deve essere presente nel programma e non inserito da tastiera ogni volta.
Serve la descrizione, l'unità di misura (g o unità), il numero di grammi di glucidi, lipidi, protidi riferiti a 100g o per unità.
L'utente inserisce il suo consumo giornaliero specificando il cibo e la quantità.
Queste scelte vengono aggiunte in un elenco a cui è possibile aggiungere, togliere o modificare la quantità.
Di volta in volta o alla fine (a scelta dell'implementatore) verrà visualizzato il totale delle quantità in grammi assunte e il totale delle calorie corrispondenti.

Eventuali aggiunte - L'ordine non è determinante
- Possibilità di calcolare il fabbisogno giornaliero di un individuo (ricerca...)
- Possibilità di calcolare il peso forma (peso consigliato) di un individuo (ricerca...)
- Possibilità di inserire nuovi alimenti o modificare quelli esistenti
*/
/*Fipponi  Masevski
 *20/03/2013
 *3AI
 */
public class Dietologia
{
	private String nome;
    private double zuccheri,grassi,proteine;
    public int quantita;
    public Dietologia(String nom,double glucidi,double lipidi,double protidi)
    {
    	nome=nom;
    	zuccheri=glucidi;
    	grassi=lipidi;
    	proteine=protidi;
    }
    public String toString()
    {
    	String s;
    	s=nome+" - "+zuccheri+"g di zuccheri "+grassi+"g di grassi "+proteine+"g di proteine";
        return s;
    }
    public double ConsumoGiornalieroCibo (double quantita)
    {
    	double Consumo;
    	Consumo=((zuccheri*4)+(proteine*4)+(grassi*9))*quantita/100;
    	return Consumo;
    }   
}