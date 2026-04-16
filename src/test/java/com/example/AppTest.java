package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class AppTest {
    @Test
    public void testFibonacci() {
        App app = new App();
        // The first 5 terms of Fibonacci are 0, 1, 1, 2, 3
        List<Integer> expected = Arrays.asList(0, 1, 1, 2, 3);
        assertEquals(expected, app.generateFibonacci(5), "Fibonacci logic failed!");
    }
}