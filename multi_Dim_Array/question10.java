package multi_Dim_Array;

public class question10 {
    public static int[] diagonal_traverse(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        int[] result = new int[m * n];
        int row = 0;
        int col = 0;
        for (int i = 0; i < result.length; i++) {
            result[i] = matrix[row][col];
            if ((row + col) % 2 == 0) {
                if (col == n - 1) {
                    row++;
                }
                else if (row == 0) {
                    col++;
                }
                else{
                    row--;
                    col++;
                }
            }
            else if (row == m - 1) {
                col++;
            }
            else if (col == 0) {
                row++;
            }
            else{
                row++;
                col--;
            }
        }
        return result;

    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int[] ans = diagonal_traverse(matrix);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
}
