package chapter18.touppercasewriter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToUpperCaseWriterTest {
    ToUpperCaseWriter writer;
    ByteArrayOutputStream baos;

    @BeforeEach
    public void prepareTest() {
    }

    @Test
    public void writeCharTest() {
        writeCharTestTemplate('a');
    }

    @Test
    public void writeCharTestWithNonChar() {
        writeCharTestTemplate('1');
    }

    @Test
    public void asciiTest() {
        for (char c = 0; c < 128; c++) {
                writeCharTestTemplate(c);
        }
    }

    private void writeCharTestTemplate(char c) {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             OutputStreamWriter osw = new OutputStreamWriter(baos);
             ToUpperCaseWriter writer = new ToUpperCaseWriter(osw);
        ) {
            // Setup
            this.writer = writer;
            this.baos = baos;

            this.writer.write(c);
            this.writer.flush();
            String uppercase = this.baos.toString();
            this.baos.reset();
            assertEquals(Character.toUpperCase(c), uppercase.charAt(0));
        } catch (IOException e) {
            fail("IOException" + e.getMessage());
        }
    }

    @AfterEach
    public void cleanUp() {
        try {
            writer.close();
            baos.close();
        } catch (IOException e) {
            fail("IOException" + e.getMessage());
        }
    }
}
