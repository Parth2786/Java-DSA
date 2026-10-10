package Sliding_window;
import java.util.*;


public class question3 {

    // This is the leetcode question number 1343 in which we have to return the total number of subarray of length k which has average greater than threshold.

    public static int numberOf_subarras(int[] arr, int threshold, int k){
        int n = arr.length;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        if (sum / k >= threshold) {
            count++;
        }
        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];
            if (sum / k >= threshold) {
                count++;
            }
        }
        return count;


    }


    public static void main(String[] args) {
        int[] arr = {11,13,17,23,29,31,7,5,2,3};
        int k = 3;
        int threshold = 5;
        System.out.println(numberOf_subarras(arr, threshold, k));
    }
}
