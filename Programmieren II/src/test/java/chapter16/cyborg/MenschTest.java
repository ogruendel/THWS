package chapter16.cyborg;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MenschTest {
    @Test
    public void testEntscheidungLinks() {
        MenschImpl mensch = new MenschImpl();
        int hits = 0;
        int maxIter = 100_000;

        for (int i = 0; i < maxIter; i++) {
            if (Entscheidung.LINKS == mensch.entscheide(Gefahrensituationen.GEFAHR_RECHTS)) {
                hits++;
            }
        }

        assertEquals(0.75, (double) hits / maxIter, 0.05);
    }

    @Test
    public void testEntscheidungRechts() {
        MenschImpl mensch = new MenschImpl();
        int hits = 0;
        int maxIter = 100_000;

        for (int i = 0; i < maxIter; i++) {
            if (Entscheidung.RECHTS == mensch.entscheide(Gefahrensituationen.GEFAHR_LINKS)) {
                hits++;
            }
        }

        assertEquals(0.75, (double) hits / maxIter, 0.05);
    }

    @Test
    public void testEntscheidungBremsen() {
        MenschImpl mensch = new MenschImpl();
        int hits = 0;
        int maxIter = 100_000;

        for (int i = 0; i < maxIter; i++) {
            if (Entscheidung.BREMSEN == mensch.entscheide(Gefahrensituationen.GEFAHR_VORNE)) {
                hits++;
            }
        }

        assertEquals(0.75, (double) hits / maxIter, 0.05);
    }
}
