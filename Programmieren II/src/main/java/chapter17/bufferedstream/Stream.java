package chapter17.bufferedstream;


import java.io.*;
import java.util.Scanner;

public class Stream {
    public static void copyUnbuffered(String path) throws FileNotFoundException {
        try(FileInputStream fis = new FileInputStream(path)) {
            FileOutputStream fos = new FileOutputStream("target/unbufferedOutput");
            int content;

            while ((content = fis.read()) != -1) {
                fos.write(content);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void copyBuffered(String path) throws FileNotFoundException {
        try(FileInputStream fis = new FileInputStream(path)) {
            FileOutputStream fos = new FileOutputStream("target/bufferedOutput");
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            int content;

            do {
                content = fis.read();
                fos.write(content);
            } while (content != -1);

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void copyUnbufferedArray(String path) throws FileNotFoundException {
        try(FileInputStream fis = new FileInputStream(path)) {
            FileOutputStream fos = new FileOutputStream("target/unbufferedArrayOutput");
            byte[] contents;

            while ((contents = fis.readNBytes(1024)).length > 0) {
                fos.write(contents);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Path:");
        String path = scanner.nextLine();
        scanner.close();
        long current;

        current = System.currentTimeMillis();
        copyUnbuffered(path);
        System.out.println("Unbuffered: " + (System.currentTimeMillis() - current) + "ms");

        current = System.currentTimeMillis();
        copyBuffered(path);
        System.out.println("Unbuffered Array: " + (System.currentTimeMillis() - current) + "ms");

        current = System.currentTimeMillis();
        copyUnbufferedArray(path);
        System.out.println("Unbuffered Array: " + (System.currentTimeMillis() - current) + "ms");
    }
}
