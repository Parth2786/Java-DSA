package Sliding_window;

public class question9 {

    // This is the leetcode question number 1004 in which we have to count the total number consecutive one's after fipping k 0's.

    public static int consecutive_ones(int[] nums, int k){
        int n = nums.length;
        int count = 0;
        int maxcount = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
                maxcount = Math.max(maxcount, count);
            }
            else{
                count = 0;
            }
        }
        int total = maxcount + k;
        return total;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        System.out.println(consecutive_ones(nums, k));
    }
}
