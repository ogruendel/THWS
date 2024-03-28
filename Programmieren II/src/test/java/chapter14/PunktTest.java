package chapter14;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PunktTest {
    @Test
    public void testLowerX() {
        try {
            Punkt punkt = new Punkt();
            punkt.x = 0;
            punkt.y = 0;

            punkt.verschiebePunkt(-1, 0);
            fail("Runtime Exception expected");
        } catch (RuntimeException e) {
            String msg = e.getMessage();
            assertEquals("Falsche Koordinaten", msg);
        }
    }

    @Test
    public void testLowerY() {
        try {
            Punkt punkt = new Punkt();
            punkt.x = 0;
            punkt.y = 0;

            punkt.verschiebePunkt(0, -1);
            fail("Runtime Exception expected");
        } catch (RuntimeException e) {
            String msg = e.getMessage();
            assertEquals("Falsche Koordinaten", msg);
        }
    }

    @Test
    public void testUpperX() {
        try {
            Punkt punkt = new Punkt();
            punkt.x = 0;
            punkt.y = 0;

            punkt.verschiebePunkt(1921, 0);
            fail("Runtime Exception expected");
        } catch (RuntimeException e) {
            String msg = e.getMessage();
            assertEquals("Falsche Koordinaten", msg);
        }
    }

    @Test
    public void testUpperY() {
        try {
            Punkt punkt = new Punkt();
            punkt.x = 0;
            punkt.y = 0;

            punkt.verschiebePunkt(0, 1081);
            fail("Runtime Exception expected");
        } catch (RuntimeException e) {
            String msg = e.getMessage();
            assertEquals("Falsche Koordinaten", msg);
        }
    }

    @Test
    public void testX() {
        try {
            Punkt punkt = new Punkt();
            punkt.x = 0;
            punkt.y = 0;

            punkt.verschiebePunkt(1920, 0);
            punkt.verschiebePunkt(0, 0);
        } catch (RuntimeException ignored) {
            fail("No Runtime Exception expected");
        }
    }

    @Test
    public void testY() {
        try {
            Punkt punkt = new Punkt();
            punkt.x = 0;
            punkt.y = 0;

            punkt.verschiebePunkt(0, 1080);
            punkt.verschiebePunkt(0, 0);
        } catch (RuntimeException ignored) {
            fail("No Runtime Exception expected");
        }
    }
}
