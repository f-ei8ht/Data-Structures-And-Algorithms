package ConcatenationOfArray;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class BruteTest {

    @Test
    public void getConcatenationTest() {
        int[] expected = { 1, 2, 1, 1, 2, 1 };
        int[] actual = { 1, 2, 1 };
        assertArrayEquals(expected, Brute.getConcatenation(actual));
    }
}
