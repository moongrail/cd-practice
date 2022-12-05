package kyu6;

public class DigitalRoot {
    public static int digital_root(int n) {
//        int sum = getSum(n);
        while (n > 9) {
            n = n / 10 + n % 10;
//            sum = getSum(sum);
        }
        return n;
    }
// old resolve version
//    private static int getSum(int n) {
//        String[] s1 = String.valueOf(n).split("");
//        int sum = 0;
//        for (String str : s1) {
//            sum += Integer.parseInt(str);
//        }
//        return sum;
//    }
}
