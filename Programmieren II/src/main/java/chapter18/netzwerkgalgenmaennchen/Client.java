package chapter18.netzwerkgalgenmaennchen;

import java.io.*;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

public class Client {
    public static void send(String data) {
        final int PORT = 80;
        final String HOST = "localhost";

        try (Socket socket = new Socket(HOST, PORT);
             OutputStream os = socket.getOutputStream()) {

            os.write(data.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String data = scanner.nextLine();
            send(data);
        }
    }
}
