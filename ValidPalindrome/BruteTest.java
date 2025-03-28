package ValidPalindrome;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class BruteTest {
    @Test
    public void validPalindromeTest() {
        assertEquals(true, Brute.validPalindrome("A man, a plan, a canal: Panama"));
    }
}
