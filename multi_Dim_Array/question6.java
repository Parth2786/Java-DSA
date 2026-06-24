package multi_Dim_Array;

public class question6 {
    public static int max_0s_cloumn(int[][] matrix){
        int maxcount = 0;
        int res = -1;
        int n = matrix.length;
        int m = matrix[0].length;
        for (int cols = 0; cols < m; cols++) {
            int count = 0;
            for (int rows = 0; rows < n; rows++) {
                if (matrix[cols][rows] == 0) {
                    count++;
                }
            }
            if (count > maxcount) {
                maxcount = count;
                res = cols;
            }
        }
        return res; 
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {0,0,0},
            {1,0,1},
            {0,1,1}
        };
        System.out.println(max_0s_cloumn(matrix));
    }
}
