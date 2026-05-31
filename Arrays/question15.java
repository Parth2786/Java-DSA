package Arrays;

import java.util.Scanner;

public class question15 {
    public static int element_less_x(int[] arr, int x){
        int count = 0;
        int i = 0;
        while (i < arr.length - 1) {
            if (arr[i] < x) {
                count++;
            }
            i++;
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
        int x = sc.nextInt();
        int ans = element_less_x(arr,x);
        System.out.println(ans);
    }
}
