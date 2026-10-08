package Two_Pointers;

public class question23 {

    // This is the leetcode question number 845 in which we have to return the length of the largest mountain array if existed if not then return 0.

    public static int largest_mountain_array(int[] nums){
        int n = nums.length;
        int ans = 0;
        int i = 1;
        while (i < n - 1) {
            if (n <= 3) {
                return 0;
            }
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                    int left = i;
                    int right = i;
                    while (left > 0 && nums[left] > nums[left - 1]) {
                        left--;
                    }
                    while (right < n - 1 && nums[right] > nums[right + 1]) {
                        right++;
                    }
                    ans = Math.max(ans, right - left + 1);
                    i = right;
            }
            else{
                i++;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] nums = {2,2,2};
        System.out.println(largest_mountain_array(nums));
    }
}
