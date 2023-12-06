package LocalDateTime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez une première date au format AAAA-MM-JJ HH:MM:SS");
        String firstDateString = scanner.nextLine();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime firstDate = LocalDateTime.parse(firstDateString, format);
        System.out.println(firstDate);
        System.out.println("Entrez une seconde date au format AAAA-MM-JJ HH:MM:SS");
        String secondDateString = scanner.nextLine();
        LocalDateTime secondDate = LocalDateTime.parse(secondDateString, format);
        System.out.println(secondDate);
        Duration duration = Duration.between(firstDate, secondDate);
        System.out.print("La différence de jours entre ces 2 dates est de : ");
        System.out.println(duration.toDays());
        System.out.print("La différence d'heures entre ces 2 dates est de : ");
        System.out.println(duration.toHours() % 24);
        System.out.print("La différence de minutes entre ces 2 dates est de : ");
        System.out.println(duration.toMinutes() % 60);
        System.out.print("La différence de secondes entre ces 2 dates est de : ");
        System.out.println(duration.toSeconds() % 60);
    }
}
