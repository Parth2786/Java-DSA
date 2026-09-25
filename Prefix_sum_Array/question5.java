package Prefix_sum_Array;

public class question5 {
    public static int middle_index(int[] nums){
        int total = 0;
        for (int i : nums) {
            total += i;
        }
        int left_sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int right_sum = total - left_sum - nums[i];
            if (left_sum == right_sum) {
                return i;
            }
            left_sum += nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,-1,8,4};
        System.out.println(middle_index(nums));
    }
}
