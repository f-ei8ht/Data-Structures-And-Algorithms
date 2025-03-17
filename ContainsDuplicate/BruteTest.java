package ContainsDuplicate;

import static ContainsDuplicate.Brute.containsDuplicate;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class BruteTest {

    @Test
    public void containsDuplicateTest() {
        int[] arr = { 1, 2, 3, 1 };
        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        assertEquals(true, containsDuplicate(arr));
        assertEquals(false, containsDuplicate(arr1));
        assertEquals(true, containsDuplicate(arr2));
    }
}
