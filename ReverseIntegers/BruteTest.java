package ReverseIntegers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class BruteTest {

    @Test
    public void reverseTest() {
        assertEquals(-321, Brute.reverse(-123));
    }
}
