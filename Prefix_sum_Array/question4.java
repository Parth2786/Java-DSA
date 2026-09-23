package Prefix_sum_Array;

public class question4 {
    public static int pivot_index(int[] nums){
        int right_sum = 0;
        for (int i : nums) {
            right_sum += i;
        }
        int left_sum = 0;
        for (int i = 0; i < nums.length; i++) {
            right_sum -= nums[i];
            if (left_sum == right_sum) {
                return i;
            }
            left_sum += nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        System.out.println(pivot_index(nums));
    }
}
