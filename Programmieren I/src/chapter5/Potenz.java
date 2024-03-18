package chapter5;

import java.util.Scanner;

public class Potenz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben sie b (double) ein:");
        double b = scanner.nextDouble();
        System.out.println("Bitte geben sie n (int) ein:");
        int n = scanner.nextInt();
        double power = 1;
        int absN = n < 0 ? -1 * n : n;

        for (int i = 0; i < absN; i++) {
            power *= b;
        }

        if (n < 0) {
            power = 1 / power;
        }
        System.out.println(power);

        scanner.close();
    }
}
