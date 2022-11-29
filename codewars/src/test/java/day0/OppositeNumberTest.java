package day0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OppositeNumberTest {
    @Test
    public void tests() {
        assertEquals(-1, OppositeNumber.opposite(1));
        assertEquals(25, OppositeNumber.opposite(-25));
    }
}