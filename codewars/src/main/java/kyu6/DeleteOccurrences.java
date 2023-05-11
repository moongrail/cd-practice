package kyu6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeleteOccurrences {
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        //Code here ;)
        if (maxOccurrences == 0){
            return new int[]{};
        }

        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> counterMap = new HashMap<>();

        for (int i = 0; i < elements.length; i++) {
            if (!counterMap.containsKey(elements[i]) ){
                counterMap.put(elements[i], counterMap.getOrDefault(elements[i], 0) + 1);
                result.add(elements[i]);
            } else if (counterMap.get(elements[i]) < maxOccurrences) {
                counterMap.put(elements[i], counterMap.getOrDefault(elements[i], 0) + 1);
                result.add(elements[i]);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
