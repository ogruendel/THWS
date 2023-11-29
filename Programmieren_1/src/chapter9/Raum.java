package chapter9;

public class Raum {
    String name;
    int plaetze;
    boolean belegt;

    public Raum(String name, int plaetze, boolean belegt) {
        this.name = name;
        this.plaetze = plaetze;
        this.belegt = belegt;
    }

    public void setBelegt(boolean belegt) {
        this.belegt = belegt;
    }
}
