package chapter7;

public class Sinus {
    public static void main(String[] args) {
        System.out.println(sinusApprox(3));
    }

    public static double sinusApprox(double x) {
        double sin = 0;
        double quotient = 1;
        for (int k = 0; quotient > 1E-5 || quotient < -1E-5; k++) {
            quotient = (power(x, ((2 * k) + 1))) / (fac((2 * k) + 1));
            sin += power(-1, k) * quotient;
        }

        return sin;
    }

    private static double power(double b, int e) {
        double power = 1;
        for (int i = 0; i < e; i++) {
            power *= b;
        }
        return power;
    }

    // 45 minuten Bug suchen ... 15! ist für Java int zu groß. Daher muss die Fakultät als long gespeichert werden
    private static long fac(int x) {
        long fac = 1;
        for (int i = x; i > 1; i--) {
            fac *= i;
        }
        return fac;
    }
}
