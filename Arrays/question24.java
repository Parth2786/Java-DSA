package Arrays;

import java.util.Scanner;

public class question24 {
    public static int maximum_subarray(int [] arr){
        int max_sum = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            int curr_sum = 0;
            for (int j = i; j < arr.length; j++) {
                curr_sum += arr[j];
                max_sum = Math.max(max_sum, curr_sum);
            }
        }
        return max_sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maximum_subarray(arr));
    }
}
