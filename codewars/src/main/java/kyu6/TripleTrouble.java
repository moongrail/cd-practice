package kyu6;

public class TripleTrouble {
    public static int tripleDouble(long num1, long num2) {
        //code me ^^
        String str1 = String.valueOf(num1);
        String str2 = String.valueOf(num2);

        for (int i = 0; i < str1.length() - 2; i++) {
            char c = str1.charAt(i);
            if (c == str1.charAt(i + 1) && c == str1.charAt(i + 2)) {
                if (str2.contains(c + String.valueOf(c))) {
                    return 1;
                }
            }
        }

        return 0;
    }
}
