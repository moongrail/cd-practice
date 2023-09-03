package day1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 2, 3, 5, 6, 76, 8, 9, 1, 0};
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
