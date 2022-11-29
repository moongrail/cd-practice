package day0;

import java.util.Arrays;

public class CountPositiveSumNegative {
    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0];
        }
        int sum = Arrays.stream(input)
                .filter(i -> i < 0)
                .sum();
        int count = (int) Arrays.stream(input)
                .filter(i -> i > 0)
                .count();
        return new int[]{count,sum} ; //return an array with count of positives and sum of negatives
    }
}
