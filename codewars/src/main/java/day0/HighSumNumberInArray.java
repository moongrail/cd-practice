package day0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HighSumNumberInArray {
    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length == 0 || numbers.length == 1) {
            return 0;
        }
        int max = IntStream.of(numbers).max().getAsInt();
        int min = IntStream.of(numbers).min().getAsInt();
        int count = 0;

        List<Integer> collect = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        for (int i = 0; i < collect.size(); i++) {
            if (collect.get(i) == min) {
                collect.remove(i);
            }
        }
        for (int i = 0; i < collect.size(); i++) {
            if (collect.get(i) == max && count < 1) {
                collect.remove(i);
                count++;
            }
        }
        return collect.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
