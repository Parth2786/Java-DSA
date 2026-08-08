package Arrays;
import java.util.*;
public class question47 {
    public static List<Boolean> kids_with_candies(int[] candies, int extra_candies){
        int n = candies.length;
        List<Boolean> ans = new ArrayList<>();
        int max_candies = 0;
        for (int i = 0; i < n; i++) {
            if (candies[i] > max_candies) {
                max_candies = candies[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (candies[i] + extra_candies >= max_candies) {
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extra_candies = 3;
        List<Boolean> result = kids_with_candies(candies, extra_candies);
        System.out.println(result);

    }
}
