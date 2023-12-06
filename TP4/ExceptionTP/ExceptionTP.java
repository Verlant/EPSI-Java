package ExceptionTP;

import java.util.Scanner;

public class ExceptionTP {
    public static void main(String[] args) {
        System.out.println("Saisissez un nombre entier : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        try {
            int i = Integer.parseInt(input);
            System.out.print("Votre nombre est : ");
            System.out.println(input);
            System.out.println("La conversion de chaine de caractère en entier à réussi");
        } catch (NumberFormatException e) {
            System.out.println(input + " n'est pas un nombre entier, réessayez");
        }
    }
}
