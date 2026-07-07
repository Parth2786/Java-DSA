package multi_Dim_Array;

public class question14 {

    // This is searching into the matrix but this is for the sorted matrix with both row and column.
    public static boolean search_matrix(int[][] matrix, int target){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (target == matrix[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };
        int target = 11;
        System.out.println(search_matrix(matrix,target));
    }
}
