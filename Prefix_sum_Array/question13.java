package Prefix_sum_Array;

public class question13 {
    public static int return_boundary_count(int[] nums){
        int pos = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            pos += nums[i];
            if (pos == 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,-3,-4};
        System.out.println(return_boundary_count(nums));
    }
}
