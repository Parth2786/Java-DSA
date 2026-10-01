package Two_Pointers;

public class question5 {
    
    // This is the leetcode question number 167 in which we have to return the index of the two element whose sum is equal to the target.
    public static int[] two_sum(int[] nums,int target){
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[] {left + 1, right + 1};
            }
            else if (sum < target) {
                left++;
            }
            else{
                right--;
            }
        }
        return new int[] {};
    }


    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ans = two_sum(nums, target);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
