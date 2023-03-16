package kyu4;


import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsHelperTest {
    @Test
    public void testToRoman() throws Exception {
        assertThat("1 converts to 'I'", RomanNumeralsHelper.toRoman(1), is("I"));
        assertThat("2 converts to 'II'", RomanNumeralsHelper.toRoman(2), is("II"));
    }

    @Test
    public void testFromRoman() throws Exception {
        assertThat("'I' converts to 1", RomanNumeralsHelper.fromRoman("I"), is(1));
        assertThat("'II' converts to 2", RomanNumeralsHelper.fromRoman("II"), is(2));
        assertThat("'II' converts to 2", RomanNumeralsHelper.fromRoman("MDCLXVI"), is(1666));
    }
}