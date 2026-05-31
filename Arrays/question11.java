package Arrays;

import java.util.*;

public class question11 {
    public static int[] addition(int[] arr1, int[] arr2, int n1, int n2) {
        int size = Math.max(n1, n2);

        int[] temp = new int[size + 1];

        int i = n1 - 1;
        int j = n2 - 1;
        int k = size;

        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {

            int x = (i >= 0) ? arr1[i] : 0;
            int y = (j >= 0) ? arr2[j] : 0;

            int sum = x + y + carry;

            temp[k] = sum % 10;

            carry = sum / 10;

            i--;
            j--;
            k--;
        }

        if (temp[0] == 0) {

            int[] ans = new int[size];
            for (int p = 0; p < size; p++) {
                ans[p] = temp[p + 1];
            }
            return ans;
        }

        return temp;
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
        int[] result = addition(arr1, arr2, n1, n2);
        System.out.println(Arrays.toString(result));
    }
}
