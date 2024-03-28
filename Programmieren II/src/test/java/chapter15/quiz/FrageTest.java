package chapter15.quiz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FrageTest {
    @Test
    public void testTextfrage() {
        Frage frage = new TextFrage("Was ist die Hauptstadt von Deutschland?");

        frage.printFrage();
    }

    @Test
    public void testMultipleChoice() {
        Frage frage = new MultipleChoiceFrage("Wie viele Protonen hat ein Wasserstoff-Atom?", new String[]{"0", "1", "2", "3"});

        frage.printFrage();
    }
}
