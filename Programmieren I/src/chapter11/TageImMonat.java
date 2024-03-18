package chapter11;

import java.util.Scanner;

public class TageImMonat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Monat: ");
        String input = scanner.nextLine();
        boolean fertig = false;

        do {
            try {
                System.out.println(tageImMonat(input));
                fertig = true;
            } catch (RuntimeException e) {
                System.out.println("Neuer Monat: ");
                input = scanner.nextLine();
            }
        } while (!fertig);

        scanner.close();
    }

    public static int tageImMonat(String monat) {
        return switch (monat) {
            case "Februar" -> 28;
            case "April", "Juni", "September", "November" -> 30;
            case "Januar", "März", "Mai", "Juli", "August", "Oktober", "Dezember" -> 31;
            default -> throw new RuntimeException("falscher Monat");
        };
    }
}
