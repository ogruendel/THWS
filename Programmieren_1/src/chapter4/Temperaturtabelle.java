package chapter4;

import java.text.DecimalFormat;

public class Temperaturtabelle {
    public static void main(String[] args) {
        int max = 300;
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Fahrenheit\tCelsius");
        for (int fahrenheit = 0; fahrenheit <= max; fahrenheit++) {
            double celsius = (5.0/9.0) * (fahrenheit - 32);
            System.out.println(fahrenheit + "\t\t\t" + df.format(celsius));
        }
    }
}
