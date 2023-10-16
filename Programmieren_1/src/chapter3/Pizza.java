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

        float sizePerPrice1 = d1 / p1;
        float sizePerPrice2 = d2 / p2;

        if (sizePerPrice1 > sizePerPrice2) {
            System.out.println("Die Pizza mit dem Durchmesser von " + d1 + "cm hat ein besseres Größen-/Preisverhältnis");
        } else {
            System.out.println("Die Pizza mit dem Durchmesser von " + d2 + "cm hat ein besseres Größen-/Preisverhältnis");
        }
    }
}
