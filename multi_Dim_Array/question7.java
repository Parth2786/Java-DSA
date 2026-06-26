package multi_Dim_Array;
import java.util.*;
public class question7 {
    public static void set_zeroes(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        int[] row = new int[n];
        int[] cols = new int[m];
        Arrays.fill(row, 1);
        Arrays.fill(cols, 1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 0;
                    cols[j] = 0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 0 || cols[j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {0,1,2,0},
            {3,4,5,2},
            {1,3,1,5}
        };
        set_zeroes(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
