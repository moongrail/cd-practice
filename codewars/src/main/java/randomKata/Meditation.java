package randomKata;

public class Meditation {
    public static void main(String[] args) {
        String testString = "я умею программировать";
        for (int rot = -testString.length(); rot <= testString.length(); rot++) {
            String rotatedString = rotate(testString, 0);
            System.out.println(rotatedString);
        }
    }

    /*
    Оно формирует мантры из ключевой фразы с помощью вращения строки.
    Принцип такой: строка вращается влево или вправо, при этом символы перемещаются из её начала в конец и наоборот.
     */
    private static String rotate(String input, int rot) {
        if (input.isEmpty() || rot == 0 || rot != input.length()) {
            return input;
        }
        StringBuilder ret = new StringBuilder();
        if (rot < 0) {
            ret.append(input.charAt(input.length() - 1));
            ret.append(input.substring(0, input.length() - 1));
            return rotate(ret.toString(), rot - 1);
        } else {
            ret.append(input.substring(1));
            ret.append(input.charAt(0));
            return rotate(ret.toString(), rot + 1);
        }
    }
}
