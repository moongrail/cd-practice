package kyu6;

import java.util.HashMap;
import java.util.Map;

public class CountTheNumberOfDuplicates {
    public static int duplicateCount(String text) {
        // Write your code here
        if (text == null || text.isEmpty()) return 0;


        String[] split = text.toLowerCase().split("");
        Map<String, Integer> countCharMap = new HashMap<>();

        for (String s : split) {
            if (countCharMap.containsKey(s)) {
                countCharMap.put(s, countCharMap.get(s) + 1);
            } else {
                countCharMap.put(s, 0);
            }
        }

        long count = countCharMap.values().stream()
                .mapToInt(Integer::intValue)
                .filter(i -> i >= 1)
                .count();

        return (int) count;
    }
}