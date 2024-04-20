package chapter16.inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    @Test
    public void testStack() {
        StackImpl stack = new StackImpl();

        stack.push(1);
        assertEquals(1, stack.pop());

        stack.push("Hello");
        stack.push(null);

        assertNull(stack.pop());
        assertEquals("Hello", stack.pop());
    }

    @Test
    public void testException() {
        StackImpl stack = new StackImpl();

        assertThrows(
                IndexOutOfBoundsException.class,
                () -> stack.pop()
        );
    }
}
