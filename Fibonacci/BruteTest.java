package Fibonacci;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BruteTest {

    @Test
    public void fibTest() {
        assertEquals(13, Brute.fib(7));
    }
}
