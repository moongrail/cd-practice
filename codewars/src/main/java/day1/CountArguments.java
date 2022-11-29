package day1;

import java.util.stream.Stream;

public class CountArguments {
    public static int countArgs(Object... args) {
        return (int) Stream.of(args).count();
    }
}
