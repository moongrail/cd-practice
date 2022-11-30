package kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindingArrowsInStringTest {
    @Test

    void testExample() {
        assertEquals(1, FindingArrowsInString.searchArrows(">."));
        assertEquals(-3, FindingArrowsInString.searchArrows("<--.."));
        assertEquals(-2, FindingArrowsInString.searchArrows("><=><--"));
        assertEquals(11, FindingArrowsInString.searchArrows(">===>->"));
        assertEquals(0, FindingArrowsInString.searchArrows("......"));
        assertEquals(0, FindingArrowsInString.searchArrows("<-->"));
        assertEquals(3, FindingArrowsInString.searchArrows("-->"));
        assertEquals(1, FindingArrowsInString.searchArrows(">"));
        assertEquals(7, FindingArrowsInString.searchArrows("<...><...------>.....<===>>"));
    }
}