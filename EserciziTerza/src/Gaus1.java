import java.util.Scanner;

class Gaus1 {


  static int sommaFinoA(int n) {
    int somma = 0;
    for(int i = 1; i <= n; i++) somma += i;
    return somma;
  }


  static int sommaFinoW(int n) {
    int somma = 0;
    int i = 1;
    while(i <= n) {
      somma += i;
      i++;
    }
    return somma;
  }

  static int gauss(int n) {
    return n*(n+1)/2;
  }

  static int inputNaturale() {
    Scanner input = new Scanner(System.in);
    int m;
    while(true) {
      System.out.println("immetti un numero naturale: ");
      if(!input.hasNextInt())
        input.next(); // se non e' un intero, viene consumato
      else {
        m = input.nextInt(); // se e' un intero, viene letto
        if(m >= 0) return m; // se e' positivo, viene restituito
      }
    }
  }

  public static void main(String[] args) {
    int n = inputNaturale();
    System.out.println("la somma e' " + sommaFinoA(n));
    System.out.println("fatta col while e' " + sommaFinoW(n));
    System.out.println("fatta da Gauss e' " + gauss(n));
  }
}
