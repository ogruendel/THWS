package chapter15.unternehmen;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AngestellterTest {
    @Test
    public void testAngestellter() {
        Angestellter angestellter = new Angestellter("Vorname", "Nachname", "A", 1000, "01.01.2000");
        assertEquals("Vorname", angestellter.vorname);
        assertEquals("Nachname", angestellter.nachname);
        assertEquals("A", angestellter.identifikator);
        assertEquals(1000, angestellter.grundgehalt);
        assertEquals(1, angestellter.gehaltsfaktor);
        assertEquals("01.01.2000", angestellter.geburtsdatum);
        assertEquals(1000, angestellter.gehalt);
    }
}
