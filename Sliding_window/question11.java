package Sliding_window;

public class question11 {

    // This is the leetcode question number 1493 in which we have to find the max length of the subarray which consist of only one's after deleting one element.

    public static int max_length(int[] nums){
        int n = nums.length;
        int left = 0;
        int max = 0;
        int zeroes = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroes++;
            }
            while (zeroes > 1) {
                if (nums[left] == 0) {
                    zeroes--;
                }
                left++;
            }
            max = Math.max(max, i - left);
        }
        return max;

    }

    public static void main(String[] args) {
        int[] nums = {1,1,0,1};
        System.out.println(max_length(nums));
    }
}
