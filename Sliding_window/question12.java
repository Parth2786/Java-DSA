package Sliding_window;

public class question12 {

    // This is the leetcode question number 1658 in which we have to find the minimum number operation needed to reduce x to 0.

    public static int minimum_operation(int[] nums, int x){
        int n = nums.length;
        int total = 0;
        for (int i : nums) {
            total += i;
        }
        int target = total - x;
        if (target < 0) {
            return -1;
        }
        int left = 0;
        int sum = 0;
        int maxlen = -1;
        for (int right = 0; right < n; right++) {
            sum += nums[right];
            while (sum > target && left <= right) {
                sum -= nums[left++];
            }
            if (sum == target) {
                maxlen = Math.max(maxlen, right - left + 1);
            }
        }
        if (maxlen == -1) {
            return -1;
        }
        else{
            return n - maxlen;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,1,4,2,3};
        int x = 5;
        System.out.println(minimum_operation(nums, x));
    }
}
