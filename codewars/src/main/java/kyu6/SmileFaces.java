package kyu6;

import java.util.List;

public class SmileFaces {
    public static int countSmileys(List<String> arr) {
        // Just Smile :)
        return (int) arr.stream().filter(x -> x.matches("[:;][-~]?[)D]")).count();
    }
}
