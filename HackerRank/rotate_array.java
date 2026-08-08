package HackerRank;
import java.util.*;
public class rotate_array {
    public static List<Integer> rotate_array(int k , List<Integer> arr){
        int n = arr.size();
        k = (k % n) + 1;
        List<Integer> rotate = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            rotate.add(arr.get((i - k + n) % n));
        }
        return rotate;
    }
    public static void main(String[] args) {
        List<Integer> arr= Arrays.asList(1,2,3,4,5);
        int k = 2;
        List<Integer> ans = rotate_array(k,arr);
        System.out.println(ans);

    }
}
