package LocalDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez une date au format AAAA-MM-JJ");
        String dateString = scanner.nextLine();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(dateString, format);
        System.out.print("La date entrée : ");
        System.out.println(date);
        System.out.print("La date d'aujourd'hui : ");
        System.out.println(LocalDate.now());
        System.out.print("La date de demain : ");
        System.out.println(LocalDate.now().plusDays(1));
        System.out.print("La date de la semaine prochaine : ");
        System.out.println(LocalDate.now().plusWeeks(1));
    }
}