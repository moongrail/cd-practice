package kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreTheyTheSameTest {
    @Test
    public void test1() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertEquals(true, AreTheyTheSame.comp(a, b));
    }

    @Test
    public void test2() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19};
        assertEquals(true, AreTheyTheSame.comp(a, b));
    }

    @Test
    public void test31() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{132, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertEquals(false, AreTheyTheSame.comp(a, b));
    }

    @Test
    public void test4() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 36100, 25921, 361, 20736, 361};
        assertEquals(false, AreTheyTheSame.comp(a, b));
    }
}