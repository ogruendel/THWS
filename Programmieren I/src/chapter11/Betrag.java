package chapter11;

public class Betrag {
    public static int abs(int x) {
        return x < 0 ? x * -1 : x;
    }
    public static float abs(float x) {
        return x < 0 ? x * -1 : x;
    }

    public static double abs(double x) {
        return x < 0 ? x * -1 : x;
    }

    public static short abs(short x) {
        return x < 0 ? (short) (x * -1) : x;
    }

    public static long abs(long x) {
        return x < 0 ? x * -1 : x;
    }
}
