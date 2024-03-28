package chapter15.unternehmen;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbteilungsleiterTest {

    @Test
    public void testAbteilungsleiter() {
        Abteilungsleiter abteilungsleiter = new Abteilungsleiter("Vorname", "Nachname", "A", 1000, "01.01.2000");
        assertEquals("Vorname", abteilungsleiter.vorname);
        assertEquals("Nachname", abteilungsleiter.nachname);
        assertEquals("A", abteilungsleiter.identifikator);
        assertEquals(1000, abteilungsleiter.grundgehalt);
        assertEquals(2, abteilungsleiter.gehaltsfaktor);
        assertEquals("01.01.2000", abteilungsleiter.geburtsdatum);
        assertEquals(2000, abteilungsleiter.gehalt);
    }

    @Test
    public void testBefoerdern() {
        Angestellter angestellter = new Angestellter("Vorname", "Nachname", "A", 1000, "01.01.2000");
        Abteilungsleiter abteilungsleiter = new Abteilungsleiter("Vorname", "Nachname", "B", 1000, "01.01.2000");

        // Angestellter
        assertEquals("Vorname", angestellter.vorname);
        assertEquals("Nachname", angestellter.nachname);
        assertEquals("A", angestellter.identifikator);
        assertEquals(1000, angestellter.grundgehalt);
        assertEquals(1, angestellter.gehaltsfaktor);
        assertEquals("01.01.2000", angestellter.geburtsdatum);
        assertEquals(1000, angestellter.gehalt);

        // Abteilungsleiter
        assertEquals("Vorname", abteilungsleiter.vorname);
        assertEquals("Nachname", abteilungsleiter.nachname);
        assertEquals("B", abteilungsleiter.identifikator);
        assertEquals(1000, abteilungsleiter.grundgehalt);
        assertEquals(2, abteilungsleiter.gehaltsfaktor);
        assertEquals("01.01.2000", abteilungsleiter.geburtsdatum);
        assertEquals(2000, abteilungsleiter.gehalt);

        abteilungsleiter.befoerdern(angestellter);
        assertEquals(1.1, angestellter.gehaltsfaktor, 0.01);
        assertEquals(1100, angestellter.gehalt, 0.01);

        abteilungsleiter.befoerdern(angestellter);
        assertEquals(1.21, angestellter.gehaltsfaktor, 0.01);
        assertEquals(1210, angestellter.gehalt, 0.01);
    }
}
