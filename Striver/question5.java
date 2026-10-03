package Striver;

public class question5 {

    // This is the question in which we have to sort the array of nums which has only 0's 1's and 2's.

    // To solve this question we will use the Dutch National flag algorithm.
    // Where we will use the three pointers low, mid, high.
    
    public static void sort_array(int[] nums){
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                mid++;
                low++;
            }
            else if (nums[mid] == 1) {
                mid++;
            }
            else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,0,2,1,0};
        sort_array(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
