package chapter6;

public class Runden {
    public static void main(String[] args) {
        System.out.println(round2(3.141592, 3));
    }

    public static int round(double x) {
        if (x % (int) x < 0.5) {
            return (int) x;
        } else return (int) x + 1;
    }

    public static double round2(double x, int kommaStellen) {
        int divisor = 10;
        for (int i = 1; i < kommaStellen; i++) {
            divisor *= 10;
        }

        x *= divisor;
        x = round(x);
        x /= divisor;

        return x;
    }
}
