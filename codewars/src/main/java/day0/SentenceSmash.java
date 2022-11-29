package day0;

public class SentenceSmash {
    public static void main(String[] args) {
        String[] ar = {"hello", "world", "this", "is", "great"};
        String[] strings = {"Bilal", "Djaghout"};
        System.out.println(smash(strings));
        int i = 0;
    }

    public static String smash2(String... words) {
        // TODO Write your code below this comment please
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (words.length - 1 == i) {
                sb.append(words[i]);
            } else {
                sb.append(words[i] + " ");
            }

        }
        return String.valueOf(sb);
    }

    public static String smash(String... words) {
        // TODO Write your code below this comment please
        return String.join(" ", words);
    }
}
