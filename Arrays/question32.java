package Arrays;

public class question32 {
    public static int consecutive_element(int [] nums){
        int count_one = 0;
        int count_zero = 0;
        int max_one = 0;
        int max_zero = 0;
        for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 1) {
                    count_one++;
                    max_one = Math.max(max_one, count_one);
                    count_zero = 0;
                }
                else if(nums[i] == 0){
                    count_zero++;
                    max_zero = Math.max(max_zero, count_zero);
                    count_one = 0;
                }
            }
        if(count_one > count_zero){
            return count_one;
        }
        else{
            return count_zero;
        }
    }
    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 0};
        System.out.println(consecutive_element(nums));
    }
}
