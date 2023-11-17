package Math;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre :");
        double inputNumber = scanner.nextDouble();
        System.out.println(Math.sqrt(inputNumber));
        System.out.println(Math.log(inputNumber));
        System.out.println(Math.round(inputNumber));
        System.out.println(Math.random() * inputNumber);
        }
    }
}
