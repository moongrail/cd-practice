package randomKata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataMakeNegativeArrayTest {
    @Test
    public void test1() {
        assertEquals(-42, KataMakeNegativeArray.makeNegative(42));
    }
}