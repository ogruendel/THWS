package chapter8;

import java.util.Arrays;

public class StringMethoden {
    public static void main(String[] args) {
        System.out.println(deleteStartingSpace("    Ich gehe..."));
        System.out.println(deleteEndingSpace("... zum Essen!    "));
        System.out.println(deleteMultipleSpace("Ich   gehe morgen          mit   ..."));
        System.out.println(Arrays.toString(splitAtSpace("Ich gehe morgen mit meinen 11 Freund*innen zum Essen!")));

    }

    private static String deleteStartingSpace(String sentence) {
        if (sentence.charAt(0) == ' ') {
            return deleteStartingSpace(sentence.substring(1));
        } else return sentence;
    }

    private static String deleteEndingSpace(String sentence) {
        if (sentence.charAt(sentence.length() - 1) == ' ') {
            return deleteEndingSpace(sentence.substring(0, sentence.length() - 1));
        } else return sentence;
    }

    private static String deleteMultipleSpace(String sentence) {
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ' && sentence.charAt(i + 1) == ' ') {
                sentence = sentence.substring(0, i) + sentence.substring(i + 1);
                // Schiebt i wieder zurück auf das 'neue' erste Leerzeichen
                i--;
            }
        }
        return sentence;
    }

    private static String[] splitAtSpace(String input) {
        int spaces = 1;
        int previousIndex = 0;
        String[] output;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                spaces++;
            }
        }
        output = new String[spaces];

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                output[output.length - spaces] = input.substring(previousIndex, i);
                previousIndex = i + 1;
                spaces--;
            }
            output[output.length - 1] = input.substring(previousIndex);
        }

        return output;
    }

    // Wieso kein Regex ...
    private static String[] splitAtSpaceNoNonsense(String input) {
        return input.split("\\s");
    }
}
