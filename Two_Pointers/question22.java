package Two_Pointers;

public class question22 {

    // This is the leetcode question number 80 in which we have to remove the element which is more than two time in the array mean we have to keep the each element only twice not more than that.

    public static int remove_duplicate(int[] nums){
        int i = 0;
        for (int n : nums) {
            if (i < 2 || n > nums[i - 2]) {
                nums[i] = n;
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        System.out.println(remove_duplicate(nums));
    }
}
