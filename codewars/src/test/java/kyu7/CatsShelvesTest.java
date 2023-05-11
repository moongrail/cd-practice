package kyu7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatsShelvesTest {
    @Test
    @DisplayName("Test case in description")
    void sampleTest() {
        assertEquals(2, CatsShelves.solution(1, 5));
    }
}