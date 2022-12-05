package kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplesOfThreeOrFiveTest {
    @Test
    public void test() {
        assertEquals(23, new MultiplesOfThreeOrFive().solution(10));
    }
}