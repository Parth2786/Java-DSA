package Arrays;

import java.util.Arrays;

public class question37 {
    public static long gcd_sum(int[] nums) {
        int n = nums.length;
        int[] prefix_gcd = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            prefix_gcd[i] = GCD(nums[i], max);
        }
        Arrays.sort(prefix_gcd);
        long ans = 0;
        for (int i = 0; i < n / 2; i++) {
            ans += GCD(prefix_gcd[i], prefix_gcd[n - i - 1]);
        }
        return ans;
    }

    public static int GCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 6, 2, 8 };
        System.out.println(gcd_sum(nums));
    }
}
