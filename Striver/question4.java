package Striver;

public class question4 {

    // In this question we have to find the subarray from the array which has the maximum product.

    public static int max_subarray_product(int[] nums){
        int currmax = nums[0];
        int currmin = nums[0];
        int maxprod = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = currmax;
                currmax = currmin;
                currmin = temp;
            }
            currmax = Math.max(nums[i], currmax * nums[i]);
            currmin = Math.min(nums[i], currmin * nums[i]);
            maxprod = Math.max(maxprod, currmax);
        }
        return maxprod;
    }
    public static void main(String[] args) {
        int[] nums = {1, -2, 3, 4, -4, -3};
        System.out.println(max_subarray_product(nums));
    }
}
