package randomKata;

import java.util.stream.IntStream;

public class KataBoolean {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        // Your code here
        double averageClassPoints = IntStream.of(classPoints).average().getAsDouble();
        return yourPoints > averageClassPoints;
    }
}
