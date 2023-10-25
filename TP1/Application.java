import java.util.Scanner;
import java.lang.Math;

public class Application {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Hello World
    // helloWorld();

    // Pair ou Impair
    // paiImpair(scanner);

    // Somme
    // System.out.print("Entrez un nombre entier : ");
    // int n = scanner.nextInt();
    // System.out.println("La somme de 1 à " + n + " est égale à " + somme(n));

    // Moyenne

    // 4.1 
    // System.out.println("Entrez un premier nombre entier : ");
    // int a = scanner.nextInt();
    // System.out.println("Entrez un second nombre entier : ");
    // int b = scanner.nextInt();
    // System.out.println("Entrez un troisième nombre entier : ");
    // int c = scanner.nextInt();
    // System.out.println("La moyenne de " + a + ", " + b + " et " + c + " est égale à " + moyenne(a, b, c));

    // 4.2
    // System.out.println("Entrez un nombre entier compris entre 3 et 20 : ");
    // int n = scanner.nextInt();
    // if ((n < 3) || (n > 20)) {
    //   System.out.println("Le nombre que vous avez rentré n'est pas compris entre 3 et 20.");
    //   System.out.println("Entrez un nombre entier compris entre 3 et 20 : ");
    //   n = scanner.nextInt();
    // }
    // System.out.println("La moyenne est de "+moyenneNnombres(n));

    // System.out.println(calculatrice(scanner));

    // System.out.println(compteurDeVoyelle("Bonjour"));

    // System.out.println(nombrePremierRecursif(25, 25));
    // System.out.println(nombrePremierRecursif(13, 13));
    // System.out.println(nombrePremierRecursif(7, 7));
    // System.out.println(nombrePremierRecursif(4, 4));
    // System.out.println(nombrePremierRecursif(2, 2));
    // System.out.println(nombrePremierRecursif(1, 1));
    // System.out.println(nombrePremierRecursif(0, 0));

    // for (long n: fibonacci(scanner)) {
    //   System.out.println(n);
    // }

    // System.out.println(factorielle(0));
    // System.out.println(factorielle(1));
    // System.out.println(factorielle(-2));
    // System.out.println(factorielle(5));

    // System.out.println(factorielleRecursive(0));
    // System.out.println(factorielleRecursive(1));
    // System.out.println(factorielleRecursive(2));
    // System.out.println(factorielleRecursive(-2));
    // System.out.println(factorielleRecursive(5));

    System.out.println(isPalindrome("bonjour"));
    System.out.println(isPalindrome("radar"));
    System.out.println(isPalindrome("kayak"));
    System.out.println(isPalindrome("été"));
    System.out.println(isPalindrome("k   a Y a           K"));
  }

  public static void helloWorld() {
    System.out.println("Hello World");
  }

  public static void paiImpair(Scanner scanner) {
    System.out.print("Entrez un nombre entier : ");
    int n = scanner.nextInt();
    if (n%2 == 0) {
      System.out.println("L'entier " + n + " est pair");
    } else {
      System.out.println("L'entier " + n + " est impair");
    }
  }

  public static int somme(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n + somme(n-1);
    }
  }

  // 4.1 
  public static int moyenne(int a, int b, int c) {
    return (a + b + c) /  3;
  }

  // 4.2
  public static double moyenneNnombres(int n) {
    double[] t = new double[n];
    double total = 0;
    for (int i = 0; i < n; i++) {
      total += Math.random()*100;
    }
    return total / n;
  }

  public static double calculatrice(Scanner scanner) {
    System.out.println("Entrez un premier nombre : ");
    double a = scanner.nextDouble();
    System.out.println("Entrez un deuxième nombre : ");
    double b = scanner.nextDouble();
    System.out.println("Choisissez une opération parmis + - * / : ");
    char operation = scanner.next().charAt(0);
    switch (operation) {
      case '+':
        return a + b;
      case '-':
        return a - b;
      case '*':
        return a * b;
      case '/':
        return a / b;
      default:
        System.out.println("Opération non reconnue");
        return -1;
    }
  }

  public static int compteurDeVoyelle(String phrase) {
    char[] voyelles = {'a', 'e', 'i', 'o', 'u', 'y'};
    int compteur = 0;
    for (int i = 0; i < phrase.length(); i++) {
      for (char voyelle: voyelles) {
        if (phrase.charAt(i) == voyelle) compteur++;
      }
    }
    return compteur;
  }

  public static boolean nombrePremier(int n) {
    if (n == 0 || n == 1) return false;
    for (int i = n-1; i >= 2; i--) {
      if (n % i == 0) return false;
    }
    return true;
  }

  // Fonctionne ssi n == d
  public static boolean nombrePremierRecursif(int n, int d) {
    if (d <= 1) return false;
    else if (d == 2) return true;
    else if (n % (d - 1) == 0) return false;
    else return nombrePremierRecursif(n, d-1);
  }

  public static long[] fibonacci(Scanner scanner) {
    System.out.println("Quel nombre de terme de la suite de Fibonacci voulez-vous ? ");
    int n = scanner.nextInt();
    long[] t = new long[n];
    t[0] = 0;
    if (n>1) {
      t[1] = 1;
      for (int i = 2; i < n; i++) {
        t[i] = t[i-2] + t[i-1];
      }
    }
    return t;
  }

  public static long factorielle(int n) {
    if (n < 0) return -1;
    long result = 1;
    for (int i = 2; i <= n; i++) {
      result *= i;
    }
    return result;
  }

  public static long factorielleRecursive(int n) {
    if (n < 0) return -1;
    else if (n == 0 || n == 1) return 1;
    return n * factorielleRecursive(n-1);
  }

  public static boolean isPalindrome(String mot) {
    mot = mot.replace(" ", "");
    mot = mot.toLowerCase();
    for (int i = 0; i < mot.length(); i++) {
      char[] tableauMot = mot.toCharArray();
      if (tableauMot[i] != tableauMot[mot.length() - 1 - i]) return false;
    }
    return true;
  }
}