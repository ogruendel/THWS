package chapter16.cyborg;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CyborgTest {
    CyborgImpl cyborg = new CyborgImpl();
    @Test
    public void testEntscheidungLinks() {
        assertNotEquals(Entscheidung.RECHTS, cyborg.entscheide(Gefahrensituationen.GEFAHR_RECHTS));
        assertNotEquals(Entscheidung.BREMSEN, cyborg.entscheide(Gefahrensituationen.GEFAHR_RECHTS));
    }

    @Test
    public void testEntscheidungRechts() {
        assertNotEquals(Entscheidung.LINKS, cyborg.entscheide(Gefahrensituationen.GEFAHR_LINKS));
        assertNotEquals(Entscheidung.BREMSEN, cyborg.entscheide(Gefahrensituationen.GEFAHR_LINKS));
    }

    @Test
    public void testEntscheidungBremsen() {
        assertNotEquals(Entscheidung.RECHTS, cyborg.entscheide(Gefahrensituationen.GEFAHR_VORNE));
        assertNotEquals(Entscheidung.LINKS, cyborg.entscheide(Gefahrensituationen.GEFAHR_VORNE));
    }
}
