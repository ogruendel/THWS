package chapter10;

public class AutoFabrik {
    private int zaehler;

    public AutoFabrik(int zaehler) {
        this.zaehler = zaehler;
    }

    public Auto produziere(String marke, String farbe, float hubraum) {
        zaehler++;
        return new Auto(marke, farbe, hubraum);
    }

    public int getZaehler() {
        return zaehler;
    }

    public void setZaehler(int zaehler) {
        this.zaehler = zaehler;
    }
}
