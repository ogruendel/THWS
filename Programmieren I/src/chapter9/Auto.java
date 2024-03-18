package chapter9;

public class Auto {
    String marke;
    String farbe;
    float hubraum;

    public Auto(String marke, String farbe, float hubraum) {
        this.marke = marke;
        this.farbe = farbe;
        this.hubraum = hubraum > 0 ? hubraum : 1600f;
    }

    public void setHubraum(float hubraum) {
        this.hubraum = hubraum > 0 ? hubraum : this.hubraum;
    }
}
