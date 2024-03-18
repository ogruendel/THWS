package chapter14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @Test
    public void testLowerFirstname() {
        try {
            Person person = new Person("oliver", "Gründel", "Straße", "1", 12345, "Würzburg");
            fail("Runtime Exception expected");
        } catch (RuntimeException e) {
            String msg = e.getMessage();
            assertEquals(msg, "Vorname muss mit einem Großbuchstaben beginnen");
        }
    }

    @Test
    public void testLowerSurname() {
        try {
            Person person = new Person("Oliver", "gründel", "Straße", "1", 12345, "Würzburg");
            fail("Runtime Exception expected");
        } catch (RuntimeException e) {
            String msg = e.getMessage();
            assertEquals(msg, "Nachname muss mit einem Großbuchstaben beginnen");
        }
    }

    @Test
    public void testLowerCity() {
        try {
            Person person = new Person("Oliver", "Gründel", "Straße", "1", 12345, "würzburg");
            fail("Runtime Exception expected");
        } catch (RuntimeException e) {
            String msg = e.getMessage();
            assertEquals(msg, "Ort muss mit einem Großbuchstaben beginnen");
        }
    }

    @Test
    public void testNumber() {
        try {
            Person person = new Person("Oliver", "Gründel", "Straße", "a1", 12345, "Würzburg");
            fail("Runtime Exception expected");
        } catch (RuntimeException e) {
            String msg = e.getMessage();
            assertEquals(msg, "Hausnummer muss mit einer Ziffer beginnen");
        }
    }

    @Test
    public void testPassingPerson() {
        try {
            Person person = new Person("Oliver", "Gründel", "Straße", "1", 12345, "Würzburg");
        } catch (RuntimeException ignored) {
            fail("No Runtime Exception expected");
        }
    }
}
