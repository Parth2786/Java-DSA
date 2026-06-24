package multi_Dim_Array;

import java.util.*;

public class question4 {
    public static List<Integer> Exit_point(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int i = 0, j = 0, res_i = -1, res_j = -1;
        int dir = 0;
        while (j >= 0 && i < n && j < m && i >= 0) {
            if (matrix[i][j] == 1) {
                matrix[i][j] = 0;
                dir = (dir + 1) % 4;
            }
            res_i = i;
            res_j = j;
            if (dir == 0) {
                j++;
            } else if (dir == 1) {
                i++;
            } else if (dir == 2) {
                j--;
            } else if (dir == 3) {
                i--;
            }
        }

        return Arrays.asList(res_i, res_j);
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 0, 1, 0 },
                { 0, 1, 1 },
                { 0, 0, 0 }
        };
        List<Integer> exit_point = Exit_point(matrix);
        System.out.println(exit_point);
    }
}
