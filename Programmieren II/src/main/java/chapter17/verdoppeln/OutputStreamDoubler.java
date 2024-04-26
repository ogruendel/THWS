package chapter17.verdoppeln;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDoubler extends OutputStream {
    OutputStream os1;
    OutputStream os2;
    public OutputStreamDoubler(OutputStream os1, OutputStream os2) {
        this.os1 = os1;
        this.os2 = os2;
    }
    @Override
    public void write(int b) throws IOException {
        try {
            os1.write(b);
        } catch (IOException e) {
            System.out.println(e);
        }
        try {
            os2.write(b);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    @Override
    public void close() throws IOException {
        try {
            os1.close();
        } catch (IOException e) {
            throw new IOException("Stream 1 konnte nicht geschlossen werden");
        }
        try {
            os2.close();
        } catch (IOException e) {
            throw new IOException("Stream 2 konnte nicht geschlossen werden");
        }
    }
}
