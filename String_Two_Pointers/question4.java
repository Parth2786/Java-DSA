package String_Two_Pointers;
import java.util.*;
public class question4 {
    public static int[] square_array(int[] nums){
        // There are two approaches of solving this question we have to return the sorted array after squaring each element of the array.
        // The first approach is to store the element of the array in the same array after squaring them. and then use the Arrays.sort to sort the array.
        // int k = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     nums[k] = nums[i] * nums[i];
        //     k++;
        // }
        // Arrays.sort(nums);
        // return nums;
        // The second approach is manually sorting the array.
        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[nums.length];
        int pos = nums.length - 1;
        for (int i = 0; i < result.length; i++) {
            int leftsquare = nums[left] * nums[left];
            int rightsquare = nums[right] * nums[right];
            if (leftsquare > rightsquare) {
                result[pos] = leftsquare;
                left++;
            } 
            else{
                result[pos] = rightsquare;
                right--;
            }
            pos--;
        }
        return result;

    }
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] ans = square_array(nums);
        System.out.println(Arrays.toString(ans));
    }
}
