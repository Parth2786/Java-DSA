package Sliding_window;

public class question8 {

    // This is the leetcode question number 713 in which we have to find the total number of subarray in whose product is less than target value.

    public static int subarray_count(int[] nums, int target){
        if (target <= 1) {
            return 0;
        }
        int n = nums.length;
        int left = 0;
        int product = 1;
        int count = 0;
        for (int right = 0; right < n; right++) {
            product *= nums[right];
            while (product >= target) {
                product /= nums[left];
                left++;
            }
            count += (right - left + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {10,5,2,6};
        int target = 100;
        System.out.println(subarray_count(nums, target));
    }
}
