package randomKata;

import java.util.Arrays;

public class ArrayMulti {
    public static void main(String[] args) {
        int[] arr = {-40, -3, -4, 0, 1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(multiplyArray(arr)));
    }

    private static int[] multiplyArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i];
        }

        return quickSort(array, 0, array.length - 1);
    }

    private static int[] quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivot = partition(array, low, high);
            quickSort(array, low, pivot - 1);
            quickSort(array, pivot + 1, high);
        }

        return array;
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}
