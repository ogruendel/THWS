package chapter9;

public class Pizza {
    String name;
    int[] durchmesser;
    float[] preis;

    public Pizza(String name, int[] durchmesser, float[] preis) {
        this.name = name;
        this.durchmesser = durchmesser;
        this.preis = preis;
    }

    public float preisLeistung(int durchmesser, float preis) {
        return durchmesser / preis;
    }
}
