package chapter9;


public class Main {
    public static void main(String[] args) {
        // Aufgabe 1
        Auto golf = new Auto("VW", "blau", 1500f);
        Auto a1 = new Auto("Audi", "gelb", 200f);
        Auto corsa = new Auto("Opel", "rot", 1200f);

        // Aufgabe 2
        Pizza margherita = new Pizza("Margherita", new int[]{33, 26}, new float[]{8.5f, 6.5f});
        Pizza salami = new Pizza("Salami", new int[]{33, 26}, new float[]{9.5f, 7.5f});
        Pizza hawaii = new Pizza("Hawaii", new int[]{33, 26}, new float[]{11f, 9f});
        Pizza calzone = new Pizza("Calzone", new int[]{33, 26}, new float[]{11f, 9f});
        Pizza formaggi = new Pizza("4 Formaggi", new int[]{33, 26}, new float[]{11f, 9f});

        Pizza[] pizzen = new Pizza[]{margherita, salami, hawaii, calzone, formaggi};

        Pizza bestePizza = new Pizza("", new int[]{1}, new float[]{99999f});
        for (int i = 0; i < pizzen.length; i++) {
            for (int j = 0; j < pizzen[i].durchmesser.length; j++) {
                if (pizzen[i].preisLeistung(pizzen[i].durchmesser[j], pizzen[i].preis[j]) > bestePizza.preisLeistung(bestePizza.durchmesser[0], bestePizza.preis[0])) {
                    bestePizza.name = pizzen[i].name;
                    bestePizza.durchmesser = new int[]{pizzen[i].durchmesser[j]};
                    bestePizza.preis = new float[]{pizzen[i].preis[j]};
                }
            }
        }

        System.out.println(bestePizza.name);
        System.out.println(bestePizza.durchmesser[0] + "cm");
        System.out.println(bestePizza.preis[0] + "€");
    }
}
