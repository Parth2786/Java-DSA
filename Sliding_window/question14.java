package Sliding_window;
import java.util.*;
public class question14 {

    // This is the leetcode question number 1695 in which we have to find the maximum sum of the element of the unique element of the subarray.

    public static int maximum_sum(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        int left = 0;
        int sum = 0;
        int maxsum = 0;
        for (int right = 0; right < nums.length; right++) {
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            set.add(nums[right]);
            sum += nums[right];
            maxsum = Math.max(maxsum, sum);
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int[] nums = {4,2,4,5,6};
        System.out.println(maximum_sum(nums));
    }
}
