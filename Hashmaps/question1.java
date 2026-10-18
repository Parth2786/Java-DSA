package Hashmaps;
import java.util.*;

public class question1 {

    // This is the leetcode question number 128 in which we have to find the longest consecutive element streak.

    public static int longest_streak(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int longest = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentnum = num;
                int currentstreak = 1;
                while (set.contains(currentnum + 1)) {
                    currentnum++;
                    currentstreak++;
                }
                longest = Math.max(currentstreak, longest);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longest_streak(nums));
    }
}
