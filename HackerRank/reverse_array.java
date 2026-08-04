package HackerRank;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class reverse_array {
    public static List<Integer> reverse_Array(List<Integer> a){
        List<Integer> reverse = new ArrayList<>();
        for (int i = a.size() -  1; i >= 0; i--) {
            reverse.add(a.get(i));
        }
        return reverse;
    }
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1,2,3);
        List<Integer> ans = reverse_Array(a);
        System.out.println(ans);
    }
}
