package day1;

import java.util.ArrayList;
import java.util.List;

public class EvenFibonacciSum {
    public static long fibonacci(long max) {
        // Your code goes here
        if (max == 0) return 0;
        if (max == 1) return 0;
        List<Long> collect = new ArrayList<>();
        collect.add(0L);
        collect.add(1L);
        for (int i = 1; max-1 >= (collect.get(i)+ collect.get(i-1)); i++) {
            collect.add(collect.get(i)+ collect.get(i-1));
        }
        return collect.stream()
                .filter( v -> v%2 == 0)
                .mapToLong(Long::longValue)
                .sum();
    }
}
