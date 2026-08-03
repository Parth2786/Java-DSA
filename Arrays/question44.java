package Arrays;
import java.util.*;
public class question44 {
    public static List<List<Integer>> three_sum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = Arrays.asList(nums[i],nums[j],nums[k]);
                        if (!result.contains(triplet)) {
                            result.add(triplet);
                        }
                        
                    }
                }
            }
        }
        return result;
        
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = three_sum(nums);
        System.out.println(ans);
    }
}
