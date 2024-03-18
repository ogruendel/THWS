package chapter11;

public class ZeilenMaxima {
    public static double[] zeilenMaxima(double[][] input) {
        double[] output = new double[input.length];
        for (int i = 0; i < input.length; i++) {
            double max = 0;
            for (int j = 0; j < input[i].length; j++) {
                max = max < input[i][j] ? input[i][j] : max;
            }
            output[i] = max;
        }

        return output;
    }
}
