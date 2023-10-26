package randomKata;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println(removeDuplicates(nums));
    }

    private static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        Set<Integer> uniqueNums = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            uniqueNums.add(nums[i]);
        }

        return uniqueNums.size();
    }

}


