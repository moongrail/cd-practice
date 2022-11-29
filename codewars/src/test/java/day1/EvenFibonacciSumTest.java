package day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenFibonacciSumTest {
    @Test
    void fixedTests() {
        assertEquals(EvenFibonacciSum.fibonacci(2147483647), 1485607536);
        assertEquals(EvenFibonacciSum.fibonacci(1000000000), 350704366);
        assertEquals(EvenFibonacciSum.fibonacci(100000000), 82790070);
        assertEquals(EvenFibonacciSum.fibonacci(1000000), 1089154);
        assertEquals(EvenFibonacciSum.fibonacci(1000), 798);
        assertEquals(EvenFibonacciSum.fibonacci(100), 44);
        assertEquals(EvenFibonacciSum.fibonacci(5), 2);
        assertEquals(EvenFibonacciSum.fibonacci(8), 2);
        assertEquals(EvenFibonacciSum.fibonacci(10), 10);
        assertEquals(EvenFibonacciSum.fibonacci(1), 0);
    }
}