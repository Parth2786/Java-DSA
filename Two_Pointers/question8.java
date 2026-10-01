package Two_Pointers;

import java.util.*;

public class question8 {

    // In this question we have to count the total number of pairs of element which
    // sum up to target value.

    public static int count_pairs(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { -1, 1, 5, 5, 7 };
        int target = 6;
        System.out.println(count_pairs(nums, target));
    }
}
