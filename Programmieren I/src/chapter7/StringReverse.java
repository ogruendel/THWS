package chapter7;

public class StringReverse {
    public static void main(String[] args) {
        String input = "Übung Programmieren I";

        System.out.println(reverse(input));
    }

    private static String reverse(String inputS) {
        char[] input = inputS.toCharArray();
        char[] output = new char[input.length];

        for (int i = input.length; i > 0; i--) {
            output[i - 1] = input[input.length - i];
        }
        
        return (new String(output));
    }
}
