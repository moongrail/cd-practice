package day0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CenturyTest {
    @Test
    public void FixedTests() {
        assertEquals(18, Century.century(1705));
        assertEquals(19, Century.century(1900));
        assertEquals(17, Century.century(1601));
        assertEquals(20, Century.century(2000));
        assertEquals(1,  Century.century(89));
    }
}