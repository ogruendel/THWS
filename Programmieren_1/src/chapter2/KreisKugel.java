package chapter2;


public class KreisKugel {
    public static void main(String[] args) {
        int radius = 4;

        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        double volume = (4.0 / 3.0) * Math.PI * radius * radius * radius;


        System.out.println("Die Fläche des Kreises beträgt: " + area);
        System.out.println("Der Umfang des Kreises beträgt: " + circumference);
        System.out.println("Das Volumen der Kugel beträgt: " + volume);
    }
}
