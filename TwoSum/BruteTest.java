package TwoSum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class BruteTest {

    @Test
    public void twoSumTest() {
        int[] expected = { 0, 1 };
        int[] arr = { 2, 7, 11, 5 };
        assertArrayEquals(expected, Brute.twoSum(arr, 9));
    }
}
