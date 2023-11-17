package LocalDate;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez une date au format AAAA-MM-JJ");
        String dateString = scanner.nextLine();
        LocalDate date = new LocalDate.of(2022, 05, 25);
        System.out.println(date);
    }
}
