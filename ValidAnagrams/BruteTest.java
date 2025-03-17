package ValidAnagrams;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class BruteTest {

    @Test
    public void isAnagramTest() {
        assertEquals(true, Brute.isAnagram("anagram", "naagram"));
    }
}
