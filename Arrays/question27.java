package Arrays;

import java.util.Scanner;

public class question27 {
    public static int remove_element(int[] nums,int k){
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != k) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(remove_element(nums,k));

    }
}
