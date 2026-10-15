package Sliding_window;
import java.util.*;
public class question6 {

    // This is the leetcode question number 2090 in which we have to find the averagee of the k radius subarray element.

    public static int[] getAverages(int[] nums, int k){
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        int windowsize = 2 * k + 1;
        if (windowsize > n) {
            return result;
        }
        long windowsum = 0;
        for (int i = 0; i < windowsize; i++) {
            windowsum += nums[i];
        }
        result[k] = (int) (windowsum / windowsize);
        for (int i = windowsize; i < n; i++) {
            windowsum += nums[i] - nums[i - windowsize];
            result[i - k] = (int) (windowsum / windowsize);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {7,4,3,9,1,8,5,2,6};
        int k = 3;
        int[] ans = getAverages(nums, k);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
