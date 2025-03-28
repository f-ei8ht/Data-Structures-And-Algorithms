package pow;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class BruteTest {
    @Test
    public void powTest() {
        assertEquals(0.25000, Brute.myPow(2.00000, -2));
    }
}
