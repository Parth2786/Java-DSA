package Two_Pointers;

public class question13 {

    // This is the question number 905 on leetcode in which we have to move the all the even number to the starting of the array.
    public static void sort_array(int[] nums){
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        sort_array(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
