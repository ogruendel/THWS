package chapter3;

import java.util.Scanner;

public class Schaltjahr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ein Jahr eingeben:");
        int jahr = scanner.nextInt();

        if (jahr % 4 == 0) {
            if (jahr % 100 == 0) {
                if (jahr % 400 == 0) {
                    System.out.println("Schaltjahr: durch 4, 100 und 400 teilbar");
                } else {
                    System.out.println("Kein Schaltjahr: Durch 100 teilbar, aber nicht durch 400");
                }
            } else {
                System.out.println("Schaltjahr: durch 4 teilbar");
            }
        } else {
            System.out.println("Kein Schaltjahr: nicht durch 4 teilbar");
        }
        scanner.close();
    }
}
