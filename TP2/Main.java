import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Personne p1 = new Personne("Antoine", 29);
        Personne p2 = new Personne("Jean", 40);
        Personne p3 = new Personne("Marcel", 35);
        Personne p4 = new Personne("Marcel", 35);

        System.out.println(p1.afficherDetails());
        System.out.println(p2.afficherDetails());

        System.out.println(p1.egal(p2));
        System.out.println(p2.egal(p3));
        System.out.println(p3.egal(p4));

        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));
        System.out.println(p3.equals(p4));

        System.out.println("personne 1 == personne 2 : " + p1.equals(p2));
        System.out.println("personne 3 == personne 4 : " + p3.equals(p4));

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

        Homme h1 = new Homme("Jean", 30, "masculin");

        System.out.println(h1.toString());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Combien de formes voulez-vous créer ?");
        int iterationCounter = scanner.nextInt();
        FormeGeometrique[] t = new FormeGeometrique[iterationCounter];

        for (int i = 0; i < iterationCounter; i++) {
            System.out.println("Voulez vous créer un cercle ou un rectangle ?\n1 : Cercle, 2 : Rectangle");
            int userChoice = scanner.nextInt();

            if (userChoice == 1) {
                System.out.println("Donner un rayon au cercle : ");
                double rayon = scanner.nextDouble();
                t[i] = new Cercle(rayon);
            } else if (userChoice == 2) {
                System.out.println("Donner une longueur au rectangle : ");
                double longueur = scanner.nextDouble();
                System.out.println("Donner une largeur au rectangle : ");
                double largeur = scanner.nextDouble();
                t[i]  = new Rectangle(longueur, largeur);
            } else {
                System.exit(0);
            }
        }

        double totalAire = 0;
        double totalPerimetre = 0;
        for (FormeGeometrique formeGeometrique : t) {
            totalPerimetre += formeGeometrique.calculerPerimetre();
            totalAire += formeGeometrique.calculAire();
            formeGeometrique.afficherDetails();
        }
        System.out.println("Périmètre total des formes du tableau  = " + totalPerimetre);
        System.out.println("Aire totale des formes du tableau  = " + totalAire);
    }
}
