package Striver;

// Given an integer array nums, find the subarray with the largest sum and return the sum of the elements present in that subarray.

// A subarray is a contiguous non-empty sequence of elements within an array.

// for solving this question we will use the kadanes algorithm.

// Kadane’s Algorithm is mainly used for problems where you need to find the maximum (or minimum) sum of a contiguous subarray.

public class question2 {
    public static int max_subarray(int[] nums){
        int current = nums[0];
        int best = nums[0];
        for (int i = 1; i < nums.length; i++) {
            current = Math.max(nums[i], current + nums[i]);
            best = Math.max(current, best);
        }
        return best;
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, -2, 7, -4};
        System.out.println(max_subarray(nums));
    }
}
