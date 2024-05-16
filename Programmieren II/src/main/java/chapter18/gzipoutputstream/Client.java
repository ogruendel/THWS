package chapter18.gzipoutputstream;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.GZIPOutputStream;

public class Client {
    public static void main(String[] args) throws IOException {
        byte[] bytesToTransfer = "Hallo Welt\n".getBytes();
        try (Socket client = new Socket("localhost", 5555);
             OutputStream os = client.getOutputStream();
             GZIPOutputStream gzipos = new GZIPOutputStream(os)) {

            gzipos.write(bytesToTransfer);
        }
    }
}