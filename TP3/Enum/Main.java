package Enum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un jour de la semaine : ");
        String jourInput = scanner.nextLine();

        try {
            JourSemaine jourEnum = JourSemaine.valueOf(jourInput.toLowerCase().replace(" ", ""));//  Block of code to try
            System.out.println(jourEnum);
            switch (jourEnum) {
                case lundi:
                case mardi:
                case mercredi:
                case jeudi:
                case vendredi:
                    System.out.println("C'est un jour de travail !");
                    break;
                case samedi:
                case dimanche:
                    System.out.println("C'est le week-end !");
                    break;
                default:
                    System.out.println("Jour invalide, veuillez saisir une jour valide de la semaine.");
                    break;
            }
        }
        catch(Exception e) {
            System.out.println("Jour invalide, veuillez saisir une jour valide de la semaine.");
        }
    }
}
