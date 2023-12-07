package chapter9;

public class Raum {
    private final String name;
    private final int plaetze;
<<<<<<< HEAD
    private boolean belegt;
=======
    boolean belegt;
>>>>>>> origin/master

    public Raum(String name, int plaetze, boolean belegt) {
        this.name = name;
        this.plaetze = plaetze;
        this.belegt = belegt;
    }

    public boolean getBelegt() {
        return this.belegt;
    }
    public void setBelegt(boolean belegt) {
        this.belegt = belegt;
    }

    public int getPlaetze() {
        return plaetze;
    }

    public String getName() {
        return name;
    }
}
