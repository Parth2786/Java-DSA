package Prefix_sum_Array;

public class question7 {
    public static int[] left_right_difference(int[] nums){
        int total = 0;
        int[] ans = new int[nums.length];
        for (int i : nums) {
            total += i;
        }
        int left_sum = 0;
        for (int i = 0; i < ans.length; i++) {
            int right_sum = total - left_sum - nums[i];
            ans[i] = Math.abs(left_sum - right_sum);
            left_sum += nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {10,4,8,3};
        int[] answer = left_right_difference(nums);
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }

    }
}
