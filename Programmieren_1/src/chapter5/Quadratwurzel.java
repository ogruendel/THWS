package chapter5;

import java.util.Scanner;

public class Quadratwurzel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wurzel von:");
        int x = scanner.nextInt();

        double y = 1;

        for (int i = 0; i <= 10_000; i++) {
            y = ((x / y) + y) / 2;

            String delta = "Delta: " + Math.abs(Math.sqrt(x) - y) + "\n";

            if (i == 10) {
                System.out.println("Math.sqrt nach 10 Durchläufen: " + Math.sqrt(x));
                System.out.println("Annäherung nach 10 Durchläufen " + y);
                System.out.println(delta);

            } else if (i == 100) {
                System.out.println("Math.sqrt nach 100 Durchläufen: " + Math.sqrt(x));
                System.out.println("Annäherung nach 100 Durchläufen " + y);
                System.out.println(delta);

            } else if (i == 1000) {
                System.out.println("Math.sqrt nach 1000 Durchläufen: " + Math.sqrt(x));
                System.out.println("Annäherung nach 1000 Durchläufen " + y);
                System.out.println(delta);

            } else if (i == 10_000) {
                System.out.println("Math.sqrt nach 10000 Durchläufen: " + Math.sqrt(x));
                System.out.println("Annäherung nach 10000 Durchläufen " + y);
                System.out.println(delta);

            }
        }

        scanner.close();
    }
}
