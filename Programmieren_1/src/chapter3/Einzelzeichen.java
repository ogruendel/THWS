package chapter3;


import java.util.Scanner;

public class Einzelzeichen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Character eingeben:");
        char c = scanner.nextLine().charAt(0);

        if (c >= 'A' && c <= 'Z') {
            System.out.println("Großbuchstabe");
        }
        if ((c >= '0' && c <= '9') || (c >= 'A' && c <= 'F') || (c >= 'a' && c <= 'f')) {
            System.out.println("Hexadezimale Ziffer");
        }
        if (c == '0' || c == '1') {
            System.out.println("binäre Ziffer");
        }
        if (c >= '0' && c <= '7') {
            System.out.println("oktale Ziffer");
        }
        if (!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'f') || ((c >= '0' && c <= '9')))) {
            System.out.println("Unbekannt");
        }
        scanner.close();
    }
}
