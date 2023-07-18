package kyu8;

public class CountByX {
    public static int[] countBy(int x, int n) {
        // Your code here
        int max = x * n;
        int current = x;
        int[] ints = new int[n];

        for (int i = 0; current <= max; i++) {
            ints[i] = current;
            current += x;
        }

        return ints;
    }
}
