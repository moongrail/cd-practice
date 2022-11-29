package day0;

import java.util.Set;
import java.util.TreeSet;

public class TwoToOne {
    public static void main(String[] args) {
        System.out.println(longest("aretheyhere","yestheyarehere"));
    }
    public static String longest (String s1, String s2) {
        Set<String> characterSet = new TreeSet<>();
        for (Character c : s1.toCharArray()) {
            characterSet.add(String.valueOf(c));
        }
        for (Character c : s2.toCharArray()) {
            characterSet.add(String.valueOf(c));
        }
        return String.join("", characterSet);
    }
}
