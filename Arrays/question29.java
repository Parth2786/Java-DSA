package Arrays;

import java.util.Scanner;

public class question29 {
    public static void tripelets(int[] arr, int n) {
        System.out.println("Geometric triplets for the following are  : ");
        for (int j = 1; j < n - 1; j++) {
            int i = j - 1;
            while (i >= 0) {
                int k = j + 1;
                while (k < n) {
                    if (arr[j] * arr[j] == arr[i] * arr[k]) {
                        System.out.println("(" + arr[i] + " " + arr[j] + " " + arr[k] + " ) ");
                    }
                    k++;
                }
                i--;
            }
        }

    }

    public static void tripletesForLoop(int[] arr, int n) {
        // Check every possible triplet
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[j] * arr[j] == arr[i] * arr[k]) {
                        System.out.println("(" +
                                arr[i] + ", " +
                                arr[j] + ", " +
                                arr[k] + ")");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {2, 8, 10, 15, 16, 30, 32, 64};
        int n = sc.nextInt();
        tripelets(arr, n);
    }
}
