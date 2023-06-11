package kyu6;

import java.util.Arrays;

public class AreTheyTheSame {
    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null) return false;
        if (a.length != b.length) return false;

        int[] intsA = Arrays.stream(a)
                .map(i -> i * i)
                .sorted()
                .toArray();

        int[] intsB = Arrays.stream(b)
                .sorted()
                .toArray();

        return Arrays.equals(intsA, intsB);
    }
}
