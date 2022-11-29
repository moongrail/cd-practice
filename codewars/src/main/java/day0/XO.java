package day0;

public class XO {
    public static boolean getXO(String str) {
        String lowerCase = str.toLowerCase();
        if (!lowerCase.contains("x") && !lowerCase.contains("o")) {
            return true;
        }
        else if (lowerCase.contains("x") && lowerCase.contains("o")) {
            int x = 0;
            int o = 0;
            for (int i = 0; i < str.length(); i++) {
                if (lowerCase.charAt(i) == 'o') {
                    o++;
                }
                if (lowerCase.charAt(i) == 'x') {
                    x++;
                }
            }
            return x == o;
        }
        return false;
    }
}
