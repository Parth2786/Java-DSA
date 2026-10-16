package Sliding_window;

public class question10 {

    // This is the leetcode question number 930 in which we have to find the total number of subarrays whose is equal to the goal it is the binary array.

    public static int atmost(int[] nums, int goal){
        if (goal < 0) {
            return 0;
        }
        int n = nums.length;
        int left = 0;
        int sum = 0;
        int count = 0;
        for (int right = 0; right < n; right++) {
            sum += nums[right];
            while (sum > goal) {
                sum -= nums[left];
                left++;
            }
            count += (right - left + 1);
        }
        return count;
    }

    public static int number_subarrays(int[] nums, int goal){

        // We will do this below operation because atmost(nums, goal) - atmost(nums, goal - 1) will give us the exact sum == goal not more than and less than.
        return atmost(nums, goal) - atmost(nums, goal - 1); 
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,0,1};
        int goal = 2;
        System.out.println(number_subarrays(nums, goal));
    }
}
