/**
 * Classe di esempio sull'uso dei metodi (statici per 
 * la suddivisione del lavoro in sotto problemi.
 * I metodi in java servono ad implementare funzioni e 
 * procedure.
 * Esempio:
 *  calcolo dell'area e del perimetro di un rettangolo.
 *  Aggiungiamo nella classe due funzioni per il calcolo
 *  dell'area e del perimetro del rettangolo.
 *  
 * @author Fipponi Masevski
 * @version 2013 gen 15
 */


import java.util.Scanner;
public class MetodiPara_main 
{public static void main(String[] args) 
	{Scanner tastiera= new Scanner(System.in);
	double base, altezza, perimetro;
	System.out.println("Calcolo area e perimetro di un rettangolo");
	System.out.print("Inserisci valore della base");
	base= tastiera.nextDouble();
	System.out.print("Inserisci valore dell'altezza");
	altezza= tastiera.nextDouble();
	
	// richiama metodo per il calcolo del perimetro
	perimetro= perimetroRett(base, altezza);
	
	System.out.println("Perimetro del rettangolo: "+ perimetro);
	System.out.println("Area del rettangolo: "+areaRett(base, altezza));
	}

	
																
/**
 * Funzione per il calcolo del perimetro del rettangolo
 * Definiamo la funzione di nome "perimetroRett":
 * 1 - la visibilità è "public";
 * 2 - "static" indica che è legata alla classe Metodi1;
 * 3 - ll valore restituito è di tipo "double";
 * 4 - Il nome della funzione è "perimetroRett";
 * 5;6 - questa funzione necessità di due valori (parametri) per calcolare il risultato, la base e l'altezza;
 * @param base valore della base del rettangolo
 * @param altezza valore dell'altezza del rettangolo
 * @return il perimetro calcolato	
 */
public static double perimetroRett(double base, double altezza)
		{
	      return (base+altezza)*2;
		}

/**
 * Funzione per il calcolo dell'area del rettangolo. 
 * @param base valore della base del rettangolo
 * @param altezza valore dell'altezza del rettangolo
 * @return area calcolata 
 */

public static double areaRett(double base, double altezza)
  		{
		  return base*altezza;
  		}



	}
