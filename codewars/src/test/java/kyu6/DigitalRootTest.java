package kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitalRootTest {
    @Test
    public void Test1() {
        assertEquals( 7, DigitalRoot.digital_root(16));
    }
    @Test
    public void Test2() {
        assertEquals( 6, DigitalRoot.digital_root(456));
    }
}