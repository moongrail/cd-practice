package day0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XOTest {
    @Test
    public void testSomething1() {
        assertEquals(true, XO.getXO("xxxooo"));
    }

    @Test
    public void testSomething2() {
        assertEquals(true, XO.getXO("xxxXooOo"));
    }

    @Test
    public void testSomething3() {
        assertEquals(false, XO.getXO("xxx23424esdsfvxXXOOooo"));
    }

    @Test
    public void testSomething4() {
        assertEquals(false, XO.getXO("xXxxoewrcoOoo"));
    }

    @Test
    public void testSomething5() {
        assertEquals(false, XO.getXO("XxxxooO"));
    }

    @Test
    public void testSomething6() {
        assertEquals(true, XO.getXO("zssddd"));
    }

    @Test
    public void testSomething7() {
        assertEquals(false, XO.getXO("Xxxxertr34"));
    }
    @Test
    public void testSomething8() {
        assertEquals(true, XO.getXO("xo xxoo"));
    }
    @Test
    public void testSomething9() {
        assertEquals(false, XO.getXO("xvxzvsas34543fso xhgfh[]xfoasofooooooo"));
    }
}