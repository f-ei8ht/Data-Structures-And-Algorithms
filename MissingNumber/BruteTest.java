package MissingNumber;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BruteTest {

    @Test
    public void missingTest() {
        int[] ar = { 0, 1 };
        assertEquals(2, Brute.missingNumber(ar));
    }
}
