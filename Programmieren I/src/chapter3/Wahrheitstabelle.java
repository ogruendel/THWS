package chapter3;

import java.util.Scanner;

public class Wahrheitstabelle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("char 1: (t oder f)");
        char c1 = scanner.nextLine().toLowerCase().charAt(0);

        System.out.println("char 2: (t oder f)");
        char c2 = scanner.nextLine().toLowerCase().charAt(0);

        if (c1 == 't' || c1 == 'f') {
            if (c2 == 't' || c2 == 'f') {
                if (c1 == 'f' && c2 == 'f') {
                    System.out.println(0);
                } else if (c1 == 'f') {
                    System.out.println(1);
                } else if (c2 == 'f') {
                    System.out.println(2);
                } else {
                    System.out.println(3);
                }
            } else {
                // System.out.println("char 2 ist nicht t oder f");
                throw new RuntimeException("char 2 ist nicht t oder f");
            }
        } else {
            // System.out.println("char 1 ist nicht t oder f");
            throw new RuntimeException("char 1 ist nicht t oder f");
        }
        scanner.close();
    }
}
