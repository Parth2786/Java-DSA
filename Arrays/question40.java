package Arrays;

public class question40 {
    public static int single_number(int[] nums){
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {2,2,3,2};
        System.out.println(single_number(nums));
    }
}
