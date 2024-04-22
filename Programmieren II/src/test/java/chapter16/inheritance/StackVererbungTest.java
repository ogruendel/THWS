package chapter16.inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackVererbungTest {
    @Test
    public void testStack() {
        StackVererbung stack = new StackVererbung();

        stack.push("Hello World");
        assertEquals("Hello World", stack.pop());
    }

    @Test
    public void testEmpty() {
        StackVererbung stack = new StackVererbung();

        assertThrows(
                IndexOutOfBoundsException.class,
                () -> stack.pop()
        );
    }
}
