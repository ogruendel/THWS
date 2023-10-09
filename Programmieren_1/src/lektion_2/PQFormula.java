package lektion_2;

public class PQFormula {
    public static void main(String[] args) {
        float p = 3f;
        float q = 1f;

        float wurzel = (p / 2f) * (p / 2f) - q;

        if (wurzel < 0) {
            System.out.println("Keine Lösung! (Negative Zahl unter der Wurzel)");
        } else {
            double x1 = -(p / 2f) + Math.sqrt(wurzel);
            double x2 = -(p / 2f) - Math.sqrt(wurzel);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
