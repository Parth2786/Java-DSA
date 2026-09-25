package Prefix_sum_Array;


// in this question we have to check whether the sum of the two subarrays are equal. If yes then return true and if not then return false.
public class question8 {
    public static boolean canSplit(int[] nums){
        int total = 0;
        for (int i : nums) {
            total += i;
        }
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            left += nums[i];
            int right = total - left;
            if (left == right) {
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 5};
        System.out.println(canSplit(nums));
    }
}
