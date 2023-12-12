package chatper11;

public class Main {
    public static void main(String[] args) {
        Ticker wetter = new Ticker(45);
        wetter.setNachricht("Wettervorhersage: Schnee in Wuerzburg".toCharArray());
        System.out.println(wetter.getNachricht());

        for (int i = 0; i < 14; i++) {
            wetter.rotateNachricht(1);
            System.out.println(wetter.getNachricht());
        }
    }
}
