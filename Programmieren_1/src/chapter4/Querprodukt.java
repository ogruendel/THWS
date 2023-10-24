package chapter4;

import java.util.Scanner;

public class Querprodukt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean validNum = false;
        int querProdukt = 1;


        while (!validNum) {
            System.out.println("Geben Sie bitte eine Zahl ein:");
            int num = scanner.nextInt();
            if (num >= 1 && num <= 1_000_000) {
                while (num > 0) {
                    querProdukt = querProdukt * (num % 10);
                    num = num / 10;
                }
                validNum = true;
            } else {
                System.out.println("FEHLER - Zahl ist ungültig");
            }
        }
        System.out.println("Querprodukt: " + querProdukt);
    }
}
