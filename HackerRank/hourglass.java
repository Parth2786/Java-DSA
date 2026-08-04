package HackerRank;

import java.util.*;

public class hourglass {
    public static int hourglass(List<List<Integer>> arr){
        int maxsum = Integer.MIN_VALUE;
        int rows = arr.size();
        int cols = arr.get(0).size();
        for (int i = 0; i <= rows - 3; i++) {
            for (int j = 0; j <= cols - 3; j++) {
                int sum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2)  + arr.get(i + 1).get(j + 1) + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                maxsum = Math.max(maxsum, sum);
            }
        }

        return maxsum;
    }
    public static void main(String[] args) {
        List<List<Integer>> arr = Arrays.asList(
            Arrays.asList(1, 1 ,1, 0, 0, 0),
            Arrays.asList(0, 1, 0, 0, 0, 0),
            Arrays.asList(1, 1, 1, 0, 0, 0),
            Arrays.asList(0, 0, 2, 4, 4, 0),
            Arrays.asList(0, 0, 0, 2, 0, 0),
            Arrays.asList(0, 0, 1, 2, 4, 0)
        );
        System.out.println(hourglass(arr));
    }
}
