package day1;

import java.util.HashMap;
import java.util.Map;

public class FindTheOddInt {
    public static int findIt(int[] a) {
        HashMap<Integer, Integer> findOdd = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (!findOdd.containsKey(a[i])) {
                findOdd.put(a[i], 1);
            } else {
                findOdd.put(a[i], findOdd.get(a[i]) + 1);
            }
        }
        return findOdd.entrySet().stream()
                .filter(entry -> entry.getValue() % 2 !=0)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
    }
}
