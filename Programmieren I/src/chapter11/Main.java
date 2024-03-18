package chapter11;

public class Main {
    public static void main(String[] args) {
        // Ticker
        Ticker wetter = new Ticker(45);
        wetter.setNachricht("Wettervorhersage: Schnee in Wuerzburg".toCharArray());
        System.out.println(wetter.getNachricht());

        for (int i = 0; i < 14; i++) {
            wetter.rotateNachricht(1);
            System.out.println(wetter.getNachricht());
        }

        // Raumbelegung
        Raum raum = new Raum("H.1.1", 10, 10, false, 7);
        raum.betreteRaum(new Student("Test", 12345));
        System.out.println(raum.createCurrentRoomPlan(true));
    }
}
