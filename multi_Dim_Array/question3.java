package multi_Dim_Array;

public class question3 {
    public static void rotate_image(int[][] matrix){
        int n = matrix.length;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1 ; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 -j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int matrix [][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        rotate_image(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
