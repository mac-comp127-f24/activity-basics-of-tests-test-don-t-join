package testingbasics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OddEvenHelperTest {
    @Test
    void evenNumbers() {
        assertEquals(true, OddEvenHelper.isEven(24));
        assertEquals(false, OddEvenHelper.isOdd(24));
    }

    @Test
    void oddNumbers() {
        assertEquals(false, OddEvenHelper.isEven(17));
        assertEquals(true, OddEvenHelper.isOdd(17));
    }

    @Test
    void zero() {
        assertEquals(true, OddEvenHelper.isEven(0));
    }
}
