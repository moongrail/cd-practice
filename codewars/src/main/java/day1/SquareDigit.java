package day1;

public class SquareDigit {
    public int squareDigits(int n) {
        // TODO Implement me
        if(n == 0) return 0;
        StringBuilder sb = new StringBuilder();
        String[] arrInt = String.valueOf(n).split("");
        for (String s: arrInt) {
            sb.append((int)(Math.pow(Integer.parseInt(s),2)));
        }
        return Integer.parseInt(sb.toString());
    }
}
