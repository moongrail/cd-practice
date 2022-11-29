package day0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWords {
    public static String reverseWords(final String original) {
        // Have at it
        if (original.matches("\\s{2,}")){
            return original;
        }
        List<StringBuilder> collect = Arrays.stream(original.split(" "))
                .map(StringBuilder::new)
                .map(StringBuilder::reverse).collect(Collectors.toList());
        return String.join(" ", collect);
    }
}
