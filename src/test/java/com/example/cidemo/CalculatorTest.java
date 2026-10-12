package com.example.cidemo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testAddition() {
        int result = 5 + 3;
        assertEquals(8, result);
    }

    @Test
    void testMultiplication() {
        int result = 4 * 5;
        assertEquals(20, result);
    }
}