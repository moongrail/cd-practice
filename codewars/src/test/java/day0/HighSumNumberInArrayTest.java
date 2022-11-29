package day0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class HighSumNumberInArrayTest {
    @Test
    public void BasicTests() {
        assertEquals(26, HighSumNumberInArray.sum(new int[] { 6, 2, -600, 8, 10,10}));
    }
}