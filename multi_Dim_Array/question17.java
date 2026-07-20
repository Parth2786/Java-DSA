package multi_Dim_Array;
import java.util.*;
public class question17 {
    public static List<List<Integer>> shiftGrid(int[][] grid, int k){
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;
        int[] flatter = new int[total];
        int idx = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                flatter[idx++] = grid[i][j];
            }
        }
        int d = k % total;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(flatter[(idx++ - d + total) % total]);
            }
            result.add(row);
        }
        return result;
    }
    public static void main(String[] args) {
        int [][] grid = {
            {3,8,1,9},
            {19,7,2,5},
            {4,6,11,10},
            {12,0,21,13}
        };
        int k = 4;
        List<List<Integer>> ans = shiftGrid(grid,k);
        System.out.println(ans);
    }
}
