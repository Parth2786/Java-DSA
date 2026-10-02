package Two_Pointers;
import java.lang.reflect.Array;
import java.util.*;
public class question12 {

    // This is the question number 455 on leetcode in which we have to assign the cookies to the children accorsing to their greedy factor.
    public static int assign_cookies(int[] g, int[] s){
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                count++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return count;
        
    }


    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {1,1};
        System.out.println(assign_cookies(g, s));
    }
}
