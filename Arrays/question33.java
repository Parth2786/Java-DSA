package Arrays;

public class question33 {
    public static void move_zeroes(int[] nums){
        int n = nums.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 0, 4, 3, 0, 5, 0};
        move_zeroes(nums);
        for (int i : nums) {
            System.out.print(i+" ");
        }
    }
}
