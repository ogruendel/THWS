package chapter7;

public class Buchstaben {
    public static void main(String[] args) {
        char[] input = {'a', 'b', 'C', 'd'};

        System.out.println(inGrossbuchstaben(input));
    }

    private static char[] inGrossbuchstaben(char[] input) {
        char[] output = new char[input.length];
        char c;
        for (int i = 0; i < input.length; i++) {
            if (input[i] >= 97 && input[i] <= 122) {
                c = (char) (input[i] - 32);
            } else {
                c = input[i];
            }
            output[i] = c;
        }
    return output;
    }
}
