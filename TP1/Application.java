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

    System.out.println(calculatrice(scanner));
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
}