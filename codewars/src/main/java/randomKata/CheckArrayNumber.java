package randomKata;

import java.util.Arrays;
import java.util.function.Predicate;

public class CheckArrayNumber {
    public static boolean check(Object[] a, Object x) {

        return Arrays.stream(a)
                .anyMatch(Predicate.isEqual(x));
    }
}
