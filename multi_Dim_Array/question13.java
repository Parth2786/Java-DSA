package multi_Dim_Array;

public class question13 {
    public static int[][] image_smoother(int[][] image){
        int m = image.length;
        int n = image[0].length;
        int[][] filter = new int[m][n];
        // One direction array is needed to give the direction to the iteration so that it can iterate to the all the 8 cells of the matrix.
        int[][] dir = {
            {-1,0}, //up
            {1,0},  //down
            {0,-1}, //left
            {0,1},  //right
            {-1,-1},  //up-left
            {1,1}, // down-right
            {-1,1}, //up-right
            {1,-1} //down-right
        };
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = image[i][j];
                int count = 1;
                for (int[] d : dir) {
                    int x = i + d[0];
                    int y = j + d[1];
                    if (x >= 0 && x < m && y >= 0 && y < n) {
                        sum += image[x][y];
                        count++;
                    }
                }
                
                filter[i][j] = sum/count;
            }
        }
        return filter;
    }

    public static void main(String[] args) {
        int[][] image = {
                { 100, 200, 100 },
                { 200, 50, 200 },
                { 100, 200, 100 }
        };
        int[][] ans = image_smoother(image);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
