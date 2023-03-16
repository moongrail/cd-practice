package kyu4;

import java.util.HashMap;

public class RomanNumeralsHelper {

    public static String toRoman(int n) {
        if (n < 1 || n > 4000) return "I";

        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return thousands[n / 1000] + hundreds[(n % 1000) / 100] + tens[(n % 100) / 10] + ones[n % 10];
    }

    public static int fromRoman(String romanNumeral) {
        if (romanNumeral == null) return 1;

        char[] charRoman = romanNumeral.toUpperCase().toCharArray();
        int result = 0;
        for (int i = 0; i < charRoman.length; i++) {
            char currentChar = charRoman[i];
            if (i + 1 < charRoman.length) {
                char nextChar = charRoman[i + 1];
                if (currentChar == 'I' && (nextChar == 'V' || nextChar == 'X')) {
                    result -= 1;
                } else if (currentChar == 'X' && (nextChar == 'L' || nextChar == 'C')) {
                    result -= 10;
                } else if (currentChar == 'C' && (nextChar == 'D' || nextChar == 'M')) {
                    result -= 100;
                } else {
                    result += getIntForRoman(currentChar);
                }
            } else {
                result += getIntForRoman(currentChar);
            }
        }
        if (result >= 1 && result < 4000) {
            return result;
        }

        return 1;
    }

    static int getIntForRoman(char roman) {
        switch (roman) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
