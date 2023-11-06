package chapter6;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben sie eine Basis ein:");
        int b = scanner.nextInt();
        System.out.println("Bitte geben sie einen Exponenten ein:");
        int n = scanner.nextInt();

        System.out.println(xPowN(b, n));

        scanner.close();
    }

    public static int xPowN(int b, int n) {
        if (n == 0) {
            return 1;
        } else {
            return b * xPowN(b, n - 1);
        }
    }
}
