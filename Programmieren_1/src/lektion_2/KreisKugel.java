package lektion_2;


public class KreisKugel {
    public static void main(String[] args) {
        int radius = 4;
        double area = Math.PI * radius * radius;
        double circumference = Math.PI * 2 * radius;

        System.out.println("Die Fläche des Kreises beträgt: " + area);
        System.out.println("Der Umfang des Kreises beträgt: " + circumference);

        double volume = (4.0 / 3.0) * Math.PI * radius * radius * radius;

        System.out.println("Das Volumen der Kugel beträgt: " + volume);
    }
}
