package chapter3;

import java.util.Scanner;

public class Uhrzeit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Stunden:");
        int h = scanner.nextInt();

        System.out.println("Minuten:");
        int m = scanner.nextInt();

        System.out.println("Sekunden");
        int s = scanner.nextInt();

        if (h > 0 && h < 24) {
            if (m > 0 && m < 59) {
                if (s > 0 && s < 59) {
                    System.out.println("Gültige Uhrzeit");
                } else {
                    System.out.println("Keine gültige Uhrzeit: Sekunden nicht zwischen 0 und 59");
                }
            } else {
                System.out.println("Keine gültige Uhrzeit: Minuten nicht zwischen 0 und 59");
            }
        } else {
            System.out.println("Keine gültige Uhrzeit: Stunden nicht zwischen 0 und 23");
        }

        scanner.close();
    }
}
