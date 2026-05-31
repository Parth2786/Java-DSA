package Arrays;

import java.util.*;

public class question16 {
    public static int[] sum_array(int [] arr){
        int n = arr.length;
        int sum = 0;
        int[] ans = new int[n];
        for (int i = 0; i < ans.length; i++) {
            sum += arr[i];
        }
        for (int i = 0; i < ans.length; i++) {
            ans[i] = sum - arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = sum_array(arr);
        System.out.println(Arrays.toString(res));


    }
}
