package Two_Pointers;

public class question4 {

    // This is the leetcode question number 977 in which we have to return the array after squaring the each number from the array and also by sorting it after doing square.
    public static int[] square_array(int[] nums){
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int pos = n - 1;
        while (left <= right) {
            int left_sqr = nums[left] * nums[left];
            int right_sqr = nums[right] * nums[right];
            if (left_sqr > right_sqr) {
                result[pos] = left_sqr;
                left++;
            }
            else{
                result[pos] = right_sqr;
                right--;
            }
            pos--;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] ans = square_array(nums);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
