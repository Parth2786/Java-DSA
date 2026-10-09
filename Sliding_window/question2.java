package Sliding_window;
import java.util.*;
public class question2 {

    // This is the leetcode question number 2379 in which we have find the number of count needed such that there is at least one occurrence of k consecutive black blocks.

    public static int minimum_recolors(String blocks, int k){
        char[] arr = blocks.toCharArray();
        int count_black = 0;
        for (int i = 0; i < k; i++) {
            if (arr[i] == 'B') {
                count_black++;
            }
        }
        int minimum = k - count_black;
        for (int i = k; i < arr.length; i++) {
            if (arr[i] == 'B') {
                count_black++;
            }
            if (arr[i - k] == 'B') {
                count_black--;
            }
            minimum = Math.min(minimum,k - count_black);
        }
        return minimum;
    }

    public static void main(String[] args) {
        String blocks = "WBBWWBBWBW";
        int k = 7;
        System.out.println(minimum_recolors(blocks,k));
    }
}
