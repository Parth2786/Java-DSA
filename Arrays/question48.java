package Arrays;
import java.util.*;
public class question48 {
    public static int find_Content_Children(int[] g, int[] s){
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
        System.out.println(find_Content_Children(g, s));
    }
}
