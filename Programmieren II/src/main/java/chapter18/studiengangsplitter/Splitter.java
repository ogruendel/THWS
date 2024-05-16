package chapter18.studiengangsplitter;

import java.io.*;

public class Splitter {
    void splitStudiengaenge(String dateiname) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(dateiname))) {
            String read = bufferedReader.readLine();

            BufferedWriter bwWInf = new BufferedWriter(new FileWriter("Programmieren II/src/main/java/chapter18/studiengangsplitter/WInfNr.txt"));
            BufferedWriter bwInf = new BufferedWriter(new FileWriter("Programmieren II/src/main/java/chapter18/studiengangsplitter/InfNr.txt"));
            BufferedWriter bwEC = new BufferedWriter(new FileWriter("Programmieren II/src/main/java/chapter18/studiengangsplitter/ECNr.txt"));

            while (read != null) {
                int matrikelNr = Integer.parseInt(read);

                if (matrikelNr >= 5000000 && matrikelNr <= 5099999) {
                    // WInf
                    bwWInf.write(read);
                    bwWInf.newLine();
                } else if (matrikelNr >= 5100000 && matrikelNr <= 5199999) {
                    // Inf
                    bwInf.write(read);
                    bwInf.newLine();
                } else if (matrikelNr >= 6100000 && matrikelNr <= 6199999) {
                    // EC
                    bwEC.write(read);
                    bwEC.newLine();
                } else {
                    bwWInf.close();
                    bwInf.close();
                    bwEC.close();
                    bufferedReader.close();
                    throw new MatrikelNummerException();
                }

                read = bufferedReader.readLine();
            }
            bwWInf.close();
            bwInf.close();
            bwEC.close();
        }
    }
}
