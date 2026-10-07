package Two_Pointers;
import java.util.*;
public class question21 {

    // This is the question number 2491 on leetcode in which we have to return the sum of the chemistry of the aray skills.

    public static long divide_player(int[] skills){
        Arrays.sort(skills);
        int n = skills.length;
        int left = 0;
        int right = n - 1;
        int teamsum = skills[left] + skills[right];
        long chemistry = 0;
        while (left < right) {
            if (skills[left] + skills[right] != teamsum) {
                return -1;
            }
            chemistry += (long) skills[left] * skills[right];
            left++;
            right--;
        }
        return chemistry;
    }

    public static void main(String[] args) {
        int[] skills = {3,2,5,1,3,4};
        System.out.println(divide_player(skills));
    }
}
