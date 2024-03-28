package chapter14;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StreckeTest {
    @Test
    public void aLessB() {
        Strecke strecke1 = new Strecke(1, 2);
        assert(strecke1.a < strecke1.b);

        Strecke strecke2 = new Strecke(2, 1);
        assert(strecke2.a < strecke2.b);

        Strecke strecke3 = new Strecke(1, 1);
        assert(strecke3.a < strecke2.b);
    }

    @Test
    public void intersects() {
        Strecke strecke1 = new Strecke(1, 3);
        Strecke strecke2 = new Strecke(2, 4);
        Strecke strecke3 = new Strecke(4, 5);

        assertTrue(Strecke.intersects(strecke1, strecke2));
        assertTrue(Strecke.intersects(strecke2, strecke1));
        assertTrue(Strecke.intersects(strecke1, strecke1));

        assertFalse(Strecke.intersects(strecke1, strecke3));
        assertFalse(Strecke.intersects(strecke3, strecke1));
        assertFalse(Strecke.intersects(strecke2, strecke3));
        assertFalse(Strecke.intersects(strecke3, strecke2));
    }

    @Test
    public void testToString() {
        Strecke strecke1 = new Strecke(3, 5);
        Strecke strecke2 = new Strecke(2, 8);
        Strecke strecke3 = new Strecke(4, 4);

        assertEquals(strecke1.toString(), "3--5");
        assertEquals(strecke2.toString(), "2------8");
        assertEquals(strecke3.toString(), "4");
    }
}
