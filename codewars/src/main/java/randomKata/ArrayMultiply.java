package randomKata;

import java.util.Arrays;

public class ArrayMultiply {
    public static void main(String[] args) {
        int[] arrayFirst = {1, 2, 4, -5, 7, 6};
        int[] arraySecond = {1, 2, 4, 5, 7};

        System.out.println(Arrays.toString(arrayMultiply(arrayFirst, arraySecond)));
    }

    private static int[] arrayMultiply(int[] array1, int[] array2) {
        if (array1.length == 0 || array2.length == 0) return new int[]{};
        int lengthResult = Math.max(array1.length, array2.length);

        int[] result = new int[lengthResult];

        for (int i = 0; i < lengthResult; i++) {
            if (array1.length <= i) {
                result[i] = array2[i];
            } else if (array2.length <= i) {
                result[i] = array1[i];
            } else {
                result[i] = array1[i] * array2[i];
            }
        }

        return result;
    }
}
