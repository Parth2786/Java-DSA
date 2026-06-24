package multi_Dim_Array;

public class question5 {
    public static void boolean_matrix(int[][] matrix){
        int n = matrix.length;
        int m = matrix.length;
        int[] rows = new int[n];
        int[] cols = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 1) {
                    rows[i] = 1;
                    cols[j] = 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (rows[i] == 1 || cols[j] == 1) {
                    matrix[i][j] = 1;
                }
            }
        }
        
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1,0},
            {0,0}
        };
        boolean_matrix(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
