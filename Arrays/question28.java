package Arrays;

import java.util.Scanner;

public class question28 {
    public static int maximum_product(int[] arr) {
        int max_product = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                max_product *= arr[i];
            }

        }
        int ans = Math.abs(max_product);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maximum_product(arr));
    }
}
