package Prefix_sum_Array;

public class question2 {
    public static int[] running_sum(int[] nums){
        int[] running_sum = new int[nums.length];
        running_sum[0] = nums[0];
        for (int i = 1; i < running_sum.length; i++) {
            running_sum[i] = running_sum[i - 1] + nums[i];
        }
        return running_sum;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int [] ans = running_sum(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
