package chapter17.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public void throwNumberFormat() {
        Integer.valueOf("test");
    }

    public void throwIndexOutOfBounds() {
        int i = new int[]{1, 2}[3];
    }

    public void throwNullPointer() {
        Array.getLength(null);
    }

    public void throwOutOfMemory() {
        List<byte[]> list = new ArrayList<>();
        while (true) {
            byte[] b = new byte[1048576];
            list.add(b);
        }
    }

    public void throwFileNotFound() throws FileNotFoundException {
        File file = new File("./nonexistent.txt");
        FileInputStream fis = new FileInputStream(file);
    }

    public void throwArithmetic() {
        int i = 1 / 0;
    }
}
