package chapter5;

import java.util.Scanner;

public class Pi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mit wie vielen Rechtecken soll PI angenähert werden?");
        int numOfRect = scanner.nextInt();

        double piApprox = 0;
        double x = 1;

        for (int i = 1; i <= numOfRect; i++) {
            // * 4, weil wir mit den Rechtecken nur ein Viertel eines Kreises annähern
            piApprox += (1.0 / numOfRect) * x * 4;

            // x ergibt sich immer aus dem Satz des Pythagoras vom Dreieck dessen Hypotenuse der Radius (1) ist, der bis zur oberen linken Ecke des i-ten Rechtecks zeigt
            x = Math.sqrt(1 - (i * (1.0 / numOfRect)) * (i * (1.0 / numOfRect)));
        }

        System.out.println("Angenähert: " + piApprox);
        System.out.println("Math.PI:\t" + Math.PI);
        System.out.println("Delta:\t\t" + (piApprox - Math.PI));

        scanner.close();
    }
}
