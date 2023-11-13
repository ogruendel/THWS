package chapter7;

import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wie groß ist ihre Messreihe?");
        int size = scanner.nextInt();
        double[] input = new double[size];
        double num;

        if (size <= 0) throw new RuntimeException("Die Messreihe muss größer als 0 sein");

        System.out.println("Geben sie ihre Messwerte ein:");
        for (int i = 0; i < size; i++) {
            System.out.print(i + 1 + ". Wert:\t");
            num = scanner.nextDouble();
            input[i] = num;
        }


        System.out.println("Mittelwert:\t\t\t\t" + mean(input));
        System.out.println("Standardabweichung:\t\t" + stdDeviation(input));
        System.out.println("Maximalwert:\t\t\t" + max(input));
        System.out.println("Minimalwert:\t\t\t" + min(input));

    }

    /**
     * @return Mean of an Array
     */
    private static double mean(double[] input) {
        double sum = 0;

        for (double num : input) {
            sum += num;
        }

        return sum / input.length;
    }


    /**
     * @return Standard Deviation of an Array
     */
    private static double stdDeviation(double[] input) {
        double sum = 0;

        for (double num : input) {
            sum += (num - mean(input)) * (num - mean(input));
        }

        return Math.sqrt(sum / input.length);
    }

    /**
     * @return Maximum value of an Array
     */
    private static double max(double[] input) {
        double max = 0;
        for (double num : input) {
            if (num > max) max = num;
        }
        return max;
    }

    /**
     * @return Minimum value of an Array
     */
    private static double min(double[] input) {
        double min = input[0];
        for (double num : input) {
            if (num < min) min = num;
        }
        return min;
    }
}
