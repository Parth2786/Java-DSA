package Two_Pointers;
import java.util.*;;
public class question15 {

    // This is the leetcode question number 611 in which we have to return the count of the triplet which can form the valid triangle.

    public static int valid_triangle(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;
        for (int k = n - 1; k >= 2; k--) {
            int i = 0;
            int j = k - 1;
            while (i < j) {
                if (nums[i] + nums[j] > nums[k]) {
                    count += (j - i);
                    j--;
                }
                else{
                    i++;
                }
            }

        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {2,2,3,4};
        System.out.println(valid_triangle(nums));
    }

}
