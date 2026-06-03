package Arrays;

import java.util.Scanner;

public class question25 {
    public static boolean canAliceWin(int[] nums){
        int single_sum = 0;
        int double_sum = 0;
        int total_sum = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] < 10 && i >= 0) {
                single_sum += nums[i];
            }
            else if(nums[i] >= 10 && nums[i] <= 99){
                double_sum += nums[i];
            }
            total_sum += nums[i];
            i++;
        }
        if (single_sum > (total_sum - single_sum)) {
            return true;
        }
        if (double_sum > (total_sum - double_sum)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(canAliceWin(nums));

    }
}
