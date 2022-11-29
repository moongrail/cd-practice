package day0;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Isogram {
    public static boolean  isIsogram(String str) {
        // ...
        String[] strings = str.toLowerCase().split("");
        Set<String> set = new HashSet<>();
        Collections.addAll(set, strings);
        return set.size() == strings.length;
    }
}
