package multi_Dim_Array;

public class question12 {
    public static int[][] generate_matrix(int n) {
        int[][] matrix = new int[n][n];
        int srow = 0;
        int erow = n - 1;
        int scol = 0;
        int ecol = n - 1;
        int num = 1;
        while (srow <= erow && scol <= ecol) {
            for (int k = scol; k <= ecol; k++) {
                matrix[srow][k] = num++;
            }
            for (int l = srow + 1; l <= erow; l++) {
                matrix[l][ecol] = num++;
            }
            if (srow < erow) {
                for (int k = ecol - 1; k >= scol; k--) {
                    matrix[erow][k] = num++;
                }
            }
            if (scol < ecol) {
                for (int l = erow - 1; l > srow; l--) {
                    matrix[l][scol] = num++;
                }
            }

            srow++;
            scol++;
            ecol--;
            erow--;
        }

        return matrix;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] ans = generate_matrix(n);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
