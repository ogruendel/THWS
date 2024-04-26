package chapter17.verdoppeln;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/home/oliver/school/THWS/Programmieren II/src/main/java/chapter17/verdoppeln/test.txt");
        FileOutputStream fos1 = new FileOutputStream("file1.txt");
        FileOutputStream fos2 = new FileOutputStream("file2.txt");

        OutputStreamDoubler osd = new OutputStreamDoubler(fos1, fos2);
        int content;
        while ((content = fis.read()) != -1) {
            osd.write(content);
        }
        osd.close();
    }
}
