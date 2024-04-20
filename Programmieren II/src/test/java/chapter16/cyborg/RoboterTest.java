package chapter16.cyborg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoboterTest {
    @Test
    public void testEntscheidung() {
        RoboterImpl roboter = new RoboterImpl();

        assertEquals(Entscheidung.RECHTS, roboter.entscheide(Gefahrensituationen.GEFAHR_LINKS));
        assertEquals(Entscheidung.LINKS, roboter.entscheide(Gefahrensituationen.GEFAHR_RECHTS));
        assertEquals(Entscheidung.BREMSEN, roboter.entscheide(Gefahrensituationen.GEFAHR_VORNE));
    }
}
