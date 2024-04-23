package chapter17.exceptions;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionTest {
    Main main = new Main();

    @Test
    public void testNumberFormat() {
        assertThrows(
                NumberFormatException.class,
                () -> main.throwNumberFormat()
        );
    }

    @Test
    public void testArrayOutOfBounds() {
        assertThrows(
                ArrayIndexOutOfBoundsException.class,
                () -> main.throwIndexOutOfBounds()
        );
    }

    @Test
    public void testNullPointer() {
        assertThrows(
                NullPointerException.class,
                () -> main.throwNullPointer()
        );
    }

    @Test
    public void testOutOfMemory() {
        assertThrows(
                OutOfMemoryError.class,
                () -> main.throwOutOfMemory()
        );
    }

    @Test
    public void testFileNotFound() {
        assertThrows(
                FileNotFoundException.class,
                () -> main.throwFileNotFound()
        );
    }

    @Test
    public void testArithmetic() {
        assertThrows(
                ArithmeticException.class,
                () -> main.throwArithmetic()
        );
    }
}
