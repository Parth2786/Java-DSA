package Arrays;
import java.util.*;
public class question38 {
    public static int gcd(int a, int b){
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    public static int[] gcdPairs(int[] nums){
        int n = nums.length;
        int index = 0;
        int[] gcd_pairs = new int[n * (n - 1) / 2];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                gcd_pairs[index++] = gcd(nums[i],nums[j]); 
            }
        }
        return gcd_pairs;
    }
    public static int[] gcd_values(int[] nums, int[] queries){
        int[] gcd_pairs = gcdPairs(nums);
        Arrays.sort(gcd_pairs);
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            result[i] = gcd_pairs[queries[i]];
        }
        return result;

    }
    
      
    public static void main(String[] args) {
        int[] nums = {2,3,4};
        int[] queries = {0,2,2};
        int[] ans = gcd_values(nums,queries);
        System.out.println(Arrays.toString(ans));
    }
}
