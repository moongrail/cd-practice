package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheStrayNumberTest {

    @Test
    public void simpleArray1() {
        assertEquals(2, getActualFor(1, 1, 2));
    }

    private int getActualFor(int... numbers) {
        return FindTheStrayNumber.stray(numbers);
    }
}