package multi_Dim_Array;

public class question11 {
    public static boolean is_toeplitz(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] != matrix[i - 1][j - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3,4},
            {5,1,2,3},
            {9,8,1,2}
        };
        System.out.println(is_toeplitz(matrix));
    }
}
