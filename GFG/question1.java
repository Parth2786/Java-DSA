package GFG;

public class question1 {

    // Kadane's Algorithm to find the maximum sum of contigous array element in the array.
    public static int Kadanes_algo(int[] nums){
        int max_sum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > max_sum) {
                max_sum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int[] nums = {-2, -4};
        System.out.println(Kadanes_algo(nums));
    }
}
