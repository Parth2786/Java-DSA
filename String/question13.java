package String;

import java.util.*;

public class question13 {
    public static String largest_number(int[] num){
        String[] arr = new String[num.length];
        for (int i = 0; i < num.length; i++) {
            arr[i] = String.valueOf(num[i]);
        }
        Arrays.sort(arr, (a,b) -> (b + a).compareTo(a + b));
        if (arr[0].equals("0")) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (String string : arr) {
            sb.append(string);
        }
        return sb.toString();
        
    }
    public static void main(String[] args) {
        int[] num = {10,2};
        System.out.println(largest_number(num));

    }
}
