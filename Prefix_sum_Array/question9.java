package Prefix_sum_Array;

public class question9 {
    public static int sum_odd_subarrays(int[] nums){
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        int total = 0;
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                int length = end - start + 1;
                if (length % 2 == 1) {
                    if (start == 0) {
                        total += prefix[end];
                    }
                    else{
                        total += prefix[end] - prefix[start - 1];
                    }
                }
            }
        }
        return total;
    }
    public static void main(String[] args) {
        int[] nums = {1,4,2,5,3};
        System.out.println(sum_odd_subarrays(nums));
    }
}
