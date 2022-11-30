package randomKata;

public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        String[] split = name.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            if (i == 0) {
                sb.append(split[i].substring(0, 1).toUpperCase() + ".");
            } else {
                sb.append(split[i].substring(0, 1).toUpperCase());
            }
        }
        return sb.toString();
    }
}
