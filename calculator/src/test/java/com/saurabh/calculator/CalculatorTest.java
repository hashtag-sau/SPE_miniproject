package com.saurabh.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testSquareRoot() {
        assertEquals(4.0, MathOperations.squareRoot(16), 0.0001);
    }

    @Test
    public void testFactorial() {
        assertEquals(120, MathOperations.factorial(5));
    }

    @Test
    public void testNaturalLog() {
        assertEquals(0, MathOperations.naturalLog(1), 0.0001);
    }

    @Test
    public void testPower() {
        assertEquals(8.0, MathOperations.power(2, 3), 0.0001);
    }
}
