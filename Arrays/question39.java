package Arrays;
public class question39 {
    public static int gcd(int[] nums){
        int min = nums[0];
        int max = nums[0];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        while (max != 0) {
            int temp = min % max;
            min = max;
            max = temp;
        }
        return min;
    }
    public static void main(String[] args) {
        int[] nums = {7,5,6,8,3};
        System.out.println(gcd(nums));
    }
}
