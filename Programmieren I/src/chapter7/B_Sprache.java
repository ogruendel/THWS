package chapter7;

public class B_Sprache {
    public static void main(String[] args) {
        String input = "spiel mit mir";

        System.out.println(spielen(input));
    }

    private static String spielen(String input) {

        char[] charA = input.toCharArray();
        int umlaute = 0;
        for (char c : charA) {
            switch (c) {
                case 65, 69, 73, 79, 85, 97, 101, 105, 111, 117 -> umlaute++;
            }
        }

        char[] output = new char[charA.length + umlaute];

        int indexOutput = 0;

        for (char c : charA) {
            switch (c) {
                case 65, 69, 73, 79, 85, 97, 101, 105, 111, 117 -> {
                    output[indexOutput] = c;
                    output[indexOutput + 1] = 'b';
                    indexOutput++;
                }
                default -> output[indexOutput] = c;
            }
            indexOutput++;
        }

        return String.valueOf(output);
    }
}
