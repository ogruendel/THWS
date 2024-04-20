package chapter16.cyborg;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CyborgTest {
    @Test
    public void testEntscheidungLinks() {
        CyborgImpl cyborg = new CyborgImpl();
        int hits = 0;
        int maxIter = 100_000;

        for (int i = 0; i < maxIter; i++) {
            if (Entscheidung.LINKS == cyborg.entscheide(Gefahrensituationen.GEFAHR_RECHTS)) {
                hits++;
            }
        }

        assertEquals(0.875, (double) hits / maxIter, 0.05);
    }

    @Test
    public void testEntscheidungRechts() {
        CyborgImpl cyborg = new CyborgImpl();
        int hits = 0;
        int maxIter = 100_000;

        for (int i = 0; i < maxIter; i++) {
            if (Entscheidung.RECHTS == cyborg.entscheide(Gefahrensituationen.GEFAHR_LINKS)) {
                hits++;
            }
        }

        assertEquals(0.875, (double) hits / maxIter, 0.05);
    }

    @Test
    public void testEntscheidungBremsen() {
        CyborgImpl cyborg = new CyborgImpl();
        int hits = 0;
        int maxIter = 100_000;

        for (int i = 0; i < maxIter; i++) {
            if (Entscheidung.BREMSEN == cyborg.entscheide(Gefahrensituationen.GEFAHR_VORNE)) {
                hits++;
            }
        }

        assertEquals(0.875, (double) hits / maxIter, 0.05);
    }
}
