package Prefix_sum_Array;

public class question6 {
    public static int start_value(int[] nums){
        int prefix_sum = 0;
        int min_prefix_sum = 0;
        for (int i : nums) {
            prefix_sum += i;
            min_prefix_sum = Math.min(prefix_sum, min_prefix_sum);
        }
        return 1 - min_prefix_sum;
    }
    public static void main(String[] args) {
        int[] nums = {-3,2,-3,4,2};
        System.out.println(start_value(nums));
    }
}
