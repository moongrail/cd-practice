package randomKata;

import java.util.stream.IntStream;

public class SmallestIntegerFinder {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7,-332};

        System.out.println(findSmallestInt(numbers));

    }
    public static int findSmallestInt(int[] args) {
        return IntStream.of(args).min().getAsInt();
    }
}
