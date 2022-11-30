package randomKata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareArraySumTest {
    @Test
    public void testBasic()
    {
        assertEquals(9, SquareArraySum.squareSum(new int[] {1,2,2}));
        assertEquals(5, SquareArraySum.squareSum(new int[] {1,2}));
        assertEquals(50, SquareArraySum.squareSum(new int[] {5,-3,4}));
        assertEquals(0, SquareArraySum.squareSum(new int[] {}));
    }
}