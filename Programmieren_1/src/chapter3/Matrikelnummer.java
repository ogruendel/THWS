package chapter3;

import java.util.Scanner;

public class Matrikelnummer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte eine Matrikelnummer eingeben:");
        int nummer = scanner.nextInt();
        String nummerS = String.valueOf(nummer);

        if (nummerS.length() != 7) {
            System.out.println("Keine Matrikelnummer (nicht 7 Zeichen lang)");
        } else if ((nummerS.charAt(0) == '5' && nummerS.charAt(1) == '0') || (nummerS.charAt(0) == '5' && nummerS.charAt(1) == '1') || (nummerS.charAt(0) == '6' && nummerS.charAt(1) == '1')) {
            System.out.println("Gültige Matrikelnummer");
        } else {
            System.out.println("Keine Matrikelnummer (Muss mit 50, 51 oder 61 starten)");
        }

        scanner.close();
    }
}
