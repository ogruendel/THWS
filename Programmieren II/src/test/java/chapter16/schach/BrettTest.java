package chapter16.schach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BrettTest {
    @Test
    public void testKombiniere() {
        Brett brett1 = new LaeuferImpl(4, 5).gibErlaubteFelder();
        Brett brett2 = new LaeuferImpl(5, 3).gibErlaubteFelder();
        Brett kombiniert = brett1.kombiniere(brett2);

        int[][] coords = {
                {3, 1}, {4, 2}, {6, 4}, {7, 5}, {8, 6},
                {7, 1}, {6, 2}, {4, 4}, {3, 5}, {2, 6}, {1, 7},
                {1, 2}, {2, 3}, {3, 4}, {5, 6}, {6, 7}, {7, 8},
                {8, 1}, {7, 2}, {6, 3}, {5, 4}, {3, 6}, {2, 7}, {1, 8},
                {4, 5}, {5, 3}
        };

        Brett expected = new Brett();
        for (int i = 0; i < coords.length; i++) {
            expected.markiereFeld(coords[i][0], coords[i][1]);
        }

        for (int x = 1; x < 8; x++) {
            for (int y = 1; y < 8; y++) {
                assertEquals(expected.gibFeld(x, y), kombiniert.gibFeld(x, y));
            }
        }
    }
}
