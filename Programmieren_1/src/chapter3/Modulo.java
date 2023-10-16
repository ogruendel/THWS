package chapter3;

import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte eine ganze Zahl eingeben: ");

        int num = scanner.nextInt();

        if (num % 7 == 0) {
            System.out.println("Die Zahl ist ohne Rest durch 7 teilbar. Ergebnis: " + num / 7.0);
        } else {
            System.out.println("Die Zahl ist nicht ohne Rest durch 7 teilbar. Ergebnis: " + num / 7.0);
        }

        /* Man kann den Modulo ohne Probleme auf negative und Kommazahlen anwenden.
        *  Das Ergebnis gibt immer noch den Rest einer Division aus und ist damit sinnvoll.
         */
    }
}
