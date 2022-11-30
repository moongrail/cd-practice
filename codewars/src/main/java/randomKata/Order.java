package randomKata;

import java.util.Map;
import java.util.TreeMap;

public class Order {
    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));
    }
    public static String order(String words) {
        if (words == null || words.length() == 0){
            return "";
        }

        String[] split = words.split(" ");
        Map<Integer,String> mapWords = new TreeMap<>();

        for (String s : split) {
            String key = s.replaceAll("[^\\d]", "");
            mapWords.put(Integer.valueOf(key), s);
        }
        return String.join(" ", mapWords.values());
    }
}
