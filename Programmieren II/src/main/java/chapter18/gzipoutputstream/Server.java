package chapter18.gzipoutputstream;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.zip.GZIPInputStream;

public class Server {
    public static void main(String[] args) {
        final int PORT = 5555;

        try (ServerSocket socket = new ServerSocket(PORT);
             Socket client = socket.accept();
             InputStream is = client.getInputStream();
             GZIPInputStream gzipis = new GZIPInputStream(is)) {

            System.out.println(Arrays.toString(gzipis.readAllBytes()));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
