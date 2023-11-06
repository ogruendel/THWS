package chapter5;

public class Reihenwert {
    public static void main(String[] args) {
        final double CUTOFF = 1E-5;
        double deltaSum;
        double prev = 0;

        int k = 1;
        double sum = 0;

        do {
            sum += 1.0 / (k * k);

            deltaSum = Math.abs(prev - sum);
            prev = sum;

            System.out.println(6 * sum);
            k++;
        } while (deltaSum >= CUTOFF);
    }

    /*
    zu c:
          Wenn der Faktor 6 mit in der Summe steht, dann wird jeder einzelne Term 1 / k² versechsfacht.
          Steht der Faktor 6 vor der Summe, wird das Endergebnis versechsfacht.
            → Es macht keinen Unterschied, da man die sechs ausklammern kann.
     */
}
