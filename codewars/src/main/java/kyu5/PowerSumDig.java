package kyu5;

import java.util.*;

public class PowerSumDig {
    /**
     * The number 81 has a special property, a certain power of the sum of its digits
     * is equal to 81 (nine squared). Eighty one (81), is the first number in having
     * this property (not considering numbers of one digit). The next one, is 512.
     * Let's see both cases with the details
     * <p>
     * 8 + 1 = 9 and 9^2 = 81
     * 512 = 5 + 1 + 2 = 8 and 8^3 = 512
     * <p>
     * We need to make a function that receives a number
     * as argument n and returns the n-th term of this sequence of numbers.
     * n
     */
    public static long powerSumDigTerm(int n) {
        if (n == 0) return 0;
        // your code
        int start = 2;
        int pow = 2;
        long tempNum = 0;
        Map<Integer, Long> map = new HashMap<>();
        List<Long> result = new ArrayList<>();
        for (int i = start; i < 81; i++) {
            for (int j = pow; j < 25; j++) {
                tempNum = (long) Math.pow(i, j);
                String[] split = String.valueOf(tempNum).split("");
                boolean b = (long) Math.pow(Arrays.stream(split)
                        .mapToLong(l -> Long.parseLong(l))
                        .sum(), j)
                        == tempNum;
                if (b) {
                    if (!result.contains(tempNum)) {
                        result.add(tempNum);
                    }
                }
            }
        }
        result.sort(Comparator.naturalOrder());
        for (int i = 0; i < result.size(); i++) {
            map.put(i + 1, result.get(i));
        }
        return map.get(n);
    }
}
