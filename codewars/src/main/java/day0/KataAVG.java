package day0;

import java.util.stream.IntStream;

public class KataAVG {
    public static double find_average(int[] array){
        if (array.length == 0){
            return 0;
        }
        return IntStream.of(array).average().getAsDouble();
    }
}
