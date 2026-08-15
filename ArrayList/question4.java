package ArrayList;

import java.util.ArrayList;

public class question4 {

    // In this question we have to find the leader element from the given array.
    // The leader element from the given array is the element that greater than or equal to the all the element from its right side.
    public static ArrayList<Integer> leaderElement(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int leader = arr[n - 1];
        ans.add(0, leader);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= leader) {
                ans.add(0, arr[i]);
                leader = arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        System.out.println(leaderElement(arr));
    }
}
