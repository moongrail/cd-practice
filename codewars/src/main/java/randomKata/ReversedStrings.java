package randomKata;

public class ReversedStrings {
    public static void main(String[] args) {
        System.out.println(solution("world"));
    }

    public static String solution(String str) {
        // Your code here...
        StringBuilder sb = new StringBuilder();
        return String.valueOf(sb.append(str).reverse());
    }
}
