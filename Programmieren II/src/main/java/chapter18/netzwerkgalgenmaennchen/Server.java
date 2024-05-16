package chapter18.netzwerkgalgenmaennchen;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        final int PORT = 80;

        String word = chooseWord();
        String gameWord = hideWord(word);
        int tries = 0;

        try (ServerSocket socket = new ServerSocket(PORT)) {
            System.out.println("Server running on port" + PORT);
            while (!solved(gameWord) && tries <= 15) {
                System.out.println(gameWord);
                Socket client = socket.accept();
                BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));

                String data = br.readLine();
                if (data != null) {
                    gameWord = buildWord(word, gameWord, data.charAt(0));
                    tries++;
                }
            }

            if (solved(gameWord)) {
                System.out.println("Das Wort war " + word + " und du hast es nach " + tries + " Versuchen erraten.");
            } else {
                System.out.println("Das Wort war " + word + " aber du hast es nicht erraten können.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String chooseWord() {
        String[] dictionary = {"Programmiersprache", "Integer", "String", "Float", "Klasse", "Methode", "Algorithmus", "Datenbank"};
        int random = (int) (Math.random() * dictionary.length);
        return dictionary[random].toUpperCase();
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
