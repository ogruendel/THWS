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

        if (n > 0) {
            do {
                power *= b;
                n--;
            } while (n > 0);
        } else if (n < 0) {
            do {
                power *= b;
                n++;
            } while (n < 0);
            power = 1 / power;
        }
        System.out.println(power);
    }
}
