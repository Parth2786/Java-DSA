package Arrays;

import java.util.Scanner;

public class question14 {
    public static int subarray_divisible(int[] arr, int k) {
        int[] freq = new int[k];
        int count = 0;
        int sum = 0;
        freq[0] = 1;
        for(int num : arr){
            sum += num;
            int mod = ((sum % k) + k) % k;
            count += freq[mod];
            freq[mod]++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int ans = subarray_divisible(arr, k);
        System.out.println(ans);
    }
}
