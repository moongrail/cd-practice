package randomKata;

public class Meditation {
    public static void main(String[] args) {
        String testString = "я умею программировать";
        for (int rot = -testString.length(); rot <= testString.length(); rot++) {
            String rotatedString = rotate(testString, rot);
            System.out.println(rotatedString);
        }
    }

    private static String rotate(String input, int rot) {
        if (rot == 0) {
            return input;
        }

        rot = rot % input.length();

        StringBuilder ret = new StringBuilder();

        if (rot < 0) {
            ret.append(input.substring(-rot));
            ret.append(input, 0, -rot);
        } else {
            ret.append(input.substring(input.length() - rot));
            ret.append(input, 0, input.length() - rot);
        }

        return ret.toString();
    }
}
