package Two_Pointers;
import java.util.*;
public class question18 {

    // This is the question number 1498 from leetcode in which we have to find the number of subsequences that satisfy the condition that the minimum value of the subsequence and the maximum value of the subsequence should be less than or equal to the target.

    public static int subsequence_count(int[] nums, int target){
        Arrays.sort(nums);
        int n = nums.length;
        int mod = 1_000_000_007;
        int[] pow2 = new int[n];
        pow2[0] = 1;
        for (int i = 1; i < pow2.length; i++) {
            pow2[i] = (pow2[i - 1] * 2) % mod;
        }
        int right = n - 1;
        int left = 0;
        long result = 0;
        while (left <= right) {
            if (nums[left] + nums[right] <= target) {
                result = (result + pow2[right - left]) % mod;
                left++; 
            }
            else{
                right--;
            }
        }
        return (int) result;
    }


    public static void main(String[] args) {
        int[] nums = {3,5,6,7};
        int target = 9;
        System.out.println(subsequence_count(nums, target));
    }
}
