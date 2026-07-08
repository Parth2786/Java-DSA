package multi_Dim_Array;

import java.sql.Array;
import java.util.*;

public class question16 {
    public static int[] sumAndMultiply(String s, int[][] queries) {

        // We used this mod because in this question multiplying the sum with the number can return a big number so to prevent the integer overflow we used this , this mod keeps the result within the range so that in case it does not trows any error.
        int mod = 1_000_000_007;
        int n = queries.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            long sum = 0;
            long x = 0;
            for (int k = left; k <= right; k++) {
                char c = s.charAt(k);
                if (c != '0') {
                    int digit = c - '0';
                    x = (x * 10 + digit) % mod;
                    sum = (sum + digit) + mod;
                }
            }
            result[i] = (int)((sum * x) % mod);

        }
        return result;
    }

    public static void main(String[] args) {
        int[][] queries = {
                { 0, 7 },
                { 1, 3 },
                { 4, 6 }
        };
        String s = "10203004";
        int[] ans = sumAndMultiply(s, queries);
        System.out.println(Arrays.toString(ans));
    }
}
