package RappelString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Entrez une phrase :");
            String inputString = scanner.nextLine();

            // Exo 2
            System.out.println(inputString.length());
            System.out.println(inputString.toUpperCase());
            System.out.println(inputString.toLowerCase());
            if (inputString.toLowerCase().replace(" ", "").contains("java")) {
                System.out.println("La phrase contient le mot Java");
            } else {
                System.out.println("La phrase ne contient pas le mot Java");
            }
            System.out.println(inputString.replace('e', 'E'));
            System.out.println(inputString.substring(0, Math.floorDiv(inputString.length(), 2)));
            System.out.println(inputString.substring(Math.ceilDiv(inputString.length(), 2)));

            // Exo 3
            int nbrMaj = 0;
            int nbrMin = 0;
            for (int i = 0; i < inputString.length(); i++) {
                if (inputString.charAt(i) >= 65 && inputString.charAt(i) <= 90) {
                    nbrMaj += 1;
                } else if (inputString.charAt(i) >= 97 && inputString.charAt(i) <= 122) {
                    nbrMin += 1;
                }
            }
            System.out.println(nbrMaj);
            System.out.println(nbrMin);
            String[] inputWordsArray;
            inputWordsArray = inputString.split(" ");
            System.out.println(inputWordsArray.length);
            StringBuilder inputWordsReverse = new StringBuilder();
            for (String word: inputWordsArray) {
                StringBuilder wordReverse = new StringBuilder();
                for (int i = word.length() - 1; i >= 0; i--) {
                    wordReverse.append(word.charAt(i));
                }
                inputWordsReverse.append(wordReverse);
                inputWordsReverse.append(" ");
            }
            System.out.println(inputWordsReverse.toString().trim());
        }
    }
}
