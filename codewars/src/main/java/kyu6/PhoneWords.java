package kyu6;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneWords {
    public static String phoneWords(String str) {
        // 416666663105558822255
        if (str == null || str.length() == 0) return "";

        Map<String, String> phoneMap = createPhoneMap();
        StringBuilder sb = new StringBuilder();
        String p = "1|2{1,3}|3{1,3}|4{1,3}|5{1,3}|6{1,3}|7{1,4}|8{1,3}|9{1,4}|0";
        List<String> codeChar = new ArrayList<>();
        Matcher m = Pattern.compile(p).matcher(str);
        while (m.find()) {
            codeChar.add(m.group());
        }
        for (String s : codeChar) {
            sb.append(phoneMap.get(s));
        }
        return sb.toString();
    }

    static Map<String, String> createPhoneMap() {
        Map<String, String> alphabetPhone = new HashMap<>();
        alphabetPhone.put("0", " ");
        alphabetPhone.put("*", "+");
        alphabetPhone.put("1", "");

        for (int i = 97; i < 123; i++) {
            for (int j = 2; j < 10; j++) {
                if (j == 7 || j == 9) {
                    alphabetPhone.put(String.valueOf(j), Character.toString(i++));
                    alphabetPhone.put(String.format(("%d%d"), j, j), Character.toString(i++));
                    alphabetPhone.put(String.format(("%d%d%d"), j, j, j)
                            , Character.toString(i++));
                    alphabetPhone.put(String.format(("%d%d%d%d"), j, j, j, j)
                            , Character.toString(i++));
                } else {
                    alphabetPhone.put(String.valueOf(j), Character.toString(i++));
                    alphabetPhone.put(String.format(("%d%d"), j, j)
                            , Character.toString(i++));
                    alphabetPhone.put(String.format(("%d%d%d"), j, j, j)
                            , Character.toString(i++));
                }
            }
        }
        return alphabetPhone;
    }
}