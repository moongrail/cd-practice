package kyu6;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindingArrowsInString {
    public static int searchArrows(String string) {
        if (string == null || string.length() == 0) return 0;
        int sum = 0;

        List<String> arForArrows = new ArrayList<>();
        String p = "<-+>|<=+>|<=+|<-+|=+>|-+>|<|>";

        Matcher m = Pattern.compile(p).matcher(string);
        while (m.find()) {
            arForArrows.add(m.group());
        }

        String p2 = "<-+>|<=+>|<.+>";
        Matcher m2 = Pattern.compile(p2).matcher(String.join("", arForArrows));
        while (m2.find()) {
            arForArrows.remove(m2.group());
        }
        if (arForArrows.isEmpty()) return 0;
        for (String v : arForArrows) {
            if (v.endsWith(">")) {
                if (v.startsWith("-")) {
                    sum += v.length();
                } else if (v.startsWith("=")) {
                    sum += v.length() * 2;
                } else {
                    sum++;
                }
            }
            if (v.startsWith("<")) {
                if (v.endsWith("-")) {
                    sum -= v.length();
                } else if (v.endsWith("=")) {
                    sum -= v.length() * 2;
                } else {
                    sum--;
                }
            }
        }
        return sum;
    }
}
