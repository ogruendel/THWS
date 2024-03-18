package chapter3;

import java.util.Scanner;

public class Matrikelnummer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte eine Matrikelnummer eingeben:");
        String nummer = scanner.nextLine();

        if (nummer.length() != 7) {
            System.out.println("Keine Matrikelnummer (nicht 7 Zeichen lang)");
        } else if ((nummer.charAt(0) == '5' && nummer.charAt(1) == '0') || (nummer.charAt(0) == '5' && nummer.charAt(1) == '1') || (nummer.charAt(0) == '6' && nummer.charAt(1) == '1')) {
            System.out.println("Gültige Matrikelnummer");
        } else {
            System.out.println("Keine Matrikelnummer (Muss mit 50, 51 oder 61 starten)");
        }

        scanner.close();
    }
}
