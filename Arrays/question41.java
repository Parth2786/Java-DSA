package Arrays;
import java.util.*;
public class question41 {
    public static boolean canJump(int[] nums){
        int farthest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > farthest) {
                return false;
            }
            farthest = Math.max(farthest, i + nums[i]);
            
        }
        if (farthest >= nums.length - 1) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        System.out.println(canJump(nums));
    }
}
