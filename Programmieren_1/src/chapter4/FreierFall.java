package chapter4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FreierFall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        final double G = 9.80665;

        System.out.println("Bitte geben sie eine maximale Falldauer in Sekunden ein:");
        int tMax = scanner.nextInt();

        /*for (int t = 1; t <= tMax; t++) {
            double s = 0.5 * G * t * t;
            System.out.println(t + "s: " + df.format(s) + "m");
        }*/

        for (int t = 1; t <= tMax; t = t + 5) {
                double s = 0.5 * G * t * t;
                System.out.println(t + "s: " + df.format(s) + "m");
        }

        scanner.close();
    }
}
