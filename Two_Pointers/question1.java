package Two_Pointers;
import java.util.*;
public class question1 {

    // This is the question in which we have to reverse the string.
    // Leetcode question number 344.
    public static void reverse_string(char[] s){
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            right--;
            left++;
        }
        
    }
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverse_string(s);
        System.out.println(Arrays.toString(s));
    }
}
