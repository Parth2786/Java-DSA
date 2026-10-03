package Striver;
import java.util.*;
public class question3 {

    // This is the leetcode question number 229 in which we have to find the majority element 2.
    
    // The majority element 2 is the integer that appear more than [ n/3 ] times.

    // We will be using the same boyer moore algorithm in this question also but this is slightly different from the majority element in that question there is possiblity of only 1 element to be majority element but in this question there are possiblity of two majority element can occur in the array.


    public static List<Integer> majority_element_2(int[] nums) {
        int n = nums.length;
        int candidate1 = 0;
        int candidate2 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (candidate2 == num) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            }
            else if (num == candidate2) {
                count2++;
            }
        }
        List<Integer> ans = new ArrayList<Integer>();
        if (count1 > n / 3) {
            ans.add(candidate1);
        }
        if (count2 > n / 3) {
            ans.add(candidate2);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 1, 1, 3, 2 };
        System.out.println(majority_element_2(nums));
    }
}
