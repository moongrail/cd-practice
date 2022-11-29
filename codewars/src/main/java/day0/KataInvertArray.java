package day0;

public class KataInvertArray {
    public static int[] invert(int[] array) {
        if (array.length == 0) {
            return new int[0];
        }else {
            for (int i = 0; i < array.length; i++) {
                    array[i] = array[i]*-1;
            }
        }
        return array;
    }
}
