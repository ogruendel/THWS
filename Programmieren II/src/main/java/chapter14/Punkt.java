package chapter14;

public class Punkt {
    int x;
    int y;

    public void verschiebePunkt(int zielX, int zielY) {
        if (zielX < 0 || zielX > 1920 || zielY < 0 || zielY > 1080) {
            throw new RuntimeException("Falsche Koordinaten");
        } else {
            x = zielX;
            y = zielY;
        }
    }
}
