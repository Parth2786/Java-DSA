package Arrays;

import java.util.Scanner;

public class question22 {
    public static int missing_number(int[] arr){
        int n = arr.length;
        int expected_sum = n * (n + 1)/2;
        int actual_sum = 0;
        for (int j : arr) {
            actual_sum += j;
        }
        int ans = expected_sum - actual_sum;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(missing_number(arr));
    }
}
