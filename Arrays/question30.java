package Arrays;
import java.util.*;
public class question30 {
    public static boolean canAliceWon(int[] nums){
        int single_sum = 0;
        int double_sum = 0;
        int total_sum = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] >= 1 && nums[i] < 10) {
                single_sum += nums[i];
            }
            if (nums[i] >= 99 && nums[i] >= 10) {
                double_sum += nums[i];
            }
            total_sum += nums[i];
            i++;
        }
        if (single_sum > (total_sum - single_sum)) {
            return true;
        }
        if (double_sum > (total_sum - double_sum)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,4,5, 85 , 25};
        System.out.println(canAliceWon(nums));
    }
}
