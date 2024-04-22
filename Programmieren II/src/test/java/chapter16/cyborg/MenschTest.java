package chapter16.cyborg;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MenschTest {
    MenschImpl mensch = new MenschImpl();

    @Test
    public void testEntscheidungLinks() {
        assertNotEquals(Entscheidung.RECHTS, mensch.entscheide(Gefahrensituationen.GEFAHR_RECHTS));
        assertNotEquals(Entscheidung.BREMSEN, mensch.entscheide(Gefahrensituationen.GEFAHR_RECHTS));
    }

    @Test
    public void testEntscheidungRechts() {
        assertNotEquals(Entscheidung.LINKS, mensch.entscheide(Gefahrensituationen.GEFAHR_LINKS));
        assertNotEquals(Entscheidung.BREMSEN, mensch.entscheide(Gefahrensituationen.GEFAHR_LINKS));
    }

    @Test
    public void testEntscheidungBremsen() {
        assertNotEquals(Entscheidung.RECHTS, mensch.entscheide(Gefahrensituationen.GEFAHR_VORNE));
        assertNotEquals(Entscheidung.LINKS, mensch.entscheide(Gefahrensituationen.GEFAHR_VORNE));
    }
}
