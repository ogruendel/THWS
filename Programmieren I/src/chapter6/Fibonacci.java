package chapter6;

public class Fibonacci {
    // Fibonacci n = 10: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    public static void main(String[] args) {
        for (int n = 1; n <= 25; n++) {
            System.out.println(fibonacci(n - 1));
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
