package chapter3;

import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int d1 = scanner.nextInt();
        float p1 = scanner.nextFloat();

        int d2 = scanner.nextInt();
        float p2 = scanner.nextFloat();

        float sizePerPrice1 = d1 / p1;
        float sizePerPrice2 = d2 / p2;


    }
}
