package chapter8;

import java.util.Scanner;

public class Galgenmaennchen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dictionary = {"Programmiersprache", "Integer", "String", "Float", "Klasse", "Methode", "Algorithmus", "Datenbank"};
        String word = chooseWord(dictionary);
        String gameWord = hideWord(word);
        int tries = 1;

        while (!solved(gameWord) && tries <= 15) {
            System.out.println(tries + ". Versuch: " + gameWord);
            char c = scanner.nextLine().charAt(0);
            gameWord = buildWord(word, gameWord, c);
            tries++;
        }

        if (solved(gameWord)) {
            System.out.println("Das Wort war " + word + " und du hast es nach " + tries + " Versuchen erraten.");
        } else {
            System.out.println("Das Wort war " + word + " aber du hast es nicht erraten können.");
        }

        scanner.close();
    }

    private static String chooseWord(String[] input) {
        int random = (int) (Math.random() * input.length);
        return input[random].toUpperCase();
    }

    private static String buildWord(String solution, String gameWord, char c) {
        char[] charOutput = gameWord.toCharArray();
        // wandelt jeden char in einen Großbuchstaben um
        char normalizedChar = String.valueOf(c).toUpperCase().charAt(0);

        for (int i = 0; i < solution.length(); i++) {
            if (solution.charAt(i) == normalizedChar){
                charOutput[i] = normalizedChar;
            }
        }
        return new String(charOutput);
    }

    private static String hideWord(String word) {
        char[] charOutput = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            charOutput[i] = '_';
        }
        return new String(charOutput);
    }

    private static boolean solved(String word) {
        return word.indexOf('_') < 0;
    }
}
