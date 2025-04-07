import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class BruteTest {
    @Test
    public void plusOneTest() {
        int arr[] = { 9 };
        int expected[] = { 1, 0 };
        assertArrayEquals(expected, Brute.plusOne(arr));

    }
}
