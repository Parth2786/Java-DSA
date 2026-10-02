package Two_Pointers;

public class question9 {

    // This is the leetcode question number 26 in which we have to remove the duplicates from the sorted array.
    public static int remove_duplicates(int[] nums){
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }


    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(remove_duplicates(nums));
    }
}
