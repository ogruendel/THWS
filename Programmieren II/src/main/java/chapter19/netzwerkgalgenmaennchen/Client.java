package chapter19.netzwerkgalgenmaennchen;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static GameInfo send(char data) {
        final int PORT = 80;
        final String HOST = "localhost";

        GameInfo gameInfo = null;

        try (Socket socket = new Socket(HOST, PORT);
             OutputStream os = socket.getOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(os);
             ObjectInputStream ois = new ObjectInputStream(socket.getInputStream())) {

            oos.writeObject(data);

            gameInfo = (GameInfo) ois.readObject();

            System.out.println(gameInfo.getWord());
            System.out.println("Buchstabe richtig: " + gameInfo.isHit());
            System.out.println("Wort erraten: " + gameInfo.isGuessed());
            System.out.println("Spiel vorbei: " + gameInfo.isDone());

        } catch (Exception e) {
            e.printStackTrace();
        }

        return gameInfo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            char data = scanner.nextLine().charAt(0);
            GameInfo gameInfo = send(data);

            if (gameInfo.isDone()) {
                break;
            }
        }
    }
}
