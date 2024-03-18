package chapter14;

public class Strecke {
    int a;
    int b;

    public Strecke(int a, int b) {
        if (a < b) {
            this.a = a;
            this.b = b;
        } else {
            this.a = b;
            this.b = a;
        }
    }

    public static boolean intersects(Strecke strecke1, Strecke strecke2) {
        if (strecke1.b > strecke2.a) {
            return strecke1.a < strecke2.b;
        }
        return false;
    }

    public String toString() {
        String out = Integer.toString(a);
        if (a != b) {
            for (int i = b - a; i > 0; i--) {
                out += "-";
            }
            out += b;
        }
        return out;
    }
}
