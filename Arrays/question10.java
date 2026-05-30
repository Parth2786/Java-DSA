package Arrays;

import java.util.*;

public class question10 {

    public static int[] subtraction(int[] arr1, int[] arr2, int n1, int n2) {
        int[] res = new int[Math.max(n1, n2) + 1];
        int k = res.length - 1;
        int i = n1 - 1;
        int j = n2 - 1;

        while (i >= 0 && j >= 0) {
            if (arr1[i] >= arr2[j]) {
                res[k] = arr1[i] - arr2[j];
            } else {
                res[k] = (arr1[i] + 10) - arr2[j];
                arr1[i - 1]--; // borrow from previous digit
            }
            k--;
            i--;
            j--;
        }

        // Copy remaining digits of arr1 if any
        while (i >= 0) {
            res[k--] = arr1[i--];
        }

        // Remove leading zeros
        int start = 0;
        while (start < res.length - 1 && res[start] == 0) {
            start++;
        }
        return Arrays.copyOfRange(res, start, res.length);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] result = subtraction(arr1, arr2, n1, n2);
        System.out.println(Arrays.toString(result));
    }
}
