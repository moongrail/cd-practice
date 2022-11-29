package day1;

import java.util.ArrayList;
import java.util.List;

public class RangeExtraction {
    public static String rangeExtraction(int[] arr) {
        List<String> result = new ArrayList<>();
        if(arr == null || arr.length == 0){
            return "";
        }
        for(int i = 0; i < arr.length-3; i+=3){
            if (isNegative(arr[i])){
                result.add(String.valueOf(arr[i]));
            }
            int count = i;
            while (i < count+3){
                if (isNegative(arr[count])) {
                    int temp = arr[count];
                }
                count++;
            }
        }
        return String.join(",",result);
    }

    private static boolean isNegative(int i,int... args) {
        return i<0;
    }
}
