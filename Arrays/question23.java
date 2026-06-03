package Arrays;

import java.util.Scanner;

public class question23 {
    public static int maxpoint(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int total_point_ans = 0;
        for (int i = 0; i < n; i++) {
            int max_read = k / nums1[i];
            int total_point = max_read * nums2[i];
            total_point_ans = Math.max(total_point_ans, total_point);
        }
        return total_point_ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] nums1 = new int[n1];
        int[] nums2 = new int[n2];
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = sc.nextInt();
        }
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(maxpoint(nums1, nums2, k));
    }
}
