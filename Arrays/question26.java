package Arrays;

import java.util.Scanner;

public class question26 {
    public static int smallestIndex(int [] nums){
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int x = nums[i];
            while (x > 0) {
                sum += x % 10;
                x /= 10;
            }
            if (sum == i) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(smallestIndex(nums));

    }
}
