package day0;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class HighestScoringWord {
    public static String high(String s) {
        // Your code here...
        String[] splitWord = s.split(" ");
        Map<Character, Integer> alphabet = alphabet();
        Map<Integer, String> statWordsSum = new TreeMap<>();

        for (int i = 0; i < splitWord.length; i++) {
            int sum = 0;
            for (int j = 0; j < splitWord[i].length(); j++) {
                sum = sum + alphabet.get(splitWord[i].charAt(j));
            }
            if (!statWordsSum.containsKey(sum)){
                statWordsSum.put(sum,splitWord[i]);
            }
        }
        int i = statWordsSum.keySet().stream().max(Comparator.naturalOrder()).get();
        return statWordsSum.get(i);
    }
    static Map<Character,Integer> alphabet(){
        Map<Character,Integer> map = new TreeMap<>();
        int i = 1;
        while (i<27){
            map.put((char)(96 + i),i);
            i++;
        }
        return map;
    }
}
