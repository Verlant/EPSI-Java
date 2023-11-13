import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exo4 {
    public static void askNamesAndHydrateList(List<String> stringList, Scanner scanner) {
        char continueInput;
        do {
            System.out.print("Saisissez un nom : ");
            String name = scanner.next();
            stringList.add(name);
            System.out.print("Continuer de saisir des noms ? o/n ");
            continueInput = scanner.next().charAt(0);
        } while (continueInput != 'n');
    }

    public static void listContainsAskedName(List<String> stringList, Scanner scanner) {
        System.out.print("Saisissez un nom : ");
        String name = scanner.next();
        if (stringList.contains(name)) {
            System.out.println("Le nom demandé \"" + name + "\" se trouve bien dans la liste");
        } else {
            System.out.println("Le nom demandé \"" + name + "\" ne se trouve pas dans la liste");
        }
    }
}
