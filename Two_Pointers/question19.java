package Two_Pointers;
import java.util.*;
public class question19 {

    // This is the leetcode question number 1679 in which we have to return the total number operations that are required to remove the elements from the array whose sum will be equal to the target given.
    

    public static int max_operations(int[] nums, int target){
        Arrays.sort(nums);
        int count = 0;
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                left++;
                right--;
                count++;
            }
            else if (sum < target) {
                left++;
            }
            else{
                right--;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] nums = {3,1,3,4,3};
        int target = 5;
        System.out.println(max_operations(nums, target));
    }
}
