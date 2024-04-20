package chapter16.muenzautomat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LargestChangeCalculatorTest {
    LargestChangeCalculator lcc = new LargestChangeCalculator();
    int[] change;

    @Test
    public void testEuros() {
        change = lcc.getChange(5, 0);
        runEuroTest(new int[]{1, 2});

        change = lcc.getChange(10, 0);
        runEuroTest(new int[]{0, 5});

        change = lcc.getChange(1, 0);
        runEuroTest(new int[]{1, 0});

        change = lcc.getChange(0, 0);
        runEuroTest(new int[]{0, 0});
    }

    @Test
    public void testCents() {
        change = lcc.getChange(0, 50);
        runCentTest(new int[]{0, 0, 0, 0, 0, 1});

        change = lcc.getChange(0, 70);
        runCentTest(new int[]{0, 0, 0, 0, 1, 1});

        change = lcc.getChange(0, 83);
        runCentTest(new int[]{1, 1, 0, 1, 1, 1});

        change = lcc.getChange(0, 98);
        runCentTest(new int[]{1, 1, 1, 0, 2, 1});
    }

    @Test
    public void testLCC() {
        change = lcc.getChange(7, 74);
    }

    private void runEuroTest(int[] expected) {
        for (int i = 0; i < 2; i++) {
            assertEquals(expected[i], change[6 + i]);
        }
    }

    private void runCentTest(int[] expected) {
        for (int i = 0; i < 6; i++) {
            assertEquals(expected[i], change[i]);
        }
    }
}
