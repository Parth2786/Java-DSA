package String_Two_Pointers;
import java.util.*;
public class question3 {
    public static int[] two_sum(int[] nums, int target){
        int first = 0;
        int last = nums.length - 1;
        while (first < last) {
            int sum = nums[first] + nums[last];
            if (sum == target) {
                return new int[] {first + 1, last + 1};
            }
            else if(sum < target){
                first++;
            }
            else{
                last--;
            }
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {2,7,11,15};
        int target = sc.nextInt();
        int[] ans = two_sum(nums,target);
        System.out.println(Arrays.toString(ans));
    }
}
