package Two_Pointers;

public class question6 {
    
    // This is the leetcode question number 283 in which we have to move the zeroes in the array at the end and the return that array.
    public static void move_zeroes(int[] nums){
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        move_zeroes(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
