package randomKata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinLengthWordTest {
    @Test
    public void findShort() throws Exception {
        assertEquals(3, MinLengthWord.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, MinLengthWord.findShort("turns out random test cases are easier than writing out basic ones"));
        assertEquals(2, MinLengthWord.findShort("Let's travel abroad shall we"));
    }

}