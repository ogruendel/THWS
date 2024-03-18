package chapter13;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double berechneAbstand() {
        return Math.sqrt((x * x) + (y * y) + (z * z));
    }

    public String toString() {
        return "x=" + this.x + ", y=" + this.y + ", z=" + this.z;
    }
}
