package chapter7;

public class Eratosthenes {
    public static void main(String[] args) {
        int[] input = sieve(fillArray(20));

        showContent(input);
    }

    private static int[] fillArray(int cap) {
        int[] output = new int[cap];
        for (int i = 0; i < cap; i++) {
            output[i] = i + 1;
        }
        return output;
    }

    private static int[] sieve(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 1) {
                input[i] = -1;
            } else if (input[i] != -1) {
                for (int j = (i * 2) + 1; j < input.length; j += (i + 1)) {
                    input[j] = -1;
                }
            }
        }

        return input;
    }

    private static void showContent(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == -1) {
                System.out.println(i + 1 + " is not a prime number");
            } else {
                System.out.println(i + 1 + " is a prime number");
            }
        }
    }
}
