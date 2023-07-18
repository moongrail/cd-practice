package kyu8;

import java.util.Arrays;

public class ANeedleTheHaystack {
    public static String findNeedle(Object[] haystack) {
        return "found the needle at position " + Arrays.asList(haystack).indexOf("needle");
    }
}
