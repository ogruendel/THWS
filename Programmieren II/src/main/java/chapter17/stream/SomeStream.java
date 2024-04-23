package chapter17.stream;

import java.io.*;

public class SomeStream extends FileOutputStream {
    public SomeStream() throws FileNotFoundException {
        super("./target/stream");
    }

    public SomeStream(String name, boolean append) throws FileNotFoundException {
        super(name, append);
    }

    public SomeStream(File file) throws FileNotFoundException {
        super(file);
    }

    public SomeStream(File file, boolean append) throws FileNotFoundException {
        super(file, append);
    }

    public SomeStream(FileDescriptor fdObj) {
        super(fdObj);
    }

    public void write(byte[] b, int off, int len) throws IOException {
        if (off < 0 || off >= b.length - 1) {
            throw new IOException("Offset misses array");
        }
        if (len + off <= 0 || len + off > b.length) {
            throw new IOException("Length out of bounds");
        }
    }
}
