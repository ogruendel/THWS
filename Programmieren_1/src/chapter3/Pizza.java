package chapter3;

import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Durchmesser Pizza 1 in cm:");
        int d1 = scanner.nextInt();
        System.out.println("Preis Pizza 1 in Euro:");
        float p1 = scanner.nextFloat();

        System.out.println("Durchmesser Pizza 2 in cm:");
        int d2 = scanner.nextInt();
        System.out.println("Preis Pizza 2 in Euro:");
        float p2 = scanner.nextFloat();

        double a1 = Math.PI * 0.5 * d1 * 0.5 * d1;
        double a2 = Math.PI * 0.5 * d2 * 0.5 * d2;

        double sizePerPrice1 = a1 / p1;
        double sizePerPrice2 = a2 / p2;

        if (sizePerPrice1 > sizePerPrice2) {
            System.out.println("Die Pizza mit dem Durchmesser von " + d1 + "cm hat ein besseres Größen-/Preisverhältnis");
        } else {
            System.out.println("Die Pizza mit dem Durchmesser von " + d2 + "cm hat ein besseres Größen-/Preisverhältnis");
        }
        scanner.close();
    }
}
