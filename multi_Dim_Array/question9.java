package multi_Dim_Array;

import java.util.*;

public class question9 {
    public static List<Integer> spiral_matrix(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        int srow = 0;
        int erow = n - 1;
        int scol = 0;
        int ecol = m - 1;
        while (srow <= erow && scol <= ecol) {
            for (int i = scol; i <= ecol; i++) {
                result.add(matrix[srow][i]);
            }
            for (int j = srow + 1; j <= erow; j++) {
                result.add(matrix[j][ecol]);
            }
            if (srow < erow) {
                for (int i = ecol - 1; i >= scol; i--) {
                    result.add(matrix[erow][i]);
                }
            }
            if (scol < ecol) {
                for (int j = erow - 1; j > srow; j--) {
                    result.add(matrix[j][scol]);
                }
            }
            scol++;
            srow++;
            ecol--;
            erow--;
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        List<Integer> ans = spiral_matrix(matrix);
        System.out.println(ans);

    }
}
