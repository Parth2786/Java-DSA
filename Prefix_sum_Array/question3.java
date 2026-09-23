package Prefix_sum_Array;

public class question3 {
    int[] prefix;
    public void NumArray(int[] nums){
        prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
    }
    public int sumRange(int left, int right){
        if (left == 0) {
            return prefix[right];
        }
        return prefix[right] - prefix[left - 1];
    }

    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        question3 obj = new question3();
        obj.NumArray(nums);  
        System.out.println("Sum of range (0,2): " + obj.sumRange(0, 2)); 
        System.out.println("Sum of range (2,5): " + obj.sumRange(2, 5)); 
        System.out.println("Sum of range (0,5): " + obj.sumRange(0, 5));
    }
}
