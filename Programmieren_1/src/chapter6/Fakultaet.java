package chapter6;

import java.util.Scanner;

public class Fakultaet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fakultät von: ");
        System.out.println(factorial(scanner.nextInt()));

        scanner.close();
    }

    public static long factorial(int x) {
        if (x > 20) {
            throw new RuntimeException("Die gewählte Zahl ist zu groß");
        }
        long factorial = 1;
        for (int i = 1; i <= x; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
