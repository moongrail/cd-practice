package kyu7;

public class JadenCasingStrings {
    public String toJadenCase(String phrase) {
        // TODO put your code below this comment
        if (phrase == null) return null;
        if (phrase.isEmpty()) return null;

        String[] s = phrase.split(" ");
        for (int i = 0; i < s.length; i++) {
            s[i] = s[i].substring(0, 1).toUpperCase() + s[i].substring(1);
        }
        return String.join(" ", s);
    }
}
