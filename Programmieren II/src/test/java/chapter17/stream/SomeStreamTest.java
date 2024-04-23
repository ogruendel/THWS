package chapter17.stream;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.IOException;


public class SomeStreamTest {
    @Test
    public void testWrite() {
        try {
            SomeStream stream = new SomeStream();
            stream.write(new byte[4], 0, 1);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testOffOutOfBounds() {
        try {
            SomeStream stream = new SomeStream();
            stream.write(new byte[4], 4, 1);

            fail("Exception Expected");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            assertEquals(e.getMessage(), "Offset misses array");
        }
    }

    @Test
    public void testLengthTooLong() {
        try {
            SomeStream stream = new SomeStream();
            stream.write(new byte[4], 0, 5);

            fail("Exception Expected");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            assertEquals(e.getMessage(), "Length out of bounds");
        }
    }
}
