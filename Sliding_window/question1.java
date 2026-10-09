package Sliding_window;
import java.util.*;


public class question1 {

    // This is the leetcode question number 643 in which we have to find the maximum subarray average of lenth k given.

    public static double FindMaxAverage(int[] nums, int k){
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxsum = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxsum = Math.max(maxsum, sum);
        }
        return (double) maxsum / k;
    }

    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(FindMaxAverage(nums, k));
    }
}
