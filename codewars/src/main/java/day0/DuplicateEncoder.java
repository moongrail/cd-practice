package day0;

public class DuplicateEncoder {
    static String encode(String word) {
        String[] splitChar = word.toLowerCase().split("");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < splitChar.length; i++) {
            if (isSymbolHaveDuplicates(splitChar, splitChar[i])) {
                sb.append(")");
            } else {
                sb.append("(");
            }
        }
        return sb.toString();
    }

    static boolean isSymbolHaveDuplicates(String[] wordArray, String symbol) {
        int count = 0;
        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i].equals(symbol)) {
                count++;
            }
        }
        return count > 1;
    }
}
