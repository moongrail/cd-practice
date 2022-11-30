package day1;

import java.util.HashMap;
import java.util.Map;

public class FindTheOddInt {
    public static int findIt(int[] a) {
        Map<Integer, Integer> findOdd = new HashMap<>();
        for (int num : a) {
            if (!findOdd.containsKey(num)) {
                findOdd.put(num, 1);
            } else {
                findOdd.put(num, findOdd.get(num) + 1);
            }
        }
        return findOdd.entrySet().stream()
                .filter(entry -> entry.getValue() % 2 !=0)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
    }
}
