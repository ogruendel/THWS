package chapter18.studiengangsplitter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Splitter splitter = new Splitter();
        try {
            splitter.splitStudiengaenge("Programmieren II/src/main/java/chapter18/studiengangsplitter/MatrNr.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
