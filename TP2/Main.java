import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Exercice 1

//        Personne p1 = new Personne("Antoine", 29);
//        Personne p2 = new Personne("Jean", 40);
//        Personne p3 = new Personne("Marcel", 35);
//        Personne p4 = new Personne("Marcel", 35);
//
//        System.out.println(p1.afficherDetails());
//        System.out.println(p2.afficherDetails());
//
//        System.out.println(p1.egal(p2));
//        System.out.println(p2.egal(p3));
//        System.out.println(p3.egal(p4));
//
//        System.out.println(p1.equals(p2));
//        System.out.println(p2.equals(p3));
//        System.out.println(p3.equals(p4));
//
//        System.out.println("personne 1 == personne 2 : " + p1.equals(p2));
//        System.out.println("personne 3 == personne 4 : " + p3.equals(p4));
//
//        System.out.println(p1.toString());
//        System.out.println(p2.toString());
//        System.out.println(p3.toString());
//        System.out.println(p4.toString());
//
//        Homme h1 = new Homme("Jean", 30, "masculin");
//
//        System.out.println(h1.toString());
//
        // Exercice 2

        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Combien de formes voulez-vous créer ?");
//        int iterationCounter = scanner.nextInt();
//        FormeGeometrique[] t = new FormeGeometrique[iterationCounter];
//
//        for (int i = 0; i < iterationCounter; i++) {
//            System.out.println("Voulez vous créer un cercle ou un rectangle ?\n1 : Cercle, 2 : Rectangle");
//            int userChoice = scanner.nextInt();
//
//            if (userChoice == 1) {
//                System.out.println("Donner un rayon au cercle : ");
//                double rayon = scanner.nextDouble();
//                t[i] = new Cercle(rayon);
//            } else if (userChoice == 2) {
//                System.out.println("Donner une longueur au rectangle : ");
//                double longueur = scanner.nextDouble();
//                System.out.println("Donner une largeur au rectangle : ");
//                double largeur = scanner.nextDouble();
//                t[i]  = new Rectangle(longueur, largeur);
//            } else {
//                System.exit(0);
//            }
//        }
//
//        double totalAire = 0;
//        double totalPerimetre = 0;
//        for (FormeGeometrique formeGeometrique : t) {
//            totalPerimetre += formeGeometrique.calculerPerimetre();
//            totalAire += formeGeometrique.calculAire();
//            formeGeometrique.afficherDetails();
//        }
//        System.out.println("Périmètre total des formes du tableau  = " + totalPerimetre);
//        System.out.println("Aire totale des formes du tableau  = " + totalAire);

        // Exercice 3

//        Chien chien1 = new Chien("Médor", "Labrador");
//        Chat chat1 = new Chat("Félix", "Maincoon");
//        chien1.afficherInfos();
//        System.out.println(chien1.emettreSon());
//        chat1.afficherInfos();
//        System.out.println(chat1.emettreSon());

        // Exercice 4

//        List<String> nameList = new ArrayList<>();
//        Exo4.askNamesAndHydrateList(nameList, scanner);
//        System.out.println(nameList);
//        Exo4.listContainsAskedName(nameList, scanner);

        // Exercice 5

        Map<String, String> contacts = new HashMap<>();
        ContactList contactList = new ContactList(contacts);
        int choice;
        do {
            System.out.println(" ----------------------------------------------------------");
            System.out.println("|  Choisissez une action à effectuer sur votre répertoire  |");
            System.out.println("|            Tapez 1 pour ajouter un contact               |");
            System.out.println("|            Tapez 2 pour modifier un contact              |");
            System.out.println("|            Tapez 3 pour supprimer un contact             |");
            System.out.println("|            Tapez 4 pour afficher vos contacts            |");
            System.out.println("|            Tapez 0 pour quitter                          |");
            System.out.println(" ----------------------------------------------------------");
            System.out.print("Faites votre choix : ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    contactList.addContact(scanner);
                    break;

                case 2:
                    contactList.editContact(scanner);
                    break;

                case 3:
                    contactList.deleteContact(scanner);
                    break;

                case 4:
                    contactList.printContactList();
                    break;

                default:
                    break;
            }
        } while (choice != 0);
    }
}
