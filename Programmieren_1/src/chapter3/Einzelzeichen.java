package chapter3;


import java.util.Scanner;

public class Einzelzeichen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Character eingeben:");
        char c = scanner.nextLine().charAt(0);

        // indexOf() offiziell nicht erlaubt

        final String GROSS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String HEX = "0123456789ABCDEFabcdef";
        final String BIN = "01";
        final String OCT = "01234567";

        if (GROSS.indexOf(c) != -1) {
            System.out.println("Großbuchstabe");
        }
        if (HEX.indexOf(c) != -1) {
            System.out.println("Hexadezimale Ziffer");
        }
        if (BIN.indexOf(c) != -1) {
            System.out.println("binäre Ziffer");
        }
        if (OCT.indexOf(c) != -1) {
            System.out.println("oktale Ziffer");
        }
        if (GROSS.indexOf(c) == -1 && HEX.indexOf(c) == -1 && BIN.indexOf(c) == -1 && OCT.indexOf(c) == -1) {
            System.out.println("Unbekannt");
        }
    }
}
