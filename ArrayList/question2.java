package ArrayList;

import java.util.*;

public class question2 {
    public static List<List<Integer>> pascal_triangle(int n){
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>()); 
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    list.get(i).add(1);
                }
                else{
                    int val = list.get(i - 1).get(j - 1) + list.get(i - 1).get(j);
                    list.get(i).add(val);
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> ans = pascal_triangle(n);
        System.out.println(ans);
    }
}
