package kyu8;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YouCantCodeUnderPressureTest {
    @Test
    public final void test_all() {
        Assert.assertEquals( "Nope!" , 4, YouCantCodeUnderPressure.doubleInteger(2)); // Test cases here!
    }
}