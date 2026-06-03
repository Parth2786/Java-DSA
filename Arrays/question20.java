package Arrays;
import java.util.*;
public class question20 {
    public static int[] twosum(int[] arr,int target){
        int i = 0;
        int j = i + 1;
        while (i < j ) {
            if (arr[i] + arr[j] == target) {
                return new int[] {i,j};
            }
            i++;
            j++;
        }
        return new int[] {};

    }
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int target = 6;
        int[] ans = twosum(arr,target);
        System.out.println(Arrays.toString(ans));
    }
}
