package Sliding_window;
import java.util.*;
public class question15 {

    // This is the leetcode question number 2302 in which we have to find the count of the subarrays whose score is less than k. Score is defined by the product of its sum and length of the subarray.

    public static int count_subarray(int[] nums, int k){
        int left = 0;
        int count = 0;
        int sum = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum * (right - left + 1) >= k) {
                sum -= nums[left];
                left++;
            }
            count += (right - left + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,4,3,5};
        int k = 10;
        System.out.println(count_subarray(nums,k));
    }
}
