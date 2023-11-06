package chapter6;

import java.util.Scanner;

public class Primzahlen_Refactor {

    public static void main(String[] args) {
        // Chapter 4
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben sie eine Zahl ein:");
        int num = scanner.nextInt();

        if (prime(num)) {
            System.out.println(num + " ist eine Primzahl");
        } else {
            System.out.println(num + " ist keine Primzahl");
        }

        scanner.close();
    }

    public static boolean prime(int num) {
        boolean prime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }

        return prime;
    }
}
