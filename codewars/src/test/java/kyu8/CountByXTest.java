package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountByXTest {
    @Test
    public void fixedTests() {
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10}, CountByX.countBy(1,10));
        assertArrayEquals(new int[] {2,4,6,8,10}, CountByX.countBy(2,5));
        assertArrayEquals(new int[] {3,6,9,12,15,18,21}, CountByX.countBy(3,7));
        assertArrayEquals(new int[] {50,100,150,200,250}, CountByX.countBy(50,5));
        assertArrayEquals(new int[] {100,200,300,400,500,600}, CountByX.countBy(100,6));
    }

}