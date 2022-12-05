package kyu7;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class FindTheStrayNumber {
    static int stray(int[] numbers) {
        Map<Integer, Integer> fMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (!fMap.containsKey(numbers[i])) {
                fMap.put(numbers[i], 1);
            } else {
                fMap.put(numbers[i], fMap.get(numbers[i]) + 1);
            }
        }
        return fMap.entrySet().stream()
                .min(Map.Entry.comparingByValue(Integer::compareTo))
                .map(Map.Entry::getKey)
                .get();
    }
}
