package kyu6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindingArrowsInStringTest2 {

    @Test
    void testSearchArrows() {
        int result = FindingArrowsInString.searchArrows("string");
        Assertions.assertEquals(0, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme