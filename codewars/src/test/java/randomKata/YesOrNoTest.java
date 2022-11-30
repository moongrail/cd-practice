package randomKata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YesOrNoTest {
    @Test
    public void testBoolToWord() {
        assertEquals(YesOrNo.boolToWord(true),"Yes");
        assertEquals(YesOrNo.boolToWord(false),"No");
    }
}