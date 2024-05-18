package chapter19.netzwerkgalgenmaennchen;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        final int PORT = 80;

        String word = chooseWord();
        String gameWord = hideWord(word);
        String previousWord = gameWord;
        int tries = 1;

        try (ServerSocket socket = new ServerSocket(PORT)) {
            while (!solved(gameWord)) {
                Socket client = socket.accept();

                ObjectOutputStream oos = new ObjectOutputStream(client.getOutputStream());
                ObjectInputStream ois = new ObjectInputStream(client.getInputStream());

                GameInfo gameInfo = new GameInfo();

                char guess = (char) ois.readObject();

                gameWord = buildWord(word, gameWord, guess);
                gameInfo.setWord(gameWord);

                gameInfo.setHit(!previousWord.equals(gameWord));
                previousWord = gameWord;

                if (!solved(gameWord) && tries < 15) {
                    gameInfo.setGuessed(false);
                    gameInfo.setDone(false);

                    oos.writeObject(gameInfo);
                } else if (solved(gameWord)) {
                    // Wort erraten
                    gameInfo.setGuessed(true);
                    gameInfo.setDone(true);

                    oos.writeObject(gameInfo);
                    break;
                } else {
                    // Wort nicht erraten
                    gameInfo.setGuessed(false);
                    gameInfo.setDone(true);

                    oos.writeObject(gameInfo);
                    break;
                }

                tries++;
            }
        } catch (Exception e) {
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
