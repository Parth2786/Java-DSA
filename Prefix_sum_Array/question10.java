package Prefix_sum_Array;

public class question10 {
    public static int ways_split_array(int[] nums){
        long total = 0;
        for (int i : nums) {
            total += i;
        }
        long leftsum = 0;
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            leftsum += nums[i];
            long rightsum = total - leftsum;
            if (leftsum >= rightsum) {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int[] nums = {10,4,-8,7};
        System.out.println(ways_split_array(nums));
    }
}
