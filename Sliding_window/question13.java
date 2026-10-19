package Sliding_window;
import java.util.*;
public class question13 {

    // This is the leetcode question 1838 in which we have to find the maximum frequency after performing the atmost k operation.
    
    public static int maximum_frequency(int[] nums, int k){
        Arrays.sort(nums);
        int left = 0;
        int ans = 1;
        int sum = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            long cost = (long) nums[right] * (right - left + 1) - sum;
            while (cost > k) {
                sum -= nums[left];
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,4};
        int k = 5;
        System.out.println(maximum_frequency(nums, k));
    }
}
