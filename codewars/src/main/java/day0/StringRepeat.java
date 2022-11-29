package day0;

public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            sb.append(string);
        }

        return sb.toString();
    }
}
