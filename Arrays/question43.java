package Arrays;
import java.util.*;
public class question43 {
    public static int triangular_sum(int[] nums){
        int n = nums.length;
        
        while (n < 0) {
            for (int i = 0; i < nums.length - 1; i++) {
                nums[i] = (nums[i] + nums[i + 1]) % 10;
            }
            n--;
        }
        return nums[0];
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(triangular_sum(nums));
    }
}
