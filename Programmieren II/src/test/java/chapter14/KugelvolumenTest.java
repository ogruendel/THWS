package chapter14;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KugelvolumenTest {
    @Test
    public void testZero() {
        assertEquals(0, Kugelvolumen.berechneKugelvolumen(0));
    }
    @Test
    public void testPositive() {
        assertEquals(4.188790205, Kugelvolumen.berechneKugelvolumen(1), 0.01);
        assertEquals(523.598775598, Kugelvolumen.berechneKugelvolumen(5), 0.01);
    }
    @Test
    public void testNegative() {
        try {
            Kugelvolumen.berechneKugelvolumen(-1);
            fail("Runtime Exception expected");
        } catch (RuntimeException e){
            String error = e.getMessage();
            assertEquals(error, "Radius muss größer als 0 sein");
        }
    }
}
