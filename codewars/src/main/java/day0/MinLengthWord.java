package day0;

import java.util.Arrays;

public class MinLengthWord {
    public static int findShort(String s) {
        String[] strings = s.split(" ");
        return Arrays.asList(strings).stream()
                .map(String::length)
                .mapToInt(Integer::intValue)
                .min().getAsInt();
    }
}
