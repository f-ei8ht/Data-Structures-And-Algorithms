package Palindrome;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BruteTest {

    @Test
    public void isPalindromeTest() {
        assertEquals(121, Brute.isPalindrome(121));
    }
}
