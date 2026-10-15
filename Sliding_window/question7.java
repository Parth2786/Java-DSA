package Sliding_window;

public class question7 {

    // This is the leetcode question number 209 in which we have to find the minimum length of the subarray whose sum greater than or equal to the given target value.

    public static int minimum_subarray(int[] nums, int target){
        int n = nums.length;
        int left = 0;
        int minlen = Integer.MAX_VALUE;
        int sum = 0;
        for (int right = 0; right < n; right++) {
            sum += nums[right];
            while (sum >= target) {
                minlen = Math.min(minlen, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        if (minlen == Integer.MAX_VALUE) {
            return 0;
        }
        else{
            return minlen;
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minimum_subarray(nums, target));
    }
}
