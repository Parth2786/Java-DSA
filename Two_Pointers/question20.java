package Two_Pointers;
import java.util.*;
public class question20 {

    // This is the question 1877 on leetcode in which we have to return the maximum pair sum from the array the pair should made with largest element with minimum element from the array.

    public static int maximum_pair_sum(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int max_sum = 0;
        while (left < right) {
            int sum = nums[left] + nums[right];
            max_sum = Math.max(max_sum, sum);
            left++;
            right--;
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int[] nums = {3,5,2,3};
        System.out.println(maximum_pair_sum(nums));
    }
}
