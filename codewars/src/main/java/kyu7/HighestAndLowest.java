package kyu7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HighestAndLowest {
    public static String highAndLow(String numbers) {
        // Code here or
        List<Integer> collect = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .boxed()
                .collect(Collectors.toList());
        int min = collect.get(0);
        int max = collect.get(collect.size()-1);

        return max+" "+min;
    }
}
