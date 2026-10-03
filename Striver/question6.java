package Striver;

import java.util.*;

public class question6 {

    // Three sum problem.
    // In this question we have to find all the 3 numbers that have the sum 0.
    public static List<List<Integer>> three_sum(int[] nums){
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
                else if (sum < 0) {
                    left++;
                }
                else{
                    right--;
                }

            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums = {2, -2, 0, 3, -3, 5};
        List<List<Integer>> result = three_sum(nums);
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}
