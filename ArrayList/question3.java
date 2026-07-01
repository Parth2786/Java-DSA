package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class question3 {
    public static List<Integer> pascal_triangle_2(int rowIndex){
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i <= rowIndex; i++){
            list.add(new ArrayList<>());
            for(int j = 0; j <= i; j++){
                if(j == 0 || i == j){
                    list.get(i).add(1);
                }
                else{
                    int val = list.get(i - 1).get(j - 1) + list.get(i - 1).get(j);
                    list.get(i).add(val);
                }
            }
        }
        return list.get(rowIndex);
    }
    public static void main(String[] args) {
        int rowIndex = 3;
        List<Integer> ans = pascal_triangle_2(rowIndex);
        System.out.println(ans);
    }
}
