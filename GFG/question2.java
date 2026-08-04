package GFG;

public class question2 {
    // Minimum jumps required to reach the last index of the array.
    public static int min_jump(int[] nums){
        if (nums.length <= 1) {
            return 0;
        }
        if (nums[0] == 0) {
            return -1;
        }
        int currentend = 0;
        int farthest = 0;
        int jump = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == currentend) {
                jump++;
                currentend = farthest;
                if (currentend >= nums.length - 1) {
                    return jump;
                }
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(min_jump(nums));
    }
}
