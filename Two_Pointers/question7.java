package Two_Pointers;

public class question7 {

    // This is the question number 27 on the leetcode in which we have to remove the element from the array and return the number of element that are present after removing the element.
    public static int remove_element(int[] nums,int val){
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        System.out.println(remove_element(nums, val));
    }
}
